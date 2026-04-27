package com.lumtec.foliadorpdf.interfaz;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

public class LienzoRender extends JPanel {

    private BufferedImage imagenPagina;
    private float factorEscala = 1.0f;

    // Variables para guardar la posición exacta de la imagen en pantalla
    private int imgX = 0, imgY = 0, imgW = 0, imgH = 0;

    // Variables para la mira visual (Target)
    private int marcadorX = -1, marcadorY = -1;

    public LienzoRender() {
        setBackground(Color.DARK_GRAY);

        // --- EVENTOS DEL RATÓN PARA INTERACTIVIDAD ---
        MouseAdapter controlRaton = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                actualizarCoordenadas(e.getX(), e.getY());
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                actualizarCoordenadas(e.getX(), e.getY());
            }
        };

        addMouseListener(controlRaton);
        addMouseMotionListener(controlRaton);
    }

    public void cargarPDF(File archivoPdf) {
        // Resetear el marcador al cargar un nuevo archivo
        marcadorX = -1;
        marcadorY = -1;

        new Thread(() -> {
            try (PDDocument documento = PDDocument.load(archivoPdf)) {
                PDFRenderer renderer = new PDFRenderer(documento);
                // Renderizamos a 150 DPI para buena calidad de previsualización
                imagenPagina = renderer.renderImageWithDPI(0, 150);

                SwingUtilities.invokeLater(() -> {
                    this.revalidate();
                    this.repaint();
                });
            } catch (Exception e) {
                System.err.println("Error al leer el PDF: " + e.getMessage());
            }
        }).start();
    }

    // --- ALGORITMO DE MAPEO MATEMÁTICO ---
    private void actualizarCoordenadas(int mouseX, int mouseY) {
        if (imagenPagina == null || imgW == 0) return;

        // 1. Limitar el clic estrictamente dentro de los bordes de la hoja blanca
        int x = Math.max(imgX, Math.min(mouseX, imgX + imgW));
        int y = Math.max(imgY, Math.min(mouseY, imgY + imgH));

        // 2. Guardar posición para dibujar la mira roja
        marcadorX = x;
        marcadorY = y;
        repaint();

        // 3. Obtener coordenadas relativas a la esquina superior izquierda de la imagen
        int relX = x - imgX;
        int relY = y - imgY;

        // 4. Traducción a Puntos iText (Resolución base de 72 DPI)
        // Se compensa la escala de la ventana y los 150 DPI de la imagen
        float pdfX = (relX / factorEscala) * (72f / 150f);

        // Se invierte el eje Y porque iText empieza a contar desde abajo hacia arriba
        float pdfY = ((imgH - relY) / factorEscala) * (72f / 150f);

        // 5. Redondear a 2 decimales para limpieza visual
        pdfX = Math.round(pdfX * 100f) / 100f;
        pdfY = Math.round(pdfY * 100f) / 100f;

        // 6. Enviar a la interfaz gráfica principal
        enviarCoordenadasATabActivo(pdfX, pdfY);
    }

    private void enviarCoordenadasATabActivo(float x, float y) {
        try {
            // Buscamos la mesa de trabajo (pestaña) que está visible actualmente en pantalla
            if (Foliador.workspace.getComponentCount() > 0) {
                JPanel mesaActiva = (JPanel) Foliador.workspace.getComponent(0);

                // Extraemos las cajas de texto de X y Y dinámicamente
                javax.swing.JTextField cX = (javax.swing.JTextField) mesaActiva.getComponent(0);
                javax.swing.JTextField cY = (javax.swing.JTextField) mesaActiva.getComponent(1);

                // Formateamos para que si es un número entero exacto, no muestre el ".0"
                cX.setText(x % 1 == 0 ? String.valueOf((int)x) : String.valueOf(x));
                cY.setText(y % 1 == 0 ? String.valueOf((int)y) : String.valueOf(y));
            }
        } catch (Exception e) {
            System.err.println("No se pudo actualizar la mesa de trabajo: " + e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (imagenPagina != null) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

            float escalaX = (float) getWidth() / imagenPagina.getWidth();
            float escalaY = (float) getHeight() / imagenPagina.getHeight();
            factorEscala = Math.min(escalaX, escalaY);

            int anchoEscalado = (int) (imagenPagina.getWidth() * factorEscala);
            int altoEscalado = (int) (imagenPagina.getHeight() * factorEscala);

            // Guardamos las dimensiones actuales para el cálculo del ratón
            imgX = (getWidth() - anchoEscalado) / 2;
            imgY = (getHeight() - altoEscalado) / 2;
            imgW = anchoEscalado;
            imgH = altoEscalado;

            // Dibujar el PDF
            g2d.drawImage(imagenPagina, imgX, imgY, anchoEscalado, altoEscalado, this);

            // --- DIBUJAR LA MIRA (CROSSHAIR) ROJA ---
            if (marcadorX != -1 && marcadorY != -1) {
                g2d.setColor(Color.RED);
                // Líneas de la cruz
                g2d.drawLine(marcadorX - 12, marcadorY, marcadorX + 12, marcadorY);
                g2d.drawLine(marcadorX, marcadorY - 12, marcadorX, marcadorY + 12);
                // Círculo central
                g2d.drawOval(marcadorX - 6, marcadorY - 6, 12, 12);
            }
        }
    }
}