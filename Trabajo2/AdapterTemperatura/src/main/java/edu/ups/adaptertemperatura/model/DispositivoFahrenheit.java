/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.adaptertemperatura.model;

/**
 *
 * @author PSI
 */
public class DispositivoFahrenheit {

    private double temperatura;
    private String tipo;

    public String registra(double temperatura) {
        this.temperatura = temperatura;
        this.tipo = "Fahrenheit";
        System.out.println("Registrado Temperatura Fahrenheit : " + temperatura);
        //return true;
        return "DispositivoFahrenheit{" + "temperatura=" + temperatura + ", tipo=" + tipo + '}';
    }

    @Override
    public String toString() {
        return "DispositivoFahrenheit{" + "temperatura=" + temperatura + ", tipo=" + tipo + '}';
    }

}
