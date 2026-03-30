package com.lumtec.foliadorpdf.creacion.plantillas;

import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.lumtec.foliadorpdf.creacion.Settings;
import com.lumtec.foliadorpdf.modelo.Coordenadas;
import com.lumtec.foliadorpdf.modelo.RellenoCeros;

import java.util.List;

public class ImpresoraFolios implements PdfCreator {

    @Override
    public void imprimirFolios(PdfDocument pdfAFoliar, Settings settings) {
        int totalNumeros = settings.getTotalNumeros();
        int numeroPilas = Settings.getFoliosPorHoja();
        int numeroInicial = Settings.getFolioInicial();
        int numeroFinal = Settings.getFolioFinal();

        List<List<Integer>> pilas = AgruparNumeros.agruparEnPilas(totalNumeros, numeroPilas, numeroInicial);

        try (Document document = new Document(pdfAFoliar)) {
            int nivel = 0;
            boolean hayMasElementos = true;
            float fontSize = settings.getFontSize();
            Color fontColor = new DeviceRgb(Settings.getColor().getRed(), Settings.getColor().getGreen(), Settings.getColor().getBlue());

            int folioActual = numeroInicial;

            while (hayMasElementos && folioActual <= numeroFinal) {
                hayMasElementos = false;

                // iText maneja las páginas comenzando desde 1.
                // El nivel 0 corresponde a la página 1, el nivel 1 a la página 2, etc.
                int numeroDePagina = nivel + 1;

                for (int tab = 0; tab < pilas.size(); tab++) {
                    List<Integer> pilaActual = pilas.get(tab);
                    if (nivel < pilaActual.size()) {
                        int folio = pilaActual.get(nivel);

                        if (folio <= numeroFinal) {
                            hayMasElementos = true;

                            Coordenadas coordenada;
                            if (tab < settings.getCoordenadas().length) {
                                coordenada = settings.getCoordenadas()[tab];
                            } else {
                                System.out.println("Error en sistema: No hay coordenadas para el tab " + tab);
                                continue;
                            }

                            Paragraph folioParagraph = new Paragraph(RellenoCeros.rellenarCeros(folio));
                            folioParagraph.setFontSize(fontSize);
                            folioParagraph.setBold();
                            folioParagraph.setFontColor(fontColor);

                            // Inyección directa a la página requerida (Solución a la hoja en blanco)
                            folioParagraph.setFixedPosition(numeroDePagina, coordenada.getX(), coordenada.getY(), 50);

                            document.add(folioParagraph);
                        }
                    }
                }
                nivel++;
            }
        }
    }
}