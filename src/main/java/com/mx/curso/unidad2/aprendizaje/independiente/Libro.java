package com.mx.curso.unidad2.aprendizaje.independiente;

class Libro {
    String titulo;
    String autor;
    int paginas;

    void mostrarInfo() {
        System.out.println(titulo + " - " + autor + " - " + paginas);
    }
}

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.titulo = "Libro 1";
        l1.autor = "Autor 1";
        l1.paginas = 100;

        Libro l2 = new Libro();
        l2.titulo = "Libro 2";
        l2.autor = "Autor 2";
        l2.paginas = 200;

        l1.mostrarInfo();
        l2.mostrarInfo();
    }
}
