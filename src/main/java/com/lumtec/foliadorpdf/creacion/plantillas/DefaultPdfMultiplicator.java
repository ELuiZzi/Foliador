package com.lumtec.foliadorpdf.creacion.plantillas;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.lumtec.foliadorpdf.creacion.Settings;

import java.io.File;
import java.io.IOException;


//ESTA CLASE SE ENCARGA DE MULTIPLICAR EL NÚMERO DE PÁGINAS NECESARIAS, UTILIZAR LA RUTA DEL PDF, EL NÚMERO DE VECES QUE SE VA A MULTIPLICAR, Y EL NOMBRE
public class DefaultPdfMultiplicator implements PdfMultiplicator {
    @Override
    public PdfDocument multiplyPdf(File originalPdfPath, int multiplicacion, String nombre) {
        PdfDocument outputPdf = null;
        try {
            // Pdf con las páginas duplicadas, es decir, una especie de PDF final, pero sin folios.
            // Iniciar un try, por si llega a haber un error
            try (PdfDocument inputPdf = new PdfDocument(new PdfReader(originalPdfPath))) {
                String TEMP_FILE = " Multi.pdf";
                outputPdf = new PdfDocument(new PdfWriter(Settings.getRuta() + nombre + TEMP_FILE));
                // Copiar la primera página
                PdfPage page = inputPdf.getPage(1);
                // Ciclo for, para agregar la página el número de veces que sea necesario
                for (int i = 0; i < multiplicacion; i++) {
                    // Pegar la página [page] en el documento de salida.
                    outputPdf.addPage(page.copyTo(outputPdf));
                }
            }

            // No cierres el documento aquí, ya que se utilizará posteriormente para foliar.

            System.out.println("Pdf Temporal Creado");

        } catch (IOException ex) {
            // Manejar la excepción si es necesario
            ex.printStackTrace();
        }
        return outputPdf;
    }

}

