package com.mx.curso.examen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // polimorfismo
        List<AgenteConversacional> agentes = new ArrayList<>();

        agentes.add(new AgenteVentas("Agente Ventas"));
        agentes.add(new AgenteSoporte("Agente Soporte"));

        for (AgenteConversacional agente : agentes) {
            agente.responder("Hola");
        }
    }
}