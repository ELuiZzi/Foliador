package com.lumtec.foliadorpdf.creacion.plantillas;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.lumtec.foliadorpdf.creacion.Settings;

import java.io.IOException;

public interface PdfCreator {
    void imprimirFolios(PdfDocument pdfAFoliar, Settings settings) throws IOException;
}