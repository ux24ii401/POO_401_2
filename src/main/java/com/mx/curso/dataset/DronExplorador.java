package com.mx.curso.dataset;

    public class DronExplorador extends AgenteIA{


        public DronExplorador(int energiaInicial) {
            super(energiaInicial);
        }

        @Override
        public void moverse() {
            System.out.println("Moviendose a las coordenadas X: 233, Y: 144, Z: 62");
        }
    }

