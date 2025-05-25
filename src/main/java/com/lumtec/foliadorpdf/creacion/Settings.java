package com.lumtec.foliadorpdf.creacion;

import java.awt.Color;

public class ConfiguracionPDF {
    private String rutaPDFOriginal;
    private int folioInicial;
    private int folioFinal;
    private int tamanoFuente;
    private Color colorFuente;
    private boolean foliarUnaPagina;
    private int foliosPorHoja;

    // Constructor
    public ConfiguracionPDF(String rutaPDFOriginal, int folioInicial, int folioFinal, int tamanoFuente,
                            Color colorFuente, boolean foliarUnaPagina, int foliosPorHoja) {
        this.rutaPDFOriginal = rutaPDFOriginal;
        this.folioInicial = folioInicial;
        this.folioFinal = folioFinal;
        this.tamanoFuente = tamanoFuente;
        this.colorFuente = colorFuente;
        this.foliarUnaPagina = foliarUnaPagina;
        this.foliosPorHoja = foliosPorHoja;
    }

    // Getters y Setters
    // ...

    // Otros métodos según sea necesario
}



