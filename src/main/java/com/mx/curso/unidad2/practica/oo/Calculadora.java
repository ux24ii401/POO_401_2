package com.mx.curso.unidad2.practica.oo;

class Calculadora {

    int sumar(int a, int b) {
        return a + b;
    }

    int sumar(int a, int b, int c) {
        return a + b + c;
    }

    double sumar(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        System.out.println(c.sumar(2, 3));
        System.out.println(c.sumar(1, 2, 3));
        System.out.println(c.sumar(2.5, 3.5));
    }
}