package com.mx.curso.unidad2.aprendizaje.independiente;

class CuentaBancaria {
    private double saldo;

    CuentaBancaria(double s) {
        saldo = s;
    }

    void depositar(double d) {
        saldo = saldo + d;
    }

    void retirar(double r) {
        if (saldo >= r) {
            saldo = saldo - r;
        }
    }

    double getSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria(100);

        c.depositar(50);
        c.retirar(30);

        System.out.println(c.getSaldo());
    }
}