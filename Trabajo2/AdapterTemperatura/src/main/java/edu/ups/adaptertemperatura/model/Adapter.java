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
public class Adapter implements IRegistroTemperatura {

    private DispositivoCelsius dispositivoCelsius = new DispositivoCelsius();
    private DispositivoFahrenheit dispositivoFahrenheit = new DispositivoFahrenheit();

    @Override
    public String registrarTemperatura(String dispositivo, double temperatura) {
        String registra = "";
        switch (dispositivo) {
            case "Celsius":
                registra = dispositivoCelsius.registrarTemperatura(temperatura);
                break;
            case "Fahrenheit":
                registra = dispositivoFahrenheit.registra(temperatura);
                break;
            default:
                System.out.println("Dispositivo no permitido.");

        }
        return registra;
    }

}
