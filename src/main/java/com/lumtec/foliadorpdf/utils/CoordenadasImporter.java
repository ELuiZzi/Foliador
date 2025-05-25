package com.lumtec.foliadorpdf.utils;

import com.google.gson.Gson;
import com.lumtec.foliadorpdf.modelo.Coordenadas;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CoordenadasImporter {

    public static List<Coordenadas> importarCoordenadas(String archivo) {
        try (FileReader reader = new FileReader(archivo)) {
            // Crear el objeto Gson
            Gson gson = new Gson();
            // Leer el JSON desde el archivo y convertirlo en una lista de coordenadas
            List<Coordenadas> coordenadasList = gson.fromJson(reader, List.class);
            System.out.println("Coordenadas importadas correctamente desde " + archivo);
            return coordenadasList;
        } catch (IOException e) {
            System.err.println("Error al importar coordenadas: " + e.getMessage());
            return null;
        }
    }
}
