/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2t1.controlador;

import com.mycompany.p2t1.modelo.ActivoFijo;
import com.mycompany.p2t1.modelo.ActivoFijoBuilder;

/**
 *
 * @author PSI
 */
public class ActivoFijoControlador {
    //public ActivoFijoBuilder activoFijoBuilder;

    public ActivoFijoControlador(){}
    
    public ActivoFijo crearActivoFijo(String codigo, String nombres, double precio, String ubicacion,
            int numeroExistentes, int vidaUtilAnios, String marca, String proveedor) {
        return new ActivoFijoBuilder(codigo, nombres, (double) precio)
                .addUbicacion(ubicacion)
                .addNumeroExistentes((int) numeroExistentes)
                .addMarca(marca)
                .addProveedor(proveedor)
                .addVidaUtilAnios((int) vidaUtilAnios)
                .build();
    }
}
