package com.mx.curso.unidad3.mapas;

import java.util.HashMap;
import java.util.Map;

public class ContadorTokenOptimizado {
    public static void main(String[] args){
        //arreglo de cadenas
        String [] tokens = {"ia" , "python" , "redes" , "neuronas" , "ia" , "neuronas"};

        Map<String, Integer> frecuencias = new HashMap<>();

        for(String t: tokens){
            //Metodo merge de la interface MAP
            //si t no existe pone 1
            //si t ya existe, suma el valor anterior + valor nuevo
            frecuencias.merge(t, 1,
                    (valorAnterior, valorNuevo) -> valorAnterior+valorNuevo);

        }
        System.out.println("---------Frecuencias con el metodo Merge de Map");
        frecuencias.forEach((k, v)->System.out.println(k + ":" + v));
    }
}
