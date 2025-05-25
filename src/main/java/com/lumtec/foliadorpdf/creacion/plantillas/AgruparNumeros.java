package com.lumtec.foliadorpdf.creacion.plantillas;

import java.util.ArrayList;
import java.util.List;

public class AgruparNumeros {
    public static List<List<Integer>> agruparEnPilas(int N, int P, int numeroInicial) {
        // Crear una lista de listas para las pilas
        List<List<Integer>> pilas = new ArrayList<>();
        for (int i = 0; i < P; i++) {
            pilas.add(new ArrayList<>());
        }

        // Calcular cuántos números tiene cada pila
        int numerosPorPila = N / P;
        int sobrantes = N % P;

        // Inicializar el contador de números con el número inicial
        int numero = numeroInicial;

        // Llenar las pilas con números
        for (int i = 0; i < P; i++) {
            // Determinar cuántos números irá en esta pila
            int cantidadEnPila = numerosPorPila + (i < sobrantes ? 1 : 0);  // Si hay sobrantes, añadir 1 a las primeras pilas

            // Añadir los números a la pila
            for (int j = 0; j < cantidadEnPila; j++) {
                pilas.get(i).add(numero);
                numero++;
            }
        }

        // Retornar las pilas agrupadas
        return pilas;
    }


    public static void imprimirPorNiveles(List<List<Integer>> pilas) {
        boolean hayMasElementos = true;
        int nivel = 0;

        while (hayMasElementos) {
            hayMasElementos = false;

            for (List<Integer> pila : pilas) {
                if (nivel < pila.size()) {
                    System.out.print(pila.get(nivel) + " ");
                    hayMasElementos = true;
                }
            }

            System.out.println(); // Agregar un salto de línea después de cada nivel
            nivel++; // Pasar al siguiente nivel de las pilas
        }
    }

}
