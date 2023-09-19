package org.example.problema1;

public class Main {
    public static void main(String[] args) {
        var vehiculoFactory = new VehiculoFactory();
        System.out.println("Costo Matricula Vehiculo: "+vehiculoFactory.crearVehiculoFactory("Auto").calcularCostoMatricula());
        System.out.println("Costo Matricula Camion: "+vehiculoFactory.crearVehiculoFactory("Camion").calcularCostoMatricula());
        System.out.println("Costo Matricula Camioneta: "+vehiculoFactory.crearVehiculoFactory("Camioneta").calcularCostoMatricula());
    }
}