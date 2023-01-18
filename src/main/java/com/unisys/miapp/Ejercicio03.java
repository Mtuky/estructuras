package com.unisys.miapp;

import java.util.Arrays;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Declaración de array
        int[] miArray = new int[4];
        System.out.println("Inicializa array");
        // Inicializacion manual de array
        miArray[0] = 1;
        miArray[1] = 2;
        miArray[2] = 3;
        miArray[3] = 4;
        System.out.println(miArray[0]);
        System.out.println(miArray[1]);
        System.out.println(miArray[2]);
        System.out.println(miArray[3]);
        // Recorre array bucle for
        System.out.println("Entrada al bucle for");
        int i;
        for (i = 0; i < miArray.length; i++) {
            //for (i=0;i<100;i++){
            //miArray[i] = 0;
            System.out.println(miArray[i]);
        }
        // Recorre array bucle while
        i=0;
        System.out.println("Entrada al bucle while");
        while (i < miArray.length) {
            System.out.println("Valor celda "+i+":"+miArray[i]);
            i++;
        }
        // Recorre array bucle do while
        i=0;
        System.out.println("Entrada al bucle do while");
        do {
            System.out.println("Valor celda "+i+":"+miArray[i]);
            i++;
        } while (i < miArray.length);
        // Array con numeros flotantes
        float[] flotantes=new float [2000];
        //Inicializo el array a ceros
        Arrays.fill(flotantes,0);
        //Doy valor a la segunda posicion
        flotantes[1]=7.3f;
        System.out.println("Segunda posicion flotantes:"+flotantes[1]);
    }
}

