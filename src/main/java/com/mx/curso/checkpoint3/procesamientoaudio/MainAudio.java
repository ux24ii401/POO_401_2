package com.mx.curso.checkpoint3.procesamientoaudio;

import java.util.ArrayList;
import java.util.List;

public class MainAudio {

    public static void main(String[] args) {

        List<ProcesadorDeAudio> procesadores = new ArrayList<>();

        procesadores.add(new ReductorDeEco());
        procesadores.add(new Ecualizador());
        procesadores.add(new Normalizador());

        for (ProcesadorDeAudio p : procesadores) {
            System.out.println(p.filtrar());
        }

    }
}
