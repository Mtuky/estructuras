package com.unisys.miapp;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.*;
import java.util.TreeSet;
import java.util.SortedSet;

public class ColeccionesApp {
    public static void main(String[] args) {
        Pieza pieza  = new Pieza("Monitor ASUS","Monitor");
        Pieza pieza2 = new Pieza("Teclado Logitech","Teclado");
        Pieza pieza3 = new Pieza("Ratón Logitech","Ratón");
        Pieza pieza4 = new Pieza("Disco HP","Disco duro");
        Pieza pieza5 = new Pieza("Disco HP","Disco duro");
        List<Pieza>listado= new ArrayList<>();
        listado.add(pieza);
        listado.add(pieza2);
        listado.add(pieza3);
        listado.add(pieza4);
        Ordenador ordenador = new Ordenador("Dell","latitude",listado);
        System.out.println(ordenador);
        Set<Pieza> misPiezas = new HashSet<Pieza>();
        misPiezas.add(pieza);
        misPiezas.add(pieza2);
        misPiezas.add(pieza3);
        misPiezas.add(pieza4);
        misPiezas.add(pieza5);
        System.out.println(misPiezas);
        // Error excepcion
        //Set<Pieza> piezasOrdenadas = new TreeSet<>();
        //piezasOrdenadas.add(pieza);
        //piezasOrdenadas.add(pieza2);
        //piezasOrdenadas.add(pieza3);
        //piezasOrdenadas.add(pieza4);
        //System.out.println(piezasOrdenadas);
        Map<String, String> cliente = new HashMap<String, String>();
        cliente.put("nombre","Jose");
        cliente.put("direccion", "calle1");
        cliente.put("tlf","+341122334455");
        cliente.put("email","pepe@gmail.com");
        System.out.println(cliente);
        List<Map<String,String>> listadoDeMapas = new ArrayList<>();
        listadoDeMapas.add(cliente);
        listadoDeMapas.add(cliente);
        System.out.println(listadoDeMapas);
        }




    }

