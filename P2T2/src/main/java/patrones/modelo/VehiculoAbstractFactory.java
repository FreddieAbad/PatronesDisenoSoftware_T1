
package patrones.modelo;


public abstract class VehiculoAbstractFactory {
    public abstract Vehiculo crearVehiculoFactory(String tipoVehiculo, float cilindro,
    float capacidad, float tonelaje, int anio);
}
