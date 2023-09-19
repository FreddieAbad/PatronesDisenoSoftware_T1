package org.example.problema1;


public class VehiculoCamioneta extends Vehiculo {
    private double capacidadDeCarga;

    public VehiculoCamioneta(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public double calcularCostoMatricula() {
        return this.capacidadDeCarga*5;
    }
}

