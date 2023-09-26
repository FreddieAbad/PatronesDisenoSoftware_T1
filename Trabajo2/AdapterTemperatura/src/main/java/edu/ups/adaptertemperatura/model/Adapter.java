/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.adaptertemperatura.model;

/**
 *
 * @author PSI
 */
public class Adapter implements IRegistroTemperatura{
    private DispositivoCelsius dispositivoCelsius = new DispositivoCelsius();    
    private DispositivoFahrenheit dispositivoFahrenheit= new DispositivoFahrenheit();


    @Override
    public boolean registrarTemperatura(String dispositivo, double temperatura) {
        boolean registra = false;
        switch (dispositivo) {
            case "Celsius":
                registra=dispositivoCelsius.registrarTemperatura(temperatura);
                break;
            case "Fahrenheit":
                registra=dispositivoFahrenheit.registra(temperatura);
                break;
            default:
                System.out.println("Dispositivo no permitido.");
                
        }
        return registra;

    }
    
}
