/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.msof.tarea1grupo3.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ups.msof.tarea1grupo3.modelo.ActivoFijoBuilder;
import ups.msof.tarea1grupo3.modelo.Modelo;
import ups.msof.tarea1grupo3.vista.Vista;

/**
 *
 * @author flopezs
 */
public class Controlador implements ActionListener{
    private Vista view;
    private ActivoFijoBuilder modelo;
    
    public Controlador (Vista view, ActivoFijoBuilder modelo)
    {
        this.view=view;
        this.modelo=modelo;
        this.view.jButtonGrabar.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("Activo Fijo");
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed (ActionEvent e){
        this.modelo=new ActivoFijoBuilder(view.jTextCodigo.getText(),
                view.jTextNombre.getText(),
        Double.parseDouble(view.jTextPrecio.getText())) 
                .addUbicacion(view.jTextUbicacion.getText())
                .addNumeroExistentes(Integer.parseInt(view.jTextExistentes.getText()))
                .addMarca(view.jTextMarca.getText())
                .addProveedor(view.jTextProveedor.getText())
                .addVidaUtilAnios(Integer.parseInt(view.jTextVidaUtil.getText()));
        view.jTextListado.setText(String.valueOf(modelo.build().toString()));
    }
}
