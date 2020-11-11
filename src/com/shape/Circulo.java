package com.shape;

public class Circulo implements Shape {

    private int radio;
    private int diametro;
    public static final double Pi = 3.1416;



    public double getArea() {
        return Pi * (radio^2);
    }

    public double getPerimeter() {
        return (Pi * diametro);
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
}
