package com.unisys.miapp;

public class Currito extends Empleado{
    private Integer proyectos;
    private Boolean asignacion;

    public Currito() {
        super();
        this.proyectos = 0;
        this.asignacion = Boolean.valueOf("");
    }
    public Currito(String nombre, String tlf, String dni, Double sueldo, String cargo,Integer proyectos,
                   Boolean asignacion) {
        super(nombre,tlf,dni,sueldo,cargo);
        this.proyectos = proyectos;
        this.asignacion = asignacion;
    }

    public Integer getProyectos() {
        return proyectos;
    }

    public void setProyectos(Integer proyectos) {
        this.proyectos = proyectos;
    }

    public Boolean getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Boolean asignacion) {
        this.asignacion = asignacion;
    }
    @Override
    public String toString() {
        return "Currito{" +
                "nombre=" + super.getNombre() + '\'' +
                ",tlf='" + super.getTlf() + '\'' +
                ",dni='" + super.getDni() + '\'' +
                ",sueldo=" + super.getSueldo() +
                ",cargo='" + super.getCargo() + '\'' +
                ",proyectos="+ proyectos +
                ",asignacion="+ asignacion +
                '}';
    }
}
