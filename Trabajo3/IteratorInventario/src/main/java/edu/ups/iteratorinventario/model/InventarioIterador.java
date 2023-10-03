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
public class InventarioIterador implements Iterador{
    private List<Producto> productos;
    private int indice;

    public InventarioIterador(List<Producto> productos) {
        this.productos = productos;
        this.indice = 0;
    }
    @Override
    public Producto siguiente() {
        if (indice < productos.size()) {
            Producto productoActual = productos.get(indice);
            indice++;
            return productoActual;
        }
        return null;
    }
    @Override
    public boolean haySiguiente() {
        return indice < productos.size();
    }
    @Override
    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Producto producto : productos) {
            valorTotal += producto.getPrecio() * producto.getCantidad();
        }
        return valorTotal;
    }
    @Override
    public List<String> generarInforme() {
        List<String> informe = new ArrayList<>();
        for (Producto producto : productos) {
            informe.add("Producto: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Cantidad: " + producto.getCantidad());
        }
        return informe;
    }
}
