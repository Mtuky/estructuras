package com.unisys.miapp;

public class ProgramaClases {
    public static void main(String[] args) {
        Perro toby = new Perro();
        System.out.println(toby);
        toby.setRaza("Terrier");
        System.out.println(toby.getRaza());
        Perro otto = new Perro();
        System.out.println(otto);
        otto.setRaza("Pastor Alemán");
        System.out.println(otto.getRaza());

        }
    }

