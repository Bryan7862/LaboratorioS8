/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorios8.PDD.strategy;

/**
 *
 * @author Andy123
 */
public class TextoPlanoFormateador implements FormateadorMensaje {
    @Override
    public String formatear(String mensaje) {
        return mensaje; // sin formato
    }
}