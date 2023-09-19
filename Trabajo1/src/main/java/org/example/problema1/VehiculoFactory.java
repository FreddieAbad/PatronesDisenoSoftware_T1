package org.example.problema1;

public class VehiculoFactory extends VehiculoAbstractFactory{
    @Override
    public Vehiculo crearVehiculoFactory(String tipoVehiculo) {
        if (tipoVehiculo.equals("Auto")) {
            return new VehiculoAuto(2000);
        } else if (tipoVehiculo.equals("Camioneta")) {
            return new VehiculoCamioneta(5);
        } else if (tipoVehiculo.equals("Camion")) {
            return new VehiculoCamion(350);
        } else {
            throw new IllegalArgumentException("Tipo de vehículo no válido");
        }

    }
}
