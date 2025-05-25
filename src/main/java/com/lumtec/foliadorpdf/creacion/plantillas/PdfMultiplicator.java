package com.lumtec.foliadorpdf.creacion.plantillas;

import com.itextpdf.kernel.pdf.PdfDocument;

import java.io.File;
import java.io.IOException;


public interface PdfMultiplicator {
    PdfDocument multiplyPdf(File originalPdfPath, int multiplicacion, String nombre) throws IOException;
}
