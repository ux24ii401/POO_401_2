package com.mx.curso.unidad3.listas;

import java.util.ArrayList;
import java.util.List;

public class MonitorIA {
    public static void main(String[] args) {
        List<MetricaEntrenamiento> metricas = new ArrayList<>();
        metricas.add(new MetricaEntrenamiento(7, 0.12, 0.1));
        metricas.add(new MetricaEntrenamiento(3, 0.62, 0.3));
        metricas.add(new MetricaEntrenamiento(4, 0.22, 0.4));
        metricas.add(new MetricaEntrenamiento(1, 0.32, 0.5));

        System.out.println("Lista de Métricas de Entrenamiento: " + metricas);

        // Imprimir el primer y último elemento
        System.out.println("Primer elemento: " + metricas.get(0));
        System.out.println("Último elemento: " + metricas.get(metricas.size() - 1));

        // Eliminar el primer y último elemento
        metricas.remove(0);
        metricas.remove(metricas.size() - 1);

        System.out.println("Lista después de eliminar primer y último elemento: " + metricas);

        // Iterar la lista de métricas y detectar el orden de inserción
        System.out.println("Iterando la lista en orden de inserción:");
        for (MetricaEntrenamiento m : metricas) {
            System.out.println(m);
        }
    }
}

