package com.mx.curso.examen;

// ABSTRACCIÓN: Clase abstracta base
public abstract class AgenteConversacional {

    // Encapsulamiento: atributo privado
    private String nombre;

    // Constructor
    public AgenteConversacional(String nombre) {
        this.nombre = nombre;
    }

    // Getter (solo el necesario)
    public String getNombre() {
        return nombre;
    }

    // Método abstracto
    public abstract void responder(String mensaje);
}
