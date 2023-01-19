package com.unisys.miapp;

public class EmpleadoApp {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Pepe");
        empleado1.setDni("12222222L");
        empleado1.setTlf("666772288");
        empleado1.setSueldo(1200.00);
        empleado1.setCargo("tecnico");
        System.out.println(empleado1);
        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Luis");
        empleado2.setDni("13333333P");
        empleado2.setTlf("666772289");
        empleado2.setSueldo(1300.00);
        empleado2.setCargo("administrativo");
        System.out.println(empleado2);
    }
}
