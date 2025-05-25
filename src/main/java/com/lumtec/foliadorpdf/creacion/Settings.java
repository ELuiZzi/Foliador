package com.lumtec.foliadorpdf.creacion;

import com.lumtec.foliadorpdf.modelo.Coordenadas;
import com.lumtec.foliadorpdf.modelo.NewTab;
import com.lumtec.foliadorpdf.modelo.NewTabUtil;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Settings {

    /*
    Los valores estáticos, son para las configuraciones que no se aplican indirectamente, ej. Color, se aplica en una ventan externa
     */
    private static File ubicacionPdfOriginal;
    private static String nombreArchivo;
    private static String ruta;

    //Secuencia es si los folios van en orden consecutivo, o si se repite el mismo numero en los folios de la mismo hoja
    //True es consecutivo, false es repetido

    //Si es la misma página la que se va a foliar, se tiene que multiplicar el numero de folios que necestiemos.
    //True es multiplicar hojas, false es foliar las hojas que viene en el PDF
    private static boolean duplicarPDF = true;

    //Aquí se almacenan las coordenadas

    //Ventana se administrador de archivos, para seleccionar el PDF original
    static JFileChooser fileChooser = new JFileChooser();

    private static int foliosPorHoja;



    //En que número va a iniciar y terminar los folios
    private static int folioInicial;
    private static int folioFinal;
    private static Color color;

    private Coordenadas[] coordenadas;

    //Tamaño de la fuente
    private static float fontSize;

    //Color del texto del folio

    public Settings(String nombreArchivo, int folioInicial, int folioFinal, float fontSize, int foliosPorHoja, Color color) {
        Settings.nombreArchivo = nombreArchivo;
        Settings.folioInicial = folioInicial;
        Settings.folioFinal = folioFinal;
        Settings.foliosPorHoja = foliosPorHoja;
        Settings.fontSize = fontSize;
        Settings.color = color;


        System.out.println("Configuracion Guardada");
    }

    public static File getUbicacionPdfOriginal() {
        return ubicacionPdfOriginal;
    }

    public static void setUbicacionPdfOriginal() {

        //Aparece la ventan del administrdor de archivos.
        Settings.cuadroBusqueda();

        Settings.ubicacionPdfOriginal = fileChooser.getSelectedFile();

        Settings.ruta = Settings.ubicacionPdfOriginal.getAbsolutePath().replaceAll(fileChooser.getSelectedFile().getName(), "");

        //Se asigna el nombre del archivo, remplazando su extensión
        Settings.nombreArchivo = Settings.ubicacionPdfOriginal.getName().replaceAll(".pdf", "");

    }

    public static String getNombreArchivo() {
        return Settings.nombreArchivo;
    }

    public static String getRuta() {
        return ruta;
    }

    public static int getFoliosPorHoja() {
        return foliosPorHoja;
    }

    public static int getFolioInicial() {
        return folioInicial;
    }

    public static Color getColor() {
        return color;
    }

    public static void setColor(Color color) {
        Settings.color = color;
    }

    public float getFontSize() {
        return fontSize;
    }

    public static void setSecuenciaConsecutiva() {
    }

    public static boolean isDuplicarPDF() {
        return duplicarPDF;
    }

    public static void setDuplicarPDF(boolean duplicarPDF) {
        Settings.duplicarPDF = duplicarPDF;
    }

    public Coordenadas[] getCoordenadas() {
        return coordenadas != null ? coordenadas : new Coordenadas[0];
    }


    public void setCoordenadas() {
        int numFolios = NewTabUtil.maxTabs;

        coordenadas = new Coordenadas[numFolios];

        for (int i = 0; i < numFolios; i++) {
            JPanel mesaTrabajo = NewTab.getMesaTrabajo(i);

            // Verificar que el panel no sea null antes de intentar acceder a sus componentes
            if (mesaTrabajo != null) {
                JTextField cX = (JTextField) mesaTrabajo.getComponent(0);
                JTextField cY = (JTextField) mesaTrabajo.getComponent(1);

                float x = Float.parseFloat(cX.getText());
                float y = Float.parseFloat(cY.getText());

                coordenadas[i] = new Coordenadas(x, y);
            } else {
                // Manejar el caso en que el panel es null
                coordenadas[i] = new Coordenadas(0, 0); // O alguna lógica predeterminada
            }
        }
    }

    //Abrir cuadro de busqueda, con filro de seleccion de archivos
    private static void cuadroBusqueda() {
        Settings.fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.showSaveDialog(null);
        fileChooser.setAcceptAllFileFilterUsed(false);
    }

    public int calcularCantidadHojas() {
        int totalFolios = folioFinal - folioInicial + 1;
        return (int) Math.ceil((double) totalFolios / foliosPorHoja);
    }

    public int getTotalNumeros() {
        return folioFinal - folioInicial + 1;
    }

    public static int getFolioFinal() {
        return folioFinal;
    }
}

