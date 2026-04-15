package com.mx.curso.unidad2.practicas.poo;

public class ManejoDeCiclos {

    public static void main(String[] args) {

        // Tarea 1: Conteo Ascendente (while)
        int contador = 1;

        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        // Tarea 2: Conteo Descendente (do-while)
        int num = 10;

        do {
            System.out.println(num);
            num--;
        } while (num >= 8);

        // Tarea 3: Tabla de multiplicar del 7 (for)
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
    }
}
