package com.lumtec.foliadorpdf;

import com.itextpdf.kernel.colors.Color;
import java.io.File;
import javax.swing.JFileChooser;

public class Settings {

    /*
    Los valores estáticos, son para las configuraciones que no se aplican indirectamente, ej. Color, se aplica en una ventan externa
     */
    private static File ubicacionPdfOriginal;
    private static String nombreArchivo;
    private static String ruta;

    //Secuencia es si los folios van en orden consecutivo, o si se repite el mismo numero en los folios de la mismo hoja
    //True es consecutivo, false es repetido
    private static boolean secuenciaConsecutiva = true;

    //Si es la misma página la que se va a foliar, se tiene que multiplicar el numero de folios que necestiemos.
    //True es multiplicar hojas, false es foliar las hojas que viene en el PDF
    private static boolean duplicarPDF = true;

    //Ventana se administrador de archivos, para seleccionar el PDF original
    static JFileChooser fileChooser = new JFileChooser();

    private int foliosPorHoja;

    //En que número va a iniciar y terminar los folios
    private int folioInicial;
    private int folioFinal;

    private Coordinates[] coordenadas;

    //Tamaño de la fuente
    float fontSize;

    //Color del texto del folio
    private static Color fontColor;

    public Settings(String nombreArchivo, int folioInicial, int folioFinal, int fontSize, int foliosPorHoja) {
        Settings.nombreArchivo = nombreArchivo;
        this.folioInicial = folioInicial;
        this.folioFinal = folioFinal;
        this.foliosPorHoja = foliosPorHoja;

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

    public int getFoliosPorHoja() {
        return foliosPorHoja;
    }

    public int getFolioInicial() {
        return folioInicial;
    }

    public int getFolioFinal() {
        return folioFinal;
    }

    public float getFontSize() {
        return fontSize;
    }

    public static void setFontColor(Color color) {
        Settings.fontColor = color;
    }

    public static Color getFontColor() {
        return fontColor;
    }

    public static void setSecuenciaConsecutiva(boolean secuencia) {
        Settings.secuenciaConsecutiva = secuencia;
    }

    public static boolean getSecuenciaConsecutiva() {
        return Settings.secuenciaConsecutiva;
    }

    public static boolean isDuplicarPDF() {
        return duplicarPDF;
    }

    public static void setDuplicarPDF(boolean duplicarPDF) {
        Settings.duplicarPDF = duplicarPDF;
    }

    public Coordinates[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordinates[] coordenadas) {
        this.coordenadas = coordenadas;
    }

    //Abrir cuadro de busqueda, con filro de seleccion de archivos
    private static JFileChooser cuadroBusqueda() {
        Settings.fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.showSaveDialog(null);
        fileChooser.setAcceptAllFileFilterUsed(false);
        return Settings.fileChooser;
    }

}
