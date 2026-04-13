package com.mx.curso.unidad2.practica.oo;

class Restaurante {
    String nombre;
    String tipoDeComida;
    int calificacion;

    void abrir() {
        System.out.println(nombre + " está abierto");
    }
}

class Main {
    public static void main(String[] args) {
        Restaurante r1 = new Restaurante();
        r1.nombre = "Tacos Pepe";
        r1.tipoDeComida = "Mexicana";
        r1.calificacion = 5;

        Restaurante r2 = new Restaurante();
        r2.nombre = "Pizza Max";
        r2.tipoDeComida = "Italiana";
        r2.calificacion = 4;

        r1.abrir();
        r2.abrir();
    }
}