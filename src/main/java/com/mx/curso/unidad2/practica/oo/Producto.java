package com.mx.curso.unidad2.practica.oo;

class Producto {
    String nombre;
    double precio;

    void mostrarDetalles() {
        System.out.println(nombre + " - " + precio);
    }
}

class Electronica extends Producto {
    int garantia;

    void mostrarDetalles() {
        System.out.println(nombre + " - " + precio + " Garantía: " + garantia);
    }
}

class Alimento extends Producto {
    String fecha;

    void mostrarDetalles() {
        System.out.println(nombre + " - " + precio + " Caduca: " + fecha);
    }
}

public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[2];

        Electronica e = new Electronica();
        e.nombre = "Laptop";
        e.precio = 1000;
        e.garantia = 2;

        Alimento a = new Alimento();
        a.nombre = "Pan";
        a.precio = 20;
        a.fecha = "10/04/2026";

        productos[0] = e;
        productos[1] = a;

        for (Producto p : productos) {
            p.mostrarDetalles();
        }
    }
}
