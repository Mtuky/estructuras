package com.unisys.miapp;

public class PerroApp {
    public static void main(String[] args) {
        Perro toby = new Perro();
        System.out.println(toby);
        toby.setRaza("Terrier");
        System.out.println(toby.getRaza());
        Perro otto = new Perro();
        System.out.println(otto);
        otto.setRaza("Pastor Alemán");
        System.out.println(otto.getRaza());
        Perro fluky = new Perro();
        System.out.println(fluky);
        fluky.setRaza("Pastor de Aguas");
        System.out.println(fluky.getRaza());
        }
    }

