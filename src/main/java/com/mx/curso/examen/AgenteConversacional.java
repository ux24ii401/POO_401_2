package com.mx.curso.examen;

// abstraccion: Clase abstracta base
public abstract class AgenteConversacional {

    // encapsulamiento: atributo privado
    private String nombre;

    // constructor
    public AgenteConversacional(String nombre) {
        this.nombre = nombre;
    }

    // getter
    public String getNombre() {
        return nombre;
    }

    // Método abstracto
    public abstract void responder(String mensaje);
}
