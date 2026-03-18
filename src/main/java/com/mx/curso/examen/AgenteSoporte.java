package com.mx.curso.examen;

// herencia: clase hija
public class AgenteSoporte extends AgenteConversacional {

    public AgenteSoporte(String nombre) {
        super(nombre);
    }

    // polimorfismo
    @Override
    public void responder(String mensaje) {
        System.out.println(getNombre() + ": Estoy aquí para ayudarte con soporte técnico.");
    }
}