
package patrones.modelo;


public class VehiculoCamioneta extends Vehiculo {
    private double capacidadDeCarga;
    

    public VehiculoCamioneta(double capacidadDeCarga, int anio) {
        this.capacidadDeCarga = capacidadDeCarga;
        this.anio = anio;
    }

    @Override
    public double calcularCostoMatricula() {
        return 250 + this.capacidadDeCarga*15 - this.anio*6;
    }
}
