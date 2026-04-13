package com.mx.curso.unidad2.practica06;

import java.util.Scanner;

public class ProcesadorDeListas {

    public static void main(String[] args) {

        String[] frutas = {"Manzana", "Pera", "Mango", "Uva"};

        int contador = 0;
        boolean bandera = true;

        while (contador < frutas.length) {
            if (frutas[contador].contains("a")) {
                System.out.println("Fruta encontrada: " + frutas[contador]);
                break;
            }
            contador++;
        }

        Scanner cs = new Scanner(System.in);
        String fruta = cs.nextLine();

        // Validar fruta ingresada
        do {
            if (fruta.isEmpty()) {
                System.out.println("Ingresa una fruta válida:");
                fruta = cs.nextLine();
            } else {
                bandera = false;
            }
        } while (bandera);

        System.out.println("Fruta ingresada: " + fruta);
    }
}