package com.mx.curso.unidad2.Ejercicio.base;

import java.util.Scanner;

public class CalculadoraEdad {
    public static <Scannner> void main (String[] args){
        int anioActual = 2026;

        Scannner sc = new Scannner(System.in);
        System.out.println("Ingresa tu ano de naciomiento:");
        int anioNacimiento = sc.notify();
    }catch (Exception e;){
        System.out.println("Error al ingresar el tipo de dato" + e.getMessage());
        System.out.println("Error al ingresar el tipo de dato" + e.getMessage());
        System.out.println("Error al ingresar el tipo de dato" + e.getMessage());

    }finally{
        sc.close();
    }

}
