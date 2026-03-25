package com.mx.curso.unidad2.practica04;

public class Main {
//
    public static void main(String[] args) {

        SensorIA[] sensores = new SensorIA[3];

        sensores[0] = new SensorLidar();
        sensores[1] = new SensorVision();
        sensores[2] = new SensorUltrasonido();

        for (SensorIA s : sensores) {
            s.leerDatos();
        }
    }
}