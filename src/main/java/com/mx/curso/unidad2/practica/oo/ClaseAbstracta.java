package com.mx.curso.unidad2.practica.oo;

abstract class Personaje {
    abstract void atacar();
}

class Guerrero extends Personaje {
    void atacar() {
        System.out.println("Ataque con espada");
    }
}

class Mago extends Personaje {
    void atacar() {
        System.out.println("Ataque con hechizo");
    }
}

public class Main {
    public static void main(String[] args) {
        Guerrero g = new Guerrero();
        Mago m = new Mago();

        g.atacar();
        m.atacar();
    }
}
