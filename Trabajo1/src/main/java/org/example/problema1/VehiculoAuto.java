package org.example.problema1;

public class VehiculoAuto extends Vehiculo {

    private int cilindraje;

    public VehiculoAuto(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularCostoMatricula() {
        return this.cilindraje*5;
    }
}
