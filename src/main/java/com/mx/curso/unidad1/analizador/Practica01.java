package com.mx.curso.unidad1.analizador;

public class Practica01 {

    // Clase Drone (plantilla)
    static class Drone {
        String id;
        int nivelBateria;

        // Constructor
        Drone(String id) {
            this.id = id;
            this.nivelBateria = 100; // inicia con 100%
        }
    }

    public static void main(String[] args) {

        // Crear 3 objetos (instancias)
        Drone drone1 = new Drone("DR-001");
        Drone drone2 = new Drone("DR-002");
        Drone drone3 = new Drone("DR-003");

        // Mostrar estado inicial
        System.out.println("Estado inicial:");
        System.out.println(drone1.id + " - Batería: " + drone1.nivelBateria + "%");
        System.out.println(drone2.id + " - Batería: " + drone2.nivelBateria + "%");
        System.out.println(drone3.id + " - Batería: " + drone3.nivelBateria + "%");

        // Modificar batería solo de un drone
        drone2.nivelBateria = 50;

        // Mostrar estado después del cambio
        System.out.println("\nDespués de cambiar batería del DR-002:");
        System.out.println(drone1.id + " - Batería: " + drone1.nivelBateria + "%");
        System.out.println(drone2.id + " - Batería: " + drone2.nivelBateria + "%");
        System.out.println(drone3.id + " - Batería: " + drone3.nivelBateria + "%");
    }
}