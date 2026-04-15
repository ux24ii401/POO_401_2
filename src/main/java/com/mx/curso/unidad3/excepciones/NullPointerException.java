package com.mx.curso.unidad3.excepciones;

public class NullPointerException {

    int numero;

    public static void main (String[] args) {
        try {
            NullPointerException cs = null;
            System.out.println(cs.getNumero());
        } catch (Exception e) {
            System.out.println("error" + e.Message());
        }
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){

    }
}

