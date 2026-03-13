package com.mx.curso.unidad1.analizador.carrito;

public class AplicacionMetodo extends main.java.unidad1.carrito.FuncionesVehiculo {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String frenar() {
        return "Se esta frenando";
    }

    @Override
    public String acelerar() {
        return "Se esta acelerando";
    }

    public static void main (String[] args) {

        AplicacionMetodo operacion = new AplicacionMetodo();

        System.out.println(operacion.frenar());

        System.out.println(operacion.acelerar());

    }

}