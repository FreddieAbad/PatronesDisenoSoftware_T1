/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.iteratorinventario.controller;

import edu.ups.iteratorinventario.model.InventarioCollection;
import edu.ups.iteratorinventario.model.InventarioIterador;
import edu.ups.iteratorinventario.model.Producto;
import java.util.List;

/**
 *
 * @author PSI
 */
public class InventarioController {

    InventarioCollection inventario = new InventarioCollection();
    InventarioIterador iterador = inventario.obtenerIterador();

    public String agregarProducto(String nombre, double precio, int cantidad) {
        return inventario.agregarProducto(new Producto(nombre, precio, cantidad));
    }

    public double calcularValorTotal() {
        double valorTotal = iterador.calcularValorTotal();
        return valorTotal;
    }
    public List<String> generarInforme() {
        List<String> informe = iterador.generarInforme();
        return informe;
    }

}
