package com.mx.curso.unidad2.practica.oo;

class Vehiculo {
    int velocidad = 0;

    void acelerar() {
        velocidad += 5;
        System.out.println("Velocidad: " + velocidad);
    }
}

class Bicicleta extends Vehiculo {
}

class Automovil extends Vehiculo {
    void acelerar() {
        velocidad += 20;
        System.out.println("Velocidad: " + velocidad);
    }
}

public class Main {
    public static void main(String[] args) {
        Bicicleta b = new Bicicleta();
        Automovil a = new Automovil();

        b.acelerar();
        a.acelerar();
    }
}
