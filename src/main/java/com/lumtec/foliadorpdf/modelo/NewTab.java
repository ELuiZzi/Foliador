package com.lumtec.foliadorpdf.modelo;

import com.lumtec.foliadorpdf.interfaz.Foliador;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class NewTab {

    // Cambio arquitectónico: Iniciamos en 0 para generar el Folio 1 dinámicamente
    private static int nTab = 0;

    private static final JPanel[] mesasTrabajo = new JPanel[NewTabUtil.maxTabs];

    private final JPanel barraPestanias = Foliador.barraPestanias;
    private final JPanel worktable = Foliador.workspace;

    public NewTab() {
        // Se elimina la vinculación forzada a Foliador.mesaTrabajo0
    }

    public void nuevoFolio() {
        if (nTab < NewTabUtil.maxTabs) {
            this.crearPestania();
            this.crearMesaTrabajo();

            // Forzar a que la mesa de trabajo recién creada se muestre en pantalla
            agregarMesaTrabajo(getMesaTrabajo(nTab));

            nTab++;
        }
    }

    private void crearPestania() {
        JPanel pestania = new JPanel();
        JLabel titulo = new JLabel("Folio " + (nTab + 1));
        titulo.setForeground(NewTabUtil.BACKGROUND_LABEL);

        pestania.setName(Integer.toString(nTab));
        pestania.setLayout(new AbsoluteLayout());
        pestania.setBackground(NewTabUtil.BACKGROUND_TAB);
        pestania.add(titulo, new AbsoluteConstraints(7, 7));
        pestania.setVisible(true);

        pestania.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index = Integer.parseInt(pestania.getName());
                agregarMesaTrabajo(getMesaTrabajo(index));
            }
        });

        agregarPestania(pestania);
    }

    private void crearMesaTrabajo() {
        int ejeYField = 75;
        int widthField = 110;
        int heigthField = 25;

        JPanel mesaTrabajo = new JPanel();

        JTextField cX = new JTextField(String.valueOf(nTab + 1));
        JTextField cY = new JTextField(String.valueOf(nTab + 1));

        cX.setHorizontalAlignment(JTextField.CENTER);
        cY.setHorizontalAlignment(JTextField.CENTER);

        KeyAdapter controlTeclado = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
                    manejarIncrementoPosicional((JTextField) e.getSource(), e.getKeyCode());
                    e.consume();
                }
            }
        };

        cX.addKeyListener(controlTeclado);
        cY.addKeyListener(controlTeclado);

        mesaTrabajo.setLayout(new AbsoluteLayout());
        mesaTrabajo.setBackground(NewTabUtil.BACKGROUND_MESA_TRABAJO);

        mesaTrabajo.add(cX, new AbsoluteConstraints(120, ejeYField, widthField, heigthField));
        mesaTrabajo.add(cY, new AbsoluteConstraints(280, ejeYField, widthField, heigthField));

        asignarMesaTrabajo(mesaTrabajo);
    }

    private void manejarIncrementoPosicional(JTextField field, int keyCode) {
        try {
            String text = field.getText();
            int caretPos = field.getCaretPosition();

            if (text.isEmpty()) return;

            int targetPos = caretPos;
            if (targetPos == text.length()) {
                targetPos = text.length() - 1;
            }

            int decimalIndex = text.indexOf('.');
            int power = 0;
            int decimalPlaces = 0;

            if (decimalIndex == -1) {
                power = text.length() - 1 - targetPos;
            } else {
                // Contar cuántos decimales existen actualmente
                decimalPlaces = text.length() - 1 - decimalIndex;

                if (targetPos < decimalIndex) {
                    power = decimalIndex - 1 - targetPos;
                } else if (targetPos > decimalIndex) {
                    power = decimalIndex - targetPos;
                } else {
                    return;
                }
            }

            float increment = (float) Math.pow(10, Math.max(0, power));
            if(power < 0) increment = (float) Math.pow(10, power);

            float currentValue = Float.parseFloat(text);

            if (keyCode == KeyEvent.VK_UP) {
                currentValue += increment;
            } else if (keyCode == KeyEvent.VK_DOWN) {
                currentValue -= increment;
            }

            currentValue = Math.round(currentValue * 10000f) / 10000f;

            String newText;
            // Solución: Forzar el formato para mantener los ceros decimales si existían
            if (decimalPlaces > 0) {
                newText = String.format(Locale.US, "%." + decimalPlaces + "f", currentValue);
            } else {
                newText = String.format(Locale.US, "%.0f", currentValue);
            }

            field.setText(newText);

            int newCaretPos = caretPos + (newText.length() - text.length());
            field.setCaretPosition(Math.max(0, Math.min(newCaretPos, newText.length())));

        } catch (NumberFormatException ex) {
            // Ignorar eventos si no es un número calculable
        }
    }

    private void agregarPestania(JPanel pestania) {
        int ubicacionX = nTab * 90;
        barraPestanias.add(pestania, new AbsoluteConstraints(ubicacionX, 0, 90, 30));
        barraPestanias.revalidate();
        barraPestanias.repaint();
    }

    public void agregarMesaTrabajo(JPanel mesaTrabajo) {
        worktable.removeAll();
        worktable.add(mesaTrabajo, new AbsoluteConstraints(0, 0, 510, 500));
        worktable.revalidate();
        worktable.repaint();
    }

    private void asignarMesaTrabajo(JPanel panel) {
        NewTab.mesasTrabajo[nTab] = panel;
    }

    public static JPanel getMesaTrabajo(int index) {
        return NewTab.mesasTrabajo[index];
    }

    // Método para purgar la memoria estática antes de cargar un archivo JSON
    public static void resetTabs() {
        nTab = 0;
        for (int i = 0; i < mesasTrabajo.length; i++) {
            mesasTrabajo[i] = null;
        }
    }

}