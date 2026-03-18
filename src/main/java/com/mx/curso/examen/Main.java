package com.mx.curso.examen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // polimorfismo: lista con diferentes subclases
        List<AgenteConversacional> agentes = new ArrayList<>();

        agentes.add(new AgenteSaludo("Agente 1"));
        agentes.add(new AgenteDespedida("Agente 2"));

        // polimorfismo: mismo método, distinto resultado
        for (AgenteConversacional agente : agentes) {
            agente.responder("Hola");
        }
    }
}
