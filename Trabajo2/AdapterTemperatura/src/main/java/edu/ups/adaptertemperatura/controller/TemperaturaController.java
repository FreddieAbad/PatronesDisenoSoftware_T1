/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.adaptertemperatura.controller;

import edu.ups.adaptertemperatura.model.Adapter;

/**
 *
 * @author PSI
 */
public class TemperaturaController {
    private static Adapter temperaturaAdapter = new Adapter();

    
    public Adapter registrarTemperatura (String tipo, double temperatura){
        temperaturaAdapter.registrarTemperatura(tipo, temperatura);
        return temperaturaAdapter;
    }
}
