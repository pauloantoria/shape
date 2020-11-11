package com.shape;

public class Triangulo implements Shape {

   private int base;
   private int altura;


    public double getArea() {
        return (base * altura) / 2;
    }


    public double getPerimeter() {
        return base * 3;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
