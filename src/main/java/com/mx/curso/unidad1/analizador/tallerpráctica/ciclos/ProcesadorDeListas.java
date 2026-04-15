package com.mx.curso.unidad1.analizador.tallerpráctica.ciclos;

import java.util.Scanner;

public class ProcesadorDeListas {

    public static void main(String[] args) {

        String[] frutas = {"manzana", "banana", "pera", "uva"};

        // Tarea 1: imprimir con for
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }

        // Tarea 2: buscar con while
        int i = 0;
        boolean encontrado = false;

        while (i < frutas.length && !encontrado) {
            if (frutas[i].startsWith("p") || frutas[i].startsWith("P")) {
                System.out.println("Fruta encontrada: " + frutas[i] + " en posicion " + i);
                encontrado = true;
            }
            i++;
        }

        // Tarea 3: validar con do-while
        Scanner sc = new Scanner(System.in);
        String entrada;
        boolean valida;

        do {
            System.out.print("Ingresa una fruta: ");
            entrada = sc.nextLine();
            valida = false;

            for (int j = 0; j < frutas.length; j++) {
                if (frutas[j].equals(entrada)) {
                    valida = true;
                }
            }

        } while (!valida);

        System.out.println("Fruta valida.");
    }
}