package com.mx.curso.checkpoint3.agentesia;

import java.util.ArrayList;
import java.util.List;

public class MainAgentes {

    public static void main(String[] args) {

        List<AgenteInteligente> agentes = new ArrayList<>();

        agentes.add(new Explorador());
        agentes.add(new Recolector());
        agentes.add(new Defensor());

        for (AgenteInteligente agente : agentes) {
            System.out.println(agente.tomarDecision());
        }

    }
}