package com.mx.curso.unidad2.aprendizaje.independiente;

interface PuedeVolar {
    void volar();
}

class Avion implements PuedeVolar {
    public void volar() {
        System.out.println("Avion vuela con motores");
    }
}

class Pajaro implements PuedeVolar {
    public void volar() {
        System.out.println("Pajaro vuela con alas");
    }
}

public class Main {
    public static void main(String[] args) {
        PuedeVolar[] lista = new PuedeVolar[2];

        lista[0] = new Avion();
        lista[1] = new Pajaro();

        for (PuedeVolar v : lista) {
            v.volar();
        }
    }
}
