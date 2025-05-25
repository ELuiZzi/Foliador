package com.lumtec.foliadorpdf.creacion.plantillas;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.lumtec.foliadorpdf.creacion.Settings;

import java.io.File;
import java.io.IOException;

public class PDFDuplicator implements PdfMultiplicator{

    @Override
    public PdfDocument multiplyPdf(File originalPdfPath, int bug, String nombre) {
        PdfDocument outputPdf = null;

        try {
            // Iniciar un try-with-resources para asegurar el cierre adecuado de los recursos
            try (PdfDocument inputPdf = new PdfDocument(new PdfReader(originalPdfPath))) {
                String TEMP_FILE = " Duplicado.pdf";
                outputPdf = new PdfDocument(new PdfWriter(Settings.getRuta() + nombre + TEMP_FILE));

                // Ciclo for, para agregar todas las páginas del PDF original al documento de salida
                for (int pageNumber = 1; pageNumber <= inputPdf.getNumberOfPages(); pageNumber++) {
                    // Obtener la página actual del PDF original
                    PdfPage page = inputPdf.getPage(pageNumber);

                    // Agregar la página al documento de salida
                    outputPdf.addPage(page.copyTo(outputPdf));
                }
            }

            System.out.println("Pdf Temporal Creado");

        } catch (IOException ex) {
            // Manejar la excepción si es necesario
            ex.printStackTrace();
        }

        return outputPdf;
    }
}
