package com.mx.curso.unidad2.practica.oo;

import java.util.ArrayList;

class Estudiante {
    String nombre;
    int id;

    Estudiante(String n, int i) {
        nombre = n;
        id = i;
    }
}

class Clase {
    String nombreDeClase;
    ArrayList<Estudiante> estudiantes = new ArrayList<>();

    void mostrarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e.nombre);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Clase c = new Clase();
        c.nombreDeClase = "Programación";

        c.estudiantes.add(new Estudiante("Ana", 1));
        c.estudiantes.add(new Estudiante("Luis", 2));

        c.mostrarEstudiantes();
    }
}
