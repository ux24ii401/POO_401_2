package com.mx.curso.unidad2.practica.oo;

class Circulo {
    private double radio;

    Circulo(double r) {
        radio = r;
    }

    double calcularArea() {
        return Math.PI * radio * radio;
    }

    double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }
}

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);

        System.out.println(c.calcularArea());
        System.out.println(c.calcularCircunferencia());
    }
}
