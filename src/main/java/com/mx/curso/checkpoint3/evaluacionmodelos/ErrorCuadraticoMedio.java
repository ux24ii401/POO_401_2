package com.mx.curso.checkpoint3.evaluacionmodelos;

public class ErrorCuadraticoMedio extends EvaluadorMetricas {

    @Override
    public double calcularError(double[] real, double[] predicho) {

        double suma = 0;

        for (int i = 0; i < real.length; i++) {
            suma += Math.pow(real[i] - predicho[i], 2);
        }

        return suma / real.length;
    }
}