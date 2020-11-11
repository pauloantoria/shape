package com.shape;

public class Cuadrado implements Shape {

    private int lado;

    public int getLado() {
        return lado;
    }
    public void setLado (int lado) {
        this.lado = lado;
    }


    public double getArea() {

        return lado * lado;
    }

    public double getPerimeter() {
        return lado * 4;
    }
}
