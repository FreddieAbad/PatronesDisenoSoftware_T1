/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.iteratorinventario.view;

import edu.ups.iteratorinventario.controller.InventarioController;
import edu.ups.iteratorinventario.model.InventarioCollection;
import edu.ups.iteratorinventario.model.InventarioIterador;
import edu.ups.iteratorinventario.model.Producto;
import java.util.List;

/**
 *
 * @author PSI
 */
public class ConsoleView {

    public static void main(String[] args) {
        InventarioController inventarioController = new InventarioController();
        inventarioController.agregarProducto("Producto 1", 21.34, 10);
        inventarioController.agregarProducto("Producto 2", 22.34, 20);
        inventarioController.agregarProducto("Producto 3", 23.34, 30);
        inventarioController.agregarProducto("Producto 4", 24.34, 40);

        List<String> informe = inventarioController.generarInforme();
        System.out.println("Registro de Productos Inventario");
        for (String productoInfo : informe) {
            System.out.println(productoInfo);
        }
        System.out.println("Valor Total USD >> " + inventarioController.calcularValorTotal());

    }
}
