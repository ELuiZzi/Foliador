package com.lumtec.foliadorpdf.creacion;

import com.itextpdf.kernel.pdf.PdfDocument;

import java.io.IOException;

public interface PdfCreator {
    void createPDF(PdfDocument pdfAFoliar) throws IOException;
}
