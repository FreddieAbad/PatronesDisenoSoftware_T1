/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.iteratorinventario.model;

import java.util.List;

/**
 *
 * @author PSI
 */
public interface Iterador {   

    public Producto siguiente();
    public boolean haySiguiente();
    public double calcularValorTotal() ;
    public List<String> generarInforme() ;
}
