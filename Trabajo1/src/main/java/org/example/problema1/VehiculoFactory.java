package org.example.problema1;

public class VehiculoFactory extends VehiculoAbstractFactory{
    @Override
    public Vehiculo crearVehiculoFactory(String tipoVehiculo, double caracteristicaVehiculo) {
        if (tipoVehiculo.equals("Auto")) {
            //Auto tiene cilindraje
            return new VehiculoAuto((int)caracteristicaVehiculo);
        } else if (tipoVehiculo.equals("Camioneta")) {
            //Camioneta tiene capacidad de carga
            return new VehiculoCamioneta(caracteristicaVehiculo);
        } else if (tipoVehiculo.equals("Camion")) {
            //Camion tiene tonelaje
            return new VehiculoCamion(caracteristicaVehiculo);
        } else {
            throw new IllegalArgumentException("Tipo de vehículo no válido");
        }

    }
}
