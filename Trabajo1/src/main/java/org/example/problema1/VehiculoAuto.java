package org.example.problema1;

// Subclase Auto
public class VehiculoAuto extends Vehiculo {

    private int cilindraje;

    public VehiculoAuto(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularCostoMatricula() {
        // Cálculo específico para Autos
        return this.cilindraje*5;// calcular el costo de matrícula para Autos;
    }
}
