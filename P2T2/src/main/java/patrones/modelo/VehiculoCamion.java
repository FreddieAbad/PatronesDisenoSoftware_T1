
package patrones.modelo;

public class VehiculoCamion extends Vehiculo {

    private float tonelaje;

    public VehiculoCamion(float tonelaje,int anio) {
        this.tonelaje = tonelaje;
        this.anio = anio;
    }

    @Override
    public double calcularCostoMatricula() {
        return 300 + this.tonelaje*20 - this.anio*6;
    }
}
