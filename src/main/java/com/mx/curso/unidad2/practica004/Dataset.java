package com.mx.curso.unidad2.practica004;

class Dataset {
}

class EjemploSobreCargarMetodos {

    public void entrenar (Dataset[] datasets) {
        System.out.println("Metodo entrenar con 1 parametro");
    }

        public void entrenar (Dataset[] datasets, int epoca){
            System.out.println("Metodo entrenar sobrecarggado con 2 parametros");
    }
}