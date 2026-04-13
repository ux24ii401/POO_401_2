package com.mx.curso.unidad2.practica.oo;

class Forma {
    double calcularArea() {
        return 0;
    }
}

class Circulo extends Forma {
    double radio;

    Circulo(double r) {
        radio = r;
    }

    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Forma {
    double base, altura;

    Rectangulo(double b, double a) {
        base = b;
        altura = a;
    }

    double calcularArea() {
        return base * altura;
    }
}

public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[2];
        formas[0] = new Circulo(3);
        formas[1] = new Rectangulo(4, 5);

        for (Forma f : formas) {
            System.out.println(f.calcularArea());
        }
    }
}
