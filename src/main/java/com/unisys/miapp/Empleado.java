package com.unisys.miapp;

public class Empleado extends Persona{
    protected Double sueldo;
    public String cargo;

    public Empleado() {
        super();
        this.sueldo = 0.00;
        this.cargo = "";
    }

    public Empleado(String nombre, String tlf, String dni, Double sueldo, String cargo) {
        super(nombre,tlf,dni);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre=" + super.getNombre() + '\'' +
                ",tlf='" + super.getTlf() + '\'' +
                ", dni='" + super.getDni() + '\'' +
                ",sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}

