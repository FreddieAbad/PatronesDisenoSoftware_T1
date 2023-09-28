/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.adaptertemperatura.model;

/**
 *
 * @author PSI
 */
public class DispositivoCelsius {

    private double temperatura;
    private String tipo;

    public String registrarTemperatura(double temperatura) {
        this.temperatura = temperatura;
        this.tipo = "Celsius";

        System.out.println("Registrado Temperatura Celsius: " + temperatura);
        //return true;
        return "DispositivoCelsius{" + "temperatura=" + temperatura + ", tipo=" + tipo + '}';

    }

    @Override
    public String toString() {
        return "DispositivoCelsius{" + "temperatura=" + temperatura + ", tipo=" + tipo + '}';
    }

}
