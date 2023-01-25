package com.unisys.miapp;

import java.util.Set;

public class ColeccionesApp {
    public static void main(String[] args) {
        Pieza pieza = new Pieza("Monitor ASUS","Monitor");
        Ordenador ordenador = new Ordenador("Dell","Latitude 5263",pieza);
        System.out.println(pieza);
        System.out.println(ordenador);


    }
}
