package com.mx.curso.unidad2.Ejercicio.Emilio;

public abstract class FiguraGeometrica {

    protected String nombre;

    public FiguraGeometrica (String nombre) {
        this.nombre = nombre;

    }

    abstract double calcularArea ();

    public void mostrarNombre () {
        System.out.println("Nombre " + nombre);
    }


}