package com.mx.curso.checkpoint3.procesamientoaudio;

public class ReductorDeEco implements ProcesadorDeAudio {

    @Override
    public String filtrar() {
        return "Reduciendo eco del audio";
    }
}
