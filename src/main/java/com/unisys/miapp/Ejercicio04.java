package com.unisys.miapp;

public class Ejercicio04 {
    public static void main(String[] args) {
        // Declaración del objeto
        String saludo = null;
        System.out.println(saludo);
        // Inicialización del objeto
        saludo = "¡Hola!";
        System.out.println(saludo);
        // Sacar cuarto caracter de la cadena
        char c4=saludo.charAt(3);
        System.out.println("El caracter 4 de saludo es: "+c4);
        // Sacar cadena en mayúsculas y minúsculas
        System.out.println(String.valueOf(saludo));
        System.out.println(saludo.toUpperCase());
        System.out.println(saludo.toLowerCase());
        // Sacar posisción caracter
        int i;
        i=saludo.indexOf("l");
        System.out.println(i);
        // Comparar cadenas
        String saludo2="Hola Mundo";
        if(saludo.equals(saludo2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }
}

