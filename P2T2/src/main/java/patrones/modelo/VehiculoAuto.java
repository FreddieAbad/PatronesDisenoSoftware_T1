
package patrones.modelo;

public class VehiculoAuto extends Vehiculo {

    private float cilindraje;

    public VehiculoAuto(float cilindraje, int anio) {
        this.cilindraje = cilindraje;
        this.anio = anio;
    }

    @Override
    public double calcularCostoMatricula() {
        return 200 + this.cilindraje*15 - this.anio*5;
    }
}