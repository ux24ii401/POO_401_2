package com.mx.curso.unidad3.mapas;


import java.util.HashMap;
import java.util.Map;

public class ContadorTokens {
    public class static void main(String[] args) {
        //arreglo de cadenas
        String[] tokens = {"ia" , "python" , "redes" , "neuronas" , "ia" , "neuronas"};

        //Instancia Map(interface) la implementacion HashMap
        Map<String, Integer> frecuencia = new HashMap<>();

        //Iterar el arreglo y llenar el mapa de frecuencias
        for (String  d : tokens){
            frecuencia.put(d, frecuencia.getOrDefault(d,0)+1);
        }

        //Obtener las palabras unicas

        System.out.println("Vocabulario" + " " + frecuencia.keySet());

        //Iteramos el mapa
        for(Map.Entry<String, Integer> entrada: frecuencia.keySet()) {
            System.out.println("Token" + " " + entrada.getKey() +
                    " "+ "Freecuencia:" + entrada.getValue);
        }
    }

}