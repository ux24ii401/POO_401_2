package com.mx.curso.unidad2.practica.oo;

class Empleado {
    private int id;
    private double salario;

    Empleado(int id, double salario) {
        this.id = id;
        this.salario = salario;
    }

    void aumentarSalario(double porcentaje) {
        salario += salario * porcentaje / 100;
    }

    double getSalario() {
        return salario;
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado e = new Empleado(1, 1000);
        e.aumentarSalario(10);
        System.out.println(e.getSalario());
    }
}