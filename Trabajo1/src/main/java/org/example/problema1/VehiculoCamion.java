package org.example.problema1;

public class VehiculoCamion extends Vehiculo {

    private double tonelaje;

    public VehiculoCamion(double tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public double calcularCostoMatricula() {
        return this.tonelaje*6;
    }
}
