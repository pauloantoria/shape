package com.shape;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean ejec = true;
        Scanner sc = new Scanner (System.in);
        int op = 0;

        do {
            System.out.println(
                    "(1) Círculo\n" +
                            "(2) Cuadrado\n" +
                            "(3) Triángulo"
                    );

            System.out.println("Ingresa la opción:");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    Circulo c = new Circulo();

                    System.out.println("Introduce el radio:");
                    var radio = sc.nextInt();
                    c.setRadio(radio);
                    System.out.println("Introduce el diámetro:");
                    var diametro = sc.nextInt();
                    c.setDiametro(diametro);
                    System.out.println(c.getArea());
                    System.out.println(c.getPerimeter());
                    break;

                case 2:
                    Cuadrado cu = new Cuadrado();
                    System.out.println("Introduce el lado:");
                    var lado = sc.nextInt();
                    cu.setLado(lado);
                    System.out.println(cu.getArea());
                    System.out.println(cu.getPerimeter());
                    break;

                case 3:
                    Triangulo t = new Triangulo();
                    System.out.println("Introduce la base:");
                    var base = sc.nextInt();
                    t.setBase(base);
                    System.out.println("Introduce la altura:");
                    var altura = sc.nextInt();
                    t.setAltura(altura);
                    System.out.println(t.getArea());
                    System.out.println(t.getPerimeter());
                    break;
                default:
                    ejec = false;
            }

        } while(ejec);

    }
}
