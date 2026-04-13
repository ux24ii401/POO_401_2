package com.mx.curso.unidad2.bifurcaciones;

public class SistemaCalificaciones {
    public static void main(String[] args) {

        int notaExamen = 85;

        // if - else
        if (notaExamen >= 60) {
            System.out.println("¡Felicidades, has aprobado!");

            // if anidado
            if (notaExamen >= 90) {
                System.out.println("¡Excelente desempeño!");
            }

        } else {
            System.out.println("Lo sentimos, no has aprobado.");
        }

        // switch para letra
        char calificacion;

        switch (notaExamen / 10) {
            case 10:
            case 9:
                calificacion = 'A';
                break;
            case 8:
                calificacion = 'B';
                break;
            case 7:
                calificacion = 'C';
                break;
            case 6:
                calificacion = 'D';
                break;
            default:
                calificacion = 'F';
        }

        System.out.println("Tu calificación es: " + calificacion);
    }
}