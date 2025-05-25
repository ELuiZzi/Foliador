package com.lumtec.foliadorpdf.creacion.plantillas;

import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Paragraph;
import com.lumtec.foliadorpdf.creacion.Settings;
import com.lumtec.foliadorpdf.modelo.Coordenadas;
import com.lumtec.foliadorpdf.modelo.RellenoCeros;

import java.util.List;

public class ImpresoraFolios implements PdfCreator {

    @Override
    public void imprimirFolios(PdfDocument pdfAFoliar, Settings settings) {
        // Obtener la cantidad de folios a imprimir (N) y cuántos por página (Pilas)
        int totalNumeros = settings.getTotalNumeros();
        int numeroPilas = Settings.getFoliosPorHoja();

        // Obtener el número inicial de las pilas
        int numeroInicial = Settings.getFolioInicial();  // Número inicial de folio, puedes modificarlo aquí

        // Generar las pilas con los números agrupados comenzando desde el número inicial
        List<List<Integer>> pilas = AgruparNumeros.agruparEnPilas(totalNumeros, numeroPilas, numeroInicial);

        // Lógica básica de creación de PDF
        try (Document document = new Document(pdfAFoliar)) {
            int nivel = 0;
            boolean hayMasElementos = true;
            float fontSize = settings.getFontSize();
            Color fontColor = new DeviceRgb(Settings.getColor().getRed(), Settings.getColor().getGreen(), Settings.getColor().getBlue());

            // Variables para definir el número inicial y final de los folios
            int numeroFinal = Settings.getFolioFinal();      // Número final de folio

            // Contador de folio actual, iniciando desde el número inicial
            int folioActual = numeroInicial;

            // Mientras haya más elementos en las pilas, se crearán nuevas páginas
            while (hayMasElementos && folioActual <= numeroFinal) {
                hayMasElementos = false;

                // Crear una nueva página
                if (nivel > 0) {
                    document.add(new AreaBreak());
                }

                // Imprimir los números de las pilas para el nivel actual
                for (int tab = 0; tab < pilas.size(); tab++) {
                    // Obtener el número de la pila actual para el nivel actual
                    List<Integer> pilaActual = pilas.get(tab);
                    if (nivel < pilaActual.size()) {
                        int folio = pilaActual.get(nivel);
                        // Verificar que el folio esté dentro del rango
                        if (folio <= numeroFinal) {
                            hayMasElementos = true; // Aún hay más elementos que imprimir

                            // Obtener las coordenadas para este tab
                            Coordenadas coordenada;

                            if (tab < settings.getCoordenadas().length) {
                                coordenada = settings.getCoordenadas()[tab];
                            } else {
                                System.out.println("No hay coordenadas disponibles para el tab " + tab);
                                continue;  // Saltar a la siguiente iteración si no hay coordenadas
                            }

                            // Crear el párrafo con el número de folio
                            Paragraph folioParagraph = new Paragraph(RellenoCeros.rellenarCeros(folio));
                            folioParagraph.setFontSize(fontSize);
                            folioParagraph.setBold();
                            folioParagraph.setFontColor(fontColor);

                            // Configurar la posición del párrafo usando las coordenadas del tab actual
                            folioParagraph.setFixedPosition(coordenada.getX(), coordenada.getY(), 50);

                            // Agregar el párrafo al documento
                            document.add(folioParagraph);
                        }
                    }
                }

                // Incrementar el nivel para la siguiente página
                nivel++;

                // Asegurarse de que no se exceda el número final
                if (folioActual > numeroFinal) {
                    break;
                }
            }
        }
    }
}
