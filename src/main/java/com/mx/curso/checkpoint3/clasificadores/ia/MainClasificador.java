package com.mx.curso.checkpoint3.clasificadores.ia;

import java.util.ArrayList;
import java.util.List;

public class MainClasificador {

    public static void main(String[] args) {

        List<ClasificadorIA> modelos = new ArrayList<>();

        modelos.add(new ArbolDeDecision());
        modelos.add(new SupportVectorMachine());
        modelos.add(new RedNeuronal());

        for (ClasificadorIA modelo : modelos) {
            System.out.println(modelo.predecir("Datos de prueba"));
        }

    }

    private static class ArbolDeDecision implements ClasificadorIA {
        @Override
        public String predecir(String datos) {
            return "";
        }
    }
}