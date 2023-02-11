package com.lumtec.foliadorpdf;

public class Coordinates {

    static float CM = 28.5714286f;
    static float UY = 29.6f; // Unidad "Y"

    static float x1, x2, x3, x4;
    static float y1, y2, y3, y4;

    public void setX1(float x1) {
        Coordinates.x1 = x1 * CM;
    }

    public void setX2(float x2) {
        Coordinates.x2 = x2 * CM;
    }

    public void setX3(float x3) {
        Coordinates.x3 = x3 * CM;
    }

    public void setX4(float x4) {
        Coordinates.x4 = x4 * CM;
    }

    public void setY1(float y1) {
        Coordinates.y1 = y1 * CM;
    }

    public void setY2(float y2) {
        Coordinates.y2 = (y2 * CM) - UY;
    }

    public void setY3(float y3) {
        Coordinates.y3 = (y3 * CM) - (2 * UY);
    }

    public void setY4(float y4) {
        Coordinates.y4 = (y4 * CM) - (3 * UY);
    }

    public float getX1() {
        return x1;
    }

    public float getX2() {
        return x2;
    }

    public float getX3() {
        return x3;
    }

    public float getX4() {
        return x4;
    }

    public float getY1() {
        return y1;
    }

    public float getY2() {
        return y2;
    }

    public float getY3() {
        return y3;
    }

    public float getY4() {
        return y4;
    }

}
