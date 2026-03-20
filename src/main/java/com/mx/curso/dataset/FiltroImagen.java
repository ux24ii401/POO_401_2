package com.mx.curso.dataset;

class FiltroImagen {
    void aplicar() {
        System.out.println("Aplicando filtro...");
    }
}

class DetectorDeBordes extends FiltroImagen {
    void aplicar() {
        System.out.println("Detectando bordes");
    }
}

class ReductorDeRuido extends FiltroImagen {
    void aplicar() {
        System.out.println("Reduciendo ruido");
    }
}

public class Main {
    public static void main(String[] args) {

        DetectorDeBordes bordes = new DetectorDeBordes();
        ReductorDeRuido ruido = new ReductorDeRuido();

        bordes.aplicar();
        ruido.aplicar();
    }
}