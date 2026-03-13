package com.mx.curso.unidad1.analizador.vehiculo.autonomo;

public class ControlCentral {

    public static void main (String[] args){

        VehiculoAutonomo [] vehiculos = new VehiculoAutonomo[2];
        vehiculos[0] = new Drone();
        vehiculos[1] = new Rover();

        for (VehiculoAutonomo f : vehiculos) {

            f.calcularRuta();

        }

    }

}
