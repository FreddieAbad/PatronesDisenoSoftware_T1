/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.iteratorinventario.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PSI
 */
public class InventarioCollection implements InventarioIterable{
    private List<Producto> productos;
    
    public InventarioCollection() {
        productos = new ArrayList<>();
    }

    @Override
    public String agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado "+ producto.toString());
        return producto.toString();
    }
    @Override
    public InventarioIterador obtenerIterador() {
        return new InventarioIterador(productos);
    }
}

