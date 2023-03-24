package com.lumtec.foliadorpdf;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import java.io.IOException;
import javax.swing.JFileChooser;

public class PDFCreacion {

    Settings set = new Settings();
    Coordinates coord = new Coordinates();
    //Declaración de variables
    static String entrada, ruta, salida, pdfMomentaneo;

    public static String getPdfMomentaneo() {
        return pdfMomentaneo;
    }

    public static void setPdfMomentaneo(String pdfMomentaneo) {
        PDFCreacion.pdfMomentaneo = pdfMomentaneo;
    }
    static JFileChooser fileChooser = new JFileChooser();

    public static String getEntrada() {
        return entrada;
    }

    public static void setEntrada(String entrada) {
        PDFCreacion.entrada = entrada;
    }

    public static String getRuta() {
        return ruta;
    }

    public static void setRuta(String ruta) {
        PDFCreacion.ruta = ruta;
    }

    public static String getSalida() {
        return salida;
    }

    public static void setSalida(String salida) {
        PDFCreacion.salida = salida;
    }

    public PDFCreacion() {

    }

    static String combrobarCeros(int i) {
        String ceros = null;
        if (i < 10) {
            ceros = "000";
        } else if (i < 100) {
            ceros = "00";
        } else if (i < 1000) {
            ceros = "0";
        } else if (i < 1000000) {
            ceros = "";
        } else {
            ceros = "";
        }
        return ceros;
    }

    public static void selectPDF(String nombre) {

        if (getRuta() == null) {
            PDFCreacion.fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            fileChooser.showSaveDialog(null);
            fileChooser.setAcceptAllFileFilterUsed(false);

            if (getEntrada() == null) {
                setEntrada(fileChooser.getSelectedFile().toString());
                setRuta(fileChooser.getCurrentDirectory().toString());
                setPdfMomentaneo(getRuta() + "\\mom.pdf");
                setSalida(getRuta() + "\\Folio " + nombre + ".pdf");
            }
        }

    }

    public static void agregarPáginas(int NoDeFolios, int FoliosXHoja) throws Exception {
        //Seleccionamos el PDF original, al que se le agregaran la información
        PdfDocument orig = new PdfDocument(new PdfReader(getEntrada()));
        //Creamos un documento con el número de páginas necesarias (365)
        PdfDocument desti = new PdfDocument(new PdfWriter(getPdfMomentaneo()));
        //Seleccionamos la página que vamos a duplicar
        PdfPage origPage = orig.getPage(1);
        float numberOfPages = (float) NoDeFolios / (float) FoliosXHoja;

        //Mientras que la variable sea mas pequeña que el numero de páginas, seguirá creando páginas
        for (int i = 1; i <= Math.ceil(numberOfPages); i++) {
            desti.addPage(origPage.copyTo(desti));
        }
        desti.close();
    }

    public void PdfClásico() throws IOException {

        PdfReader original = new PdfReader(getPdfMomentaneo());
        PdfWriter destino = new PdfWriter(getSalida());
        String ceros;

        PdfDocument PdfFoliado = new PdfDocument(original, destino);

        Document documento = new Document(PdfFoliado);

        AreaBreak areaBreak = new AreaBreak(PageSize.LETTER);

        //Fuente
        PdfFont Times_Bold = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);

        Text text = new Text("");

        text.setFont(Times_Bold);
        text.setFontSize(set.getFontSize());
        text.setFontColor(set.getColor());

        for (int a = getFolioIni(); a <= getFolioFin(); a++) {
            if (isFolio1() == true) {
                ceros = combrobarCeros(a);
                text.setText(ceros + Integer.toString(a));
                text.setRelativePosition(coord.getX1(), y1, 0, 0);
                documento.add(new Paragraph(text));
            }
            if (isFolio2() == true) {
                a++;
                ceros = combrobarCeros(a);
                text.setText(ceros + Integer.toString(a));
                text.setRelativePosition(coord.getX2(), y2, 0, 0);
                documento.add(new Paragraph(text));
            }
            if (isFolio3() == true) {
                a++;
                ceros = combrobarCeros(a);
                text.setText(ceros + Integer.toString(a));
                text.setRelativePosition(coord.getX3(), y3, 0, 0);
                documento.add(new Paragraph(text));
            }
            if (isFolio4() == true) {
                a++;
                ceros = combrobarCeros(a);
                text.setText(ceros + Integer.toString(a));
                text.setRelativePosition(coord.getX4(), y4, 0, 0);
                documento.add(new Paragraph(text));
            }
            if (a < getFolioFin()) {
                documento.add(areaBreak);
            }

        }

        documento.close();
        PdfFoliado.close();

    }

    public void PdfDobleFolio() throws IOException {

        PdfReader original = new PdfReader(getEntrada());
        PdfWriter destino = new PdfWriter(getSalida());
        String ceros = null;

        PdfDocument PdfFoliado = new PdfDocument(original, destino);

        Document documento = new Document(PdfFoliado);

        AreaBreak areaBreak = new AreaBreak(PageSize.LETTER);

        //Fuente
        PdfFont Times_Bold = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);

        Text text = new Text("");

        text.setFont(Times_Bold);
        text.setFontSize(getFontSize());
        text.setFontColor(getColor());

        for (int a = getFolioIni(); a <= getFolioFin(); a++) {
            if (isFolio1() == true) {
                ceros = combrobarCeros(a);
                text.setText(ceros + Integer.toString(a));
                text.setRelativePosition(x1, y1, 0, 0);
                documento.add(new Paragraph(text));
            }
            if (isFolio2() == true) {

                ceros = combrobarCeros(a);
                text.setText(ceros + Integer.toString(a));
                text.setRelativePosition(x2, y2, 0, 0);
                documento.add(new Paragraph(text));
            }
            if (isFolio3() == true) {

                ceros = combrobarCeros(a);
                text.setText(ceros + Integer.toString(a));
                text.setRelativePosition(x3, y3, 0, 0);
                documento.add(new Paragraph(text));
            }
            if (isFolio4() == true) {

                ceros = combrobarCeros(a);
                text.setText(ceros + Integer.toString(a));
                text.setRelativePosition(x4, y4, 0, 0);
                documento.add(new Paragraph(text));
            }

            if (a < getFolioFin()) {
                documento.add(areaBreak);
            }
        }

        documento.close();

    }
}
