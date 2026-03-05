package com.mx.curso.unidad1.analizador;

abstract class PracticaIA {

    private String nombreModelo;
    private double precision;

    public PracticaIA(String nombre, double precision) {
        this.nombreModelo = nombre;
        this.precision = precision;
    }

    public String getNombre() {
        return nombreModelo;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        if (precision >= 0.0 && precision <= 1.0) {
            this.precision = precision;
        } else {
            System.out.println("La precisión debe estar entre 0.0 y 1.0");
        }
    }

    public abstract void analizar(String texto);
}

class AnalizadorSentimientos extends MotorIA {

    public AnalizadorSentimientos() {
        super("Sentiment-BERT-Lite", 0.89);
    }

    @Override
    public void analizar(String texto) {
        System.out.println("Modelo: " + getNombre());

        if (texto.toLowerCase().contains("feliz") ||
                texto.toLowerCase().contains("bueno")) {
            System.out.println("Resultado: Positivo");
        } else {
            System.out.println("Resultado: Negativo o Neutro");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        MotorIA miModelo = new AnalizadorSentimientos();

        System.out.println("Sistema iniciado");

        miModelo.analizar("Hoy es un día muy bueno y estoy feliz");
        miModelo.analizar("El servicio fue terrible");
    }
}
