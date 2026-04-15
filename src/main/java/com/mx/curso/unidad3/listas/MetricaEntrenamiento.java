package com.mx.curso.unidad3.listas;

class MetricaEntrenamiento {
    private int epoca;
    private double loss;
    private double accuracy;

    public MetricaEntrenamiento(int epoca, double loss, double accuracy) {
        this.epoca = epoca;
        this.loss = loss;
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "Epoca: " + epoca + ", Loss: " + loss + ", Accuracy: " + accuracy;
    }
}

