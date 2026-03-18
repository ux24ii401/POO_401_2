package com.mx.curso.examen;

// herencia: AgenteDespedida hereda de AgenteConversacional
public class AgenteDespedida extends AgenteConversacional {

    public AgenteDespedida(String nombre) {
        super(nombre);
    }

    // polimorfismo: comportamiento diferente
    @Override
    public void responder(String mensaje) {
        System.out.println(getNombre() + ": ¡Adiós! Que tengas un buen día.");
    }
}