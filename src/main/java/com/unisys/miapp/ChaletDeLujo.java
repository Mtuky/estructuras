package com.unisys.miapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class ChaletDeLujo extends Chalet {
    private Boolean piscina;

    public ChaletDeLujo() {
        super();
        this.piscina = false;
    }

    public ChaletDeLujo(String direccion, Float metrosCuadrados, Integer numHabitaciones, Integer numPlantas, Boolean piscina) {
        super(direccion, metrosCuadrados, numHabitaciones, numPlantas);
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "ChaletDeLujo{" +
                "direccion=" + getDireccion() + ',' +
                "metrosCuadrados=" + getMetrosCuadrados() + ',' +
                "numHabitaciones=" + getNumHabitaciones() + ',' +
                "numPlantas=" + getNumPlantas() + ',' +
                "piscina=" + piscina +
                '}';
    }
}

