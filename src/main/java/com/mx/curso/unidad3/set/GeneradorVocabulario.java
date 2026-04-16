package com.mx.curso.unidad3.set;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class GeneradorVocabulario {

    public static void main(String [] args ){
        String texto = "el modelado de ia es un modelo bueno porque el modelo aprende";
        String [] = texto.split(" ");

        //Instanciamos un Set con la implemnatcion HashSet
        Set<String> vocabulario = new HashSet<>();

        //Iteramos el arreglo de tokens y agregamos al set
        for (String t: tokens){
            vocabulario.add(t);
        }
        System.out.println("vocabulario:" + " " + vocabulario);
        System.out.println("Numero de palabras:" + " " + vocabulario.size());
        System.out.println("Palbaras Procesadas:" + " " + tokens.lenght);
        System.out.println("vocabulario final" + vocabulario);

        if(vocabulario.contains("ia")){
            System.out.println("El vocabulario contiene la palabra ia");
        }
    }
}
