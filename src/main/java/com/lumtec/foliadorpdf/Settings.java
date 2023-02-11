package com.lumtec.foliadorpdf;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.colors.Color;

public class Settings {

    public String name;

    public int nFoliosXHoja;

    public int folioIni;
    public int folioFin;

    public boolean orden;

    public int fontSize;
    public Color fontColor;

    public com.itextpdf.kernel.colors.Color getColor() {
        return this.fontColor;
    }

    public void setColor(java.awt.Color color) {
        this.fontColor = new DeviceRgb(color);
    }
}
