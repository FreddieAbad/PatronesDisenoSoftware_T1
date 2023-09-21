
package controlador;

import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import patrones.modelo.VehiculoFactory;


public class Controlador implements ActionListener{
    private Vista view;
    private VehiculoFactory modelo;
    private String antiguedad;
    private String cilindro;
    private String tonelaje; 
    private String capacidad;
    private String vehiculo;

    
    public Controlador (Vista view, VehiculoFactory modelo)
    {
        this.view=view;
        this.modelo=modelo;
        this.view.calcular.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("Calculo de Matricula de Vehiculo");
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed (ActionEvent e){
        this.modelo=new VehiculoFactory();

        if(view.auto.isSelected()){
            vehiculo = "Auto";
            antiguedad=view.antiguedad.getText();
            cilindro=view.cilindro.getText();
            capacidad="0";
            tonelaje= "0";
        }else if(view.camioneta.isSelected()){
            vehiculo = "Camioneta";
            cilindro="0";
            tonelaje= "0";
            antiguedad=view.antiguedad.getText();
            capacidad=view.capacidad.getText();
        }else if (view.camion.isSelected()){
            vehiculo = "Camion";
            cilindro="0";
            capacidad= "0";
            antiguedad=view.antiguedad.getText();
            tonelaje=view.tonelaje.getText();
        }
        
       view.salida.setText("El valor de su matricula es: "+String.valueOf(modelo.crearVehiculoFactory
        (vehiculo,
                Float.parseFloat(
              cilindro)
        ,
               Float.parseFloat(capacidad),
               Float.parseFloat(tonelaje),
               Integer.parseInt(antiguedad)).calcularCostoMatricula()));
       
    }
}