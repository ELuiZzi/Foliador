package com.lumtec.foliadorpdf.creacion;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.lumtec.foliadorpdf.creacion.plantillas.*;

import java.io.IOException;

public class CrearPdf {

    Settings settings;
    PdfDocument pdfAFoliar;

    public CrearPdf(Settings settings) {
        this.settings = settings;
    }

    public void crearPdf() {

        /* Primero se selecciona la opción que deseamos, ya sea que el PDF tenga que multiplicar las páginas o que el PDF ya venga con el número de páginas necesarias

         */
        if (Settings.isDuplicarPDF()) {
            try {
                PdfMultiplicator pdfMultiplicador = new DefaultPdfMultiplicator();
                pdfAFoliar = pdfMultiplicador.multiplyPdf(Settings.getUbicacionPdfOriginal(), settings.calcularCantidadHojas(), Settings.getNombreArchivo());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                PdfMultiplicator pdfDuplicator = new PDFDuplicator();
                pdfAFoliar = pdfDuplicator.multiplyPdf(Settings.getUbicacionPdfOriginal(), 0, Settings.getNombreArchivo());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /*
        Una vez seleccionada la opción se IMPRIMEN los folios sobre el PDF anterior
         */
        if (pdfAFoliar == null) {
            System.out.println("PdfAFoliar es nulo. Verifica la lógica de creación.");
        } else {
            // Utiliza ImpresoraFolios como una implementación de PdfCreator
            PdfCreator pdfCreator = new ImpresoraFolios();
            try {
                pdfCreator.imprimirFolios(pdfAFoliar, settings);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
