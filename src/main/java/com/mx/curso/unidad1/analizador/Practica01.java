package com.mx.curso.unidad1.analizador;

public class Practica01 {


    static class Drone {
        String id;
        int nivelBateria;


        Drone(String id) {
            this.id = id;
            this.nivelBateria = 100; // inicia con 100%
        }
    }

    public static void main(String[] args) {


        Drone drone1 = new Drone("DR-001");
        Drone drone2 = new Drone("DR-002");
        Drone drone3 = new Drone("DR-003");


        System.out.println("Estado inicial:");
        System.out.println(drone1.id + " - Batería: " + drone1.nivelBateria + "%");
        System.out.println(drone2.id + " - Batería: " + drone2.nivelBateria + "%");
        System.out.println(drone3.id + " - Batería: " + drone3.nivelBateria + "%");


        drone2.nivelBateria = 50;



        System.out.println("\nDespués de cambiar batería del DR-002:");
        System.out.println(drone1.id + " - Batería: " + drone1.nivelBateria + "%");
        System.out.println(drone2.id + " - Batería: " + drone2.nivelBateria + "%");
        System.out.println(drone3.id + " - Batería: " + drone3.nivelBateria + "%");
    }
}