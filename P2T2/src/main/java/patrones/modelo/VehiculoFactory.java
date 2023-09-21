
package patrones.modelo;

public class VehiculoFactory extends VehiculoAbstractFactory{
    
    @Override
    public Vehiculo crearVehiculoFactory(String tipoVehiculo, float cilindro,
    float capacidad, float tonelaje, int anio) {
        switch (tipoVehiculo) {
            case "Auto" -> {
                //Auto tiene cilindraje
                return new VehiculoAuto(cilindro, anio);
            }
            case "Camioneta" -> {
                //Camioneta tiene capacidad de carga
                return new VehiculoCamioneta(capacidad, anio);
            }
            case "Camion" -> {
                //Camion tiene tonelaje
                return new VehiculoCamion(tonelaje, anio);
            }
            default -> throw new IllegalArgumentException("Tipo de vehículo no válido");
        }

    }
}
