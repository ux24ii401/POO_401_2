package com.mx.curso.unidad3.genericos.contextualizacion01;

import java.util.List;
import java.util.Map;

public interface ProcesadorDeDatos<T, K, V> {
    void procesarSecuencia(List<T> elementos);

    void procesarMapa(Map<K,V> datosAsociativos);
}

// ProcesadorVision
class ProcesadorVision implements ProcesadorDeDatos<String,String, String>{
    @Override
    public void procesarSecuencia(List<String> elementos) {
        // Aquí podrías aplicar análisis de visión sobre cadenas
    }

    @Override
    public void procesarMapa(Map<String, String> datosAsociativos){
        // Aquí podrías mapear etiquetas con descripciones
    }
}

// MotorRecomendaciones
class MotorRecomendaciones implements ProcesadorDeDatos<String,String, Double>{
    @Override
    public void procesarSecuencia(List<String> elementos) {
        // Aquí podrías analizar secuencias de productos
    }

    @Override
    public void procesarMapa(Map<String, Double> datosAsociativos){
        // Aquí podrías mapear productos con puntuaciones
    }
}

// ProcesadorEstadistico (tercera variable)
class ProcesadorEstadistico implements ProcesadorDeDatos<Integer, String, Integer>{
    @Override
    public void procesarSecuencia(List<Integer> elementos) {
        // Ejemplo: calcular promedio
        int suma = 0;
        for(Integer e : elementos){
            suma += e;
        }
        double promedio = elementos.isEmpty() ? 0 : (double) suma / elementos.size();
        System.out.println("Promedio: " + promedio);
    }

    @Override
    public void procesarMapa(Map<String, Integer> datosAsociativos){
        // Ejemplo: mostrar valores asociados
        for(Map.Entry<String, Integer> entry : datosAsociativos.entrySet()){
            System.out.println("Clave: " + entry.getKey() + " -> Valor: " + entry.getValue());
        }
    }
}
