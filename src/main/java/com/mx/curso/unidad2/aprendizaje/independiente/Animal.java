package com.mx.curso.unidad2.aprendizaje.independiente;

class Animal {
    void hacerSonido() {
        System.out.println("Sonido");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("Guau");
    }
}

class Gato extends Animal {
    void hacerSonido() {
        System.out.println("Miau");
    }
}

public class Main {
    public static void main(String[] args) {

        // Polimorfismo (arreglo de Animal)
        Animal[] animales = new Animal[2];

        animales[0] = new Perro();
        animales[1] = new Gato();

        // recorrer y llamar método
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}
