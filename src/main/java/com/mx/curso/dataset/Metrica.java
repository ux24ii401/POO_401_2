package com.mx.curso.dataset;

class Metrica {
    double calcularResultado() {
        return 0;
    }
}

class Precision extends Metrica {
    double calcularResultado() {
        return 0.9;
    }
}

class ErrorCuadraticoMedio extends Metrica {
    double calcularResultado() {
        return 0.1;
    }
}

public class Main {
    public static void main(String[] args) {

        Precision p = new Precision();
        ErrorCuadraticoMedio mse = new ErrorCuadraticoMedio();

        System.out.println("Precision: " + p.calcularResultado());
        System.out.println("MSE: " + mse.calcularResultado());
    }
}
