package com.unisys.miapp;

import java.io.Serializable;
import java.util.Objects;
import java.util.*;

public class Pieza implements Serializable {

    private static final long serialVersionUID = 1234568L;
    private String nombrePieza;
    private String tipoPieza;

    public Pieza() {
        this.nombrePieza = "";
        this.tipoPieza = "";
    }
    public Pieza(String nombrePieza, String tipoPieza) {
        this.nombrePieza = nombrePieza;
        this.tipoPieza = tipoPieza;
    }

    public String getNombrePieza() {
        return nombrePieza;
    }

    public void setNombrePieza(String nombrePieza) {
        this.nombrePieza = nombrePieza;
    }

    public String getTipoPieza() {
        return tipoPieza;
    }

    public void setTipoPieza(String tipoPieza) {
        this.tipoPieza = tipoPieza;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "nombrePieza='" + nombrePieza + '\'' +
                ", tipoPieza='" + tipoPieza + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pieza pieza = (Pieza) o;
        return Objects.equals(nombrePieza, pieza.nombrePieza) && Objects.equals(tipoPieza, pieza.tipoPieza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombrePieza, tipoPieza);
    }
}
