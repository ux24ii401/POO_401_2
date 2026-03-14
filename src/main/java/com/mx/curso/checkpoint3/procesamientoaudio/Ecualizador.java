package com.mx.curso.checkpoint3.procesamientoaudio;

public class Ecualizador implements ProcesadorDeAudio {

    @Override
    public String filtrar() {
        return "Ecualizando el audio";
    }
}