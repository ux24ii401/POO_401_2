package com.mx.curso.unidad1.analizador.tallerpráctica.ciclos;

import java.util.Scanner;

public class AnalizadorDeNumeros {

    public static void main(String[] args) {

        // Tarea 1: Suma del 1 al 100 (for)
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }

        System.out.println("La suma del 1 al 100 es: " + suma);

        // Tarea 2: Primer número mayor a 50 (while)
        int num = 1;

        while (num <= 100) {
            if (num > 50) {
                System.out.println("El primer numero mayor a 50 es: " + num);
                break;
            }
            num++;
        }

        // Tarea 3: Validar contraseña (do-while)
        Scanner sc = new Scanner(System.in);
        String contraseñaCorrecta = "1234";
        String contraseña;

        do {
            System.out.print("Ingresa la contraseña: ");
            contraseña = sc.nextLine();

        } while (!contraseña.equals(contraseñaCorrecta));

        System.out.println("Contraseña correcta.");
    }
}