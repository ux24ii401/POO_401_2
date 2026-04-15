package com.mx.curso.unidad3.excepciones;

public class EjemploArraysIndex {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();

        try {
            ListaEnteros(1);
            ListaEnteros(2);
            ListaEnteros(3);
            System.out.println(ListaEnteros.get(5));

        } catch (Exception e)
            System.out.println("Nombre de clase" + " " + e.getClass());
        System.out.println("Exception" + " " + e.getStackTrace());
        System.out.println("Causa" + " " + e.getCause());
        System.out.println("Metodo" + " " + "Main");

    }
}
