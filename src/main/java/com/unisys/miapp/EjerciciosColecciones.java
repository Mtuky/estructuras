package com.unisys.miapp;

import java.util.*;

public class EjerciciosColecciones {
    public static void main(String[] args) {
        List<String> listado = new LinkedList<>();
        listado.add("elemento1");
        listado.add("elemento2");
        System.out.println(listado.get(0));
        for (String s:listado
             ) {
            System.out.println(s);
            
        }
        listado.remove(1);
        System.out.println(listado);
        Set<Integer> numeros =new HashSet<Integer>();
        numeros.add(0);
        numeros.add(1);
        for (Integer i:numeros)
              {
             System.out.println(i);
        }
        System.out.println(numeros);

    }
}
