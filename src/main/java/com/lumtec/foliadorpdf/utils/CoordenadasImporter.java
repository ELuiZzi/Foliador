package com.lumtec.foliadorpdf.utils;

import com.google.gson.Gson;
import com.lumtec.foliadorpdf.modelo.Coordenadas;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CoordenadasImporter {

    public static List<Coordenadas> importarCoordenadas(String archivo) {
        try (FileReader reader = new FileReader(archivo)) {
            Gson gson = new Gson();
            // Solución al Type Erasure: Parsear como un Array estricto y luego convertir a Lista
            Coordenadas[] arrayCoordenadas = gson.fromJson(reader, Coordenadas[].class);
            System.out.println("Coordenadas importadas correctamente desde " + archivo);

            return Arrays.asList(arrayCoordenadas);
        } catch (IOException e) {
            System.err.println("Error al importar coordenadas: " + e.getMessage());
            return null;
        }
    }
}