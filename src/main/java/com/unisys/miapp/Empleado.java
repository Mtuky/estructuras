package com.unisys.miapp;

public class Empleado extends Persona{
    protected Double sueldo;
    public String cargo;

    public Empleado() {
        super();
        this.dni = "";
        this.tlf = "";
        this.sueldo = 0.00;
        this.cargo = "";
    }

    public Empleado(String nombre, String dni, String tlf, Double sueldo, String cargo) {
        super(nombre);
        this.dni = dni;
        this.tlf = tlf;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public String getDni() {
        return dni;
    }

    public String getTlf() {
        return tlf;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
