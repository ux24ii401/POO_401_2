package com.mx.curso.unidad2.practica.oo;

interface Encendible {
    void encender();
    void apagar();
}

class TV implements Encendible {
    public void encender() {
        System.out.println("TV encendida");
    }

    public void apagar() {
        System.out.println("TV apagada");
    }
}

class Bombilla implements Encendible {
    public void encender() {
        System.out.println("Bombilla encendida");
    }

    public void apagar() {
        System.out.println("Bombilla apagada");
    }
}

public class Main {
    public static void main(String[] args) {
        Encendible[] dispositivos = new Encendible[2];
        dispositivos[0] = new TV();
        dispositivos[1] = new Bombilla();

        for (Encendible d : dispositivos) {
            d.encender();
            d.apagar();
        }
    }
}
