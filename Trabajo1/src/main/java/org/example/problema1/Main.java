package org.example.problema1;

public class Main {
    public static void main(String[] args) {
        var vehiculoFactory = new VehiculoFactory();
        System.out.println("Costo Matricula Vehiculo: "+vehiculoFactory.crearVehiculoFactory("Auto",2000).calcularCostoMatricula());
        System.out.println("Costo Matricula Vehiculo: "+vehiculoFactory.crearVehiculoFactory("Auto",123).calcularCostoMatricula());
        System.out.println("Costo Matricula Vehiculo: "+vehiculoFactory.crearVehiculoFactory("Auto",123.23).calcularCostoMatricula());
        System.out.println("Costo Matricula Camion: "+vehiculoFactory.crearVehiculoFactory("Camion",569).calcularCostoMatricula());
        System.out.println("Costo Matricula Camioneta: "+vehiculoFactory.crearVehiculoFactory("Camioneta",897).calcularCostoMatricula());
    }
}