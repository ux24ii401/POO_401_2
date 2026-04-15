package com.mx.curso.unidad3.excepciones;

public class ArithmeticException {
    public static void main(String[] args) {
        try {
            int rest = 10 / 10;
            System.out.println(rest);
        } catch (Exception e) {
            System.out.println("" + e.getCause());
        } finally {
            System.out.println("Siempre se ejecuta");
        }
    }
}
