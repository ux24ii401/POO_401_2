package com.mx.curso.unidad2.practicas.poo;

public class ControlAdicional {

    public static void main(String[] args) {

        // Sección 1: break
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // Sección 2: continue
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // Sección 3: return
        int[] numeros = {1, 3, 5, 7, 9};
        String resultado = encontrarNumero(numeros, 5);
        System.out.println(resultado);
    }

    public static String encontrarNumero(int[] arreglo, int objetivo) {

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return "Numero encontrado: " + objetivo;
            }
        }

        return "Numero no encontrado";
    }
}