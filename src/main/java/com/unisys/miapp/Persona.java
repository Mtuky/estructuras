package com.unisys.miapp;

public class Persona {
    public String nombre;
    public String tlf;
    public String dni;

    public Persona(){
        this.nombre= "";
        this.tlf = "";
        this.dni = "";
    }

    public Persona(String nombre, String tlf, String dni) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
