package com.unisys.miapp;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Ejercicio 4
        int i=0;
        System.out.println("Entrada al bucle while");
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Salida del bucle while");
        //Ejercicio 5
        i = 0;
        System.out.println("Entrada al bucle do while");
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        System.out.println("Salida al bucle do while");
        //Ejercicio 6
        System.out.println("Entrada al bucle for");
        for (i=0;i<10;i++){
            System.out.println(i);
        }
        System.out.println("Salida al bucle for");
        //Ejercicio 7
        int j=18;
        if (i<j){
            System.out.println("no puede conducir");
        }else{
            System.out.println("si puede conducir");
        }
        //Ejercicio 8
        System.out.println("Switches");
        i=3;
        //solo se puede usar con int's
        switch(i){
            case 18:
                System.out.println("puede conducir");
                break;
            case 21:
                System.out.println("puede conducir en USA");
                break;
            default:
                System.out.println(i);
                break;
        }
    }
}
