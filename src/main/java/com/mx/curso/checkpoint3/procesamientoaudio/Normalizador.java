package com.mx.curso.checkpoint3.procesamientoaudio;

public class Normalizador implements ProcesadorDeAudio {

    @Override
    public String filtrar() {
        return "Normalizando el audio";
    }
}