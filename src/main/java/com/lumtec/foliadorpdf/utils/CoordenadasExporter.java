package com.lumtec.foliadorpdf.utils;

import com.google.gson.Gson;
import com.lumtec.foliadorpdf.modelo.Coordenadas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CoordenadasExporter {

    public static void exportarCoordenadas(List<Coordenadas> coordenadasList, String archivo) {
        try (FileWriter writer = new FileWriter(archivo)) {
            // Crear el objeto Gson
            Gson gson = new Gson();
            // Convertir la lista de coordenadas a JSON
            String json = gson.toJson(coordenadasList);
            // Escribir el JSON al archivo
            writer.write(json);
            System.out.println("Coordenadas exportadas correctamente a " + archivo);
        } catch (IOException e) {
            System.err.println("Error al exportar coordenadas: " + e.getMessage());
        }
    }
}
