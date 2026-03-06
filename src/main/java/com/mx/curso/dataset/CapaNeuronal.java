package com.mx.curso.dataset;

class CapaNeuronal {
    void propagacionHaciaAdelante() {
        System.out.println("Procesando datos en la red");
    }
}

class CapaConvolucional extends CapaNeuronal {
    void propagacionHaciaAdelante() {
        System.out.println("Aplicando convolucion");
    }
}

class CapaDensa extends CapaNeuronal {
    void propagacionHaciaAdelante() {
        System.out.println("Aplicando capa densa");
    }
}

public class Main {
    public static void main(String[] args) {

        CapaConvolucional conv = new CapaConvolucional();
        CapaDensa densa = new CapaDensa();

        conv.propagacionHaciaAdelante();
        densa.propagacionHaciaAdelante();
    }
}
