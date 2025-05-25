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


public class ImpresoraFoliosOriginal implements PdfCreator {

    @Override
    public void imprimirFolios(PdfDocument pdfAFoliar, Settings settings) {
        // Lógica básica de creación de PDF
        try (Document document = new Document(pdfAFoliar)) {
            int totalPaginas = pdfAFoliar.getNumberOfPages();
            int numeroPilas = Settings.getFoliosPorHoja();
            float fontSize = settings.getFontSize();
            Color fontColor = new DeviceRgb(Settings.getColor().getRed(), Settings.getColor().getGreen(), Settings.getColor().getBlue());



            for (int pagina = 1; pagina <= totalPaginas; pagina++) {
                // Condición para agregar una página en blanco solo si no es la primera página
                if (pagina > 1) {
                    document.add(new AreaBreak());
                }

                for (int tab = 0; tab < numeroPilas; tab++) {
                    int folio = (pagina - 1) * numeroPilas * 1 + tab * 1 + Settings.getFolioInicial();



                    // Obtener las coordenadas del array y ajustar según tus necesidades
                    Coordenadas coordenada;

                    // Verificar si hay coordenadas disponibles para el índice actual
                    if (tab < settings.getCoordenadas().length) {
                        coordenada = settings.getCoordenadas()[tab];
                    } else {
                        System.out.println("No hay coordenadas disponibles para el tab " + tab);
                        // Puedes manejar el error de coordenadas aquí según tus necesidades
                        continue;  // Saltar a la siguiente iteración del bucle
                    }




                    // Crear un nuevo párrafo con el número de folio en formato de texto
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
    }





}
