package com.mx.curso.checkpoint3.evaluacionmodelos;

public class MainMetricas {

    public static void main(String[] args) {

        double[] real = {3,5,2};
        double[] predicho = {2.5,5,2};

        EvaluadorMetricas evaluador = new ErrorCuadraticoMedio();

        System.out.println("Error: " + evaluador.calcularError(real, predicho));

    }
}