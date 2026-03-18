package com.mx.curso.examen;

// HERENCIA: AgenteDespedida hereda de AgenteConversacional
public class AgenteDespedida extends AgenteConversacional {

    public AgenteDespedida(String nombre) {
        super(nombre);
    }

    // POLIMORFISMO: comportamiento diferente
    @Override
    public void responder(String mensaje) {
        System.out.println(getNombre() + ": ¡Adiós! Que tengas un buen día.");
    }
}