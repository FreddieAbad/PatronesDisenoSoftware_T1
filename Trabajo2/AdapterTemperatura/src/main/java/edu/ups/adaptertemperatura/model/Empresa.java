/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.adaptertemperatura.model;

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
    }
}
