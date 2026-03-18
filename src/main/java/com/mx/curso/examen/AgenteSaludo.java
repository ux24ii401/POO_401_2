package com.mx.curso.examen;

// HERENCIA: AgenteSaludo hereda de AgenteConversacional
public class AgenteSaludo extends AgenteConversacional {

    public AgenteSaludo(String nombre) {
        super(nombre);
    }

    // POLIMORFISMO: implementación distinta
    @Override
    public void responder(String mensaje) {
        System.out.println(getNombre() + ": ¡Hola! ¿Cómo estás?");
    }
}