package com.unisys.miapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Chalet extends Casa{
    private Integer numPlantas;

    public Chalet() {
        super();
        this.numPlantas = 0;
    }

    public Chalet(String direccion, Float metrosCuadrados, Integer numHabitaciones, Integer numPlantas) {
        super(direccion, metrosCuadrados, numHabitaciones);
        this.numPlantas = numPlantas;
    }

    @Override
    public String toString() {
        return "Chalet{" +
                "direccion="+ getDireccion()+','+
                "metrosCuadrados="+getMetrosCuadrados()+','+
                "numHabitaciones="+getNumHabitaciones()+','+
                "numPlantas=" + numPlantas +
                '}';
    }
}
