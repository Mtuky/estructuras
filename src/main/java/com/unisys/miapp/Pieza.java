package com.unisys.miapp;

import java.io.Serializable;

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
}
