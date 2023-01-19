package com.unisys.miapp;

public class LibroApp {
    public static void main(String[] args) {
        Libro datoLombok = new Libro();
        datoLombok.setTitulo("Reina Roja");
        datoLombok.setAutor("Juan Gómez-Jurado");
        datoLombok.setEditorial("Planeta");
        System.out.println(datoLombok);
        datoLombok = new Libro("Loba Negra","Juan Gómez-Jurado","Planeta");
        System.out.println(datoLombok);
    }
}
