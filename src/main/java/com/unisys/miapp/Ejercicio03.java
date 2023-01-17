package com.unisys.miapp;

public class Ejercicio03 {
    public static void main(String[] args) {
        int[] miArray = new int[4];
        System.out.println("Inicializa array");
        miArray[0] = 1;
        miArray[1] = 2;
        miArray[2] = 3;
        miArray[3] = 4;
        System.out.println(miArray[0]);
        System.out.println(miArray[1]);
        System.out.println(miArray[2]);
        System.out.println(miArray[3]);
        System.out.println("Entrada al bucle for");
        int i;
        for (i = 0; i < miArray.length; i++) {
            //for (i=0;i<100;i++){
            //miArray[i] = 0;
            System.out.println(miArray[i]);
        }
        System.out.println("Entrada al bucle while");
        while (i < miArray.length) {
            System.out.println(miArray[i]);
            i++;
        }
        do {
            System.out.println(miArray);
            i++;
        } while (i < miArray.length);
    }
}

