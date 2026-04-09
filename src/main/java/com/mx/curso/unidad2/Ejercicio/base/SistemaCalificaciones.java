package com.mx.curso.unidad2.Ejercicio.base;

public class SistemaCalificaciones {

    private static Object notaExemen;

    public static <Static> void main (Static[] args){
        int notaExamen = 70;

        if(notaExamen>=60){
            System.out.println("Felicidades, has aprobado el examen.");
            int notaExemen = 0;
            if(notaExemen>=90){
            System.out.println("Exelente desempeno");
        }
        }else{
            System.out.println("Lo sentimos,no has aprobado");
        }

        char calificacionLiteral;
        switch (notaExamen){
            case 100:
                case 90:
                    calificacionLiteral = 'A';
                    break;
            case 80:
                calificacionLiteral = 'B';
                break;
            case 70:
                calificacionLiteral = 'C';
                break;
            case 60:
                calificacionLiteral = 'D';
                break;
        }

    }
}
