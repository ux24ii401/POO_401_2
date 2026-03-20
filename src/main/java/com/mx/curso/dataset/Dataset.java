package com.mx.curso.dataset;

public abstract class Dataset {

    public void cargarDatos(String cargandoDatosAlDataset) {
        System.out.println("Cargando datos al dataset...");
    }

    public abstract void cargarDatos();
}
