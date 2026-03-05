package com.mx.curso.dataset;

public class RobotTerrestre extends AgenteIA{


    public RobotTerrestre(int energiaInicial) {
        super(energiaInicial);
    }

    @Override
    public void moverse() {
        System.out.println("Moviendose a las coordenadas X: 280, Y: 56");
    }
}
