package com.unisys.miapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Casa {
    private String direccion;
    private Float metrosCuadrados;
    private Integer numHabitaciones;

    public Casa(String direccion, Float metrosCuadrados, Integer numHabitaciones) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.numHabitaciones = numHabitaciones;
    }
    Casa(){
        this.direccion = "";
        this.metrosCuadrados = 0.0F;
        this.numHabitaciones = 0;
    }

}
