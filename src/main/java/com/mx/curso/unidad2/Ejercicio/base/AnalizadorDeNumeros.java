package com.mx.curso.unidad2.Ejercicio.base;

import java.util.ArrayList;

public class AnalizadorDeNumeros {
    public static void main(String[] args {
        int sum=0;
        for(int i=0; i<100; i++){
            suma += i;
        }
        System.out.println("La suma es:" + " " + suma);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        for (Integer d : numeros){
            System.out.println("Valor" + d);
        }
        int num = 1;

        while(num<55){
            if (num>50){
                System.out.println("Numero encontrado" + " " + num);
                break;
            }
            num++;
        }

        Scanner sc = new Scanner(System.in);
        String pass ="qwerty123";
        boolean esIncorrecta;

        do{
            System. out.println("Ingresa una contrasena");
            Syring entrada = sc.nextLine();
            esIncorecta = !enrada.equals(pass);

        }while (esIncorrecta);

        System.out.println("Contrasena Aceptada");
    }
}
