package com.lumtec.foliadorpdf;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.pdfa.PdfADocument;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class CrearPdf {

    private final String TEMP_FILE = "tempFile.pdf";

    PdfReader pdfOrifinal;
    PdfWriter pdfFinal;
    PdfDocument PdfAFoliar;
    private Settings settings;

    public CrearPdf(Settings settings) {
        this.settings = settings;

        //Verificar si se tiene que multiplicar alguna página del PDF Orginal
        if (Settings.isDuplicarPDF()) {
            int totalFolios = (settings.getFolioFinal() - settings.getFolioInicial()) + 1;
            int totalPaginas = totalFolios / settings.getFoliosPorHoja();
            PdfAFoliar = multiplicarPagina(1, totalPaginas);
        } else {
            try {
                PdfAFoliar = setPdfOrifinal(Settings.getUbicacionPdfOriginal());
            } catch (IOException ex) {
                Mensaje.mensaje("El Documento tiene un problema, verifica que el PDF.");
            } finally {

            }
        }

        //Finally, crear el PDF Final
        try {
            crearPDF(PdfAFoliar);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /*Define el tamaño del area de corte de la hoja, que por default está en tamaño Carta.
    Cada que se ejecut un AreaBreak, se pasa a la siguiente hoja
     */
    AreaBreak areaBreak = new AreaBreak(PageSize.LETTER);

    public void crearPDF(PdfDocument pdfAFoliar) throws IOException {

        /*Nuevo objeto del tipo Documento, el cual se puede editar
        Como argumento recibe el PdfOrificnal, y la ubicacion del PDF final
         */
        Document document = new Document(pdfAFoliar);

        //Ciclo for para agregar folios, con duración del número de Folio totales
        
        
    }

    /*Metodo que selecciona la ruta del PDF original
    Recibe como argumento, la ubicacion en donde está el archivo
     */
    public PdfDocument setPdfOrifinal(File ubicacion) throws IOException {

        PdfDocument pdfDoc = null; //Variable que retornará

        try {
            pdfDoc = new PdfDocument(new PdfReader(ubicacion));
        } catch (com.itextpdf.io.IOException ex) {
            JOptionPane.showMessageDialog(null, "El archivo seleccionado no es un archivo PDF");
        }

        //Retorna el PDFDocument, con las rutas ya asginadas.
        return pdfDoc;

        //Se crea un try-catch, por si da erros, nuevamente se lleva a cabo la busqueda.
    }

    /*
    Metodo que multiplica una pagina del PDF Original, la cual se foliará posteriormente
    El primer argumento, es el número de página que se va a ducplicar
    El segundo argumento, indica el número de veces que se va a multiplicar la página
     */
    private PdfDocument multiplicarPagina(int pagDuplicada, int numeroMultiplicaciones) {
        PdfDocument outputPdf = null;
        try {

            //Pdf con las paginas duplicadas, es decir, una especie de PDF Final, pero sin folios.
            //Iniciar un try, por si llega a haber un error
            try ( PdfDocument inputPdf = setPdfOrifinal(Settings.getUbicacionPdfOriginal())) {
                outputPdf = new PdfDocument(new PdfWriter(Settings.getRuta() + this.TEMP_FILE));
                //Copiar la primer pagina
                PdfPage page = inputPdf.getPage(pagDuplicada);
                //Ciclo for, para agregar la pagina el numero de veces que sea necesario-
                for (int i = 0; i < numeroMultiplicaciones; i++) {

                    //Pegar la pagina [page] en el documento de salida.
                    outputPdf.addPage(page.copyTo(outputPdf));
                }
            }

            outputPdf.close();

            System.out.println("Pdf Temporal Creado");

        } catch (IOException ex) {
        }
        return outputPdf;
    }
}
