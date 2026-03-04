package com.mx.curso.elementosrobot;

public class Main {

    public static void main(String[] args) {

        Bateria bateria = new Bateria();
        Motor motor = new Motor();
        Brazo brazo = new Brazo();
        Sensor sensor = new Sensor();

        bateria.cargar();
        motor.encender();
        brazo.mover();
        sensor.detectar();
    }
}