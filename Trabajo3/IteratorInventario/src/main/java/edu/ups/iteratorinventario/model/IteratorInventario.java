/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edu.ups.iteratorinventario.model;

import java.util.List;

/**
 *
 * @author PSI
 */
public class IteratorInventario {

    public static void main(String[] args) {
        // Crear el inventario
        InventarioCollection inventario = new InventarioCollection();

        inventario.agregarProducto(new Producto("Producto A", 10.0, 50));
        inventario.agregarProducto(new Producto("Producto B", 5.0, 30));
        inventario.agregarProducto(new Producto("Producto C", 20.0, 20));
        inventario.agregarProducto(new Producto("Producto D", 30.0, 56));
        inventario.agregarProducto(new Producto("Producto E", 10.0, 30));
        inventario.agregarProducto(new Producto("Producto F", 100.0, 2));

        InventarioIterador iterador = inventario.obtenerIterador();

        double valorTotal = iterador.calcularValorTotal();

        List<String> informe = iterador.generarInforme();

        System.out.println("Valor Total del Inventario: $" + valorTotal);
        for (String productoInfo : informe) {
            System.out.println(productoInfo);
        }
    }
}
