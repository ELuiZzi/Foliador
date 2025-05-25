package com.lumtec.foliadorpdf.modelo;

public class RellenoCeros {

    public static String rellenarCeros(int numero) {
        // Convertir el número a cadena
        String numeroStr = String.valueOf(numero);
        // Calcular la cantidad de ceros necesarios
        int cerosNecesarios = Math.max(0, 4 - numeroStr.length());

        // Rellenar con ceros a la izquierda
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cerosNecesarios; i++) {
            resultado.append('0');
        }

        // Agregar el número original
        resultado.append(numeroStr);


        // Devolver el resultado como cadena
        return resultado.toString();
    }

}
