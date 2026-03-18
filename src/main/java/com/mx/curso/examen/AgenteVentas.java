package com.mx.curso.examen;

// herencia: clase hija
public class AgenteVentas extends AgenteConversacional {

    public AgenteVentas(String nombre) {
        super(nombre);
    }

    // polimorfismo
    @Override
    public void responder(String mensaje) {
        System.out.println(getNombre() + ": Tenemos promociones disponibles para ti.");
    }
}