package patrones.problema1;


import Vista.Vista;
import controlador.Controlador;
import patrones.modelo.VehiculoFactory;

public class Main {
    public static void main(String[] args) {
        var vehiculoFactory = new VehiculoFactory();
        
        VehiculoFactory modelo=new VehiculoFactory();
       // Modelo modelo=new Modelo();
        Vista view=new Vista();
        Controlador controlador=new Controlador(view,modelo);
        controlador.iniciar();
        view.setVisible(true);
        
        
       /* System.out.println("Costo Matricula Vehiculo: "+vehiculoFactory.crearVehiculoFactory(
                "Auto",
                2000).calcularCostoMatricula()+" ");
        System.out.println("Costo Matricula Vehiculo: "+vehiculoFactory.crearVehiculoFactory("Auto",123).calcularCostoMatricula());
        System.out.println("Costo Matricula Vehiculo: "+vehiculoFactory.crearVehiculoFactory("Auto",123.23).calcularCostoMatricula());
        System.out.println("Costo Matricula Camion: "+vehiculoFactory.crearVehiculoFactory("Camion",569).calcularCostoMatricula());
        System.out.println("Costo Matricula Camioneta: "+vehiculoFactory.crearVehiculoFactory("Camioneta",897).calcularCostoMatricula());
*/    
}
}
