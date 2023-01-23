package com.unisys.miapp;

import com.unisys.miapp.Persona;
import com.unisys.miapp.Empleado;
public class EmpleadoApp {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2= new Empleado(
                "Pepe",
                "12222222L",
                "+34666772288",
                36000d,
                "Tecnico");
        System.out.println(empleado1.getNombre());
        System.out.println(empleado2.getNombre());
        System.out.println(empleado1);
        System.out.println(empleado2);
        empleado1.setNombre("Luis");
        empleado1.setDni("13333333P");
        empleado1.setTlf("+34666772299");
        empleado1.setSueldo(25000d);
        empleado1.setCargo("Junior");
        System.out.println(empleado1.getNombre());
        System.out.println(empleado2.getNombre());
        System.out.println(empleado1);
        System.out.println(empleado2);
        Currito currito1 = new Currito(
                "Curro",
                "911234567",
                "07977851A",
                24000.0,
                "Desarrollador",
                2,
                true);
        System.out.println(currito1);



    }
}
