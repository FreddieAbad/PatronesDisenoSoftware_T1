/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.adaptertemperatura.model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author PSI
 */
public class Empresa {
    private static Adapter temperaturaAdapter = new Adapter();

    public static void main(String[] args) {
        System.out.println("\n************ \n ADAPTER");
        temperaturaAdapter.registrarTemperatura("Celsius", 234);
        temperaturaAdapter.registrarTemperatura("Fahrenheit", 123);
            

        var listaAdaptadores = new ArrayList<>();

        listaAdaptadores.add(temperaturaAdapter.registrarTemperatura("Celsius", 234));        listaAdaptadores.add(temperaturaAdapter.registrarTemperatura("Celsius", 234));
        listaAdaptadores.add(temperaturaAdapter.registrarTemperatura("Fahrenheit", 123));
        listaAdaptadores.add(temperaturaAdapter.registrarTemperatura("Celsius", 1234));        listaAdaptadores.add(temperaturaAdapter.registrarTemperatura("Celsius", 234));
        listaAdaptadores.add(temperaturaAdapter.registrarTemperatura("Fahrenheit", 1234));

        /*for (Object adaptador : listaAdaptadores) {
            System.out.println("|||||");
            System.out.println(adaptador.toString()); // Esto imprimirá cada adaptador en la consola
                        System.out.println("|||||");
        }*/

    }
}
