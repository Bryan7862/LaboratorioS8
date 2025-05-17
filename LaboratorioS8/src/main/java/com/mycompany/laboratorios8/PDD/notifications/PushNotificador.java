/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorios8.PDD.notifications;

import com.mycompany.laboratorios8.PDD.strategy.FormateadorMensaje;

/**
 *
 * @author Andy123
 */
public class PushNotificador implements Notificador {
    private final FormateadorMensaje formateador;

    public PushNotificador(FormateadorMensaje formateador) {
        this.formateador = formateador;
    }

    @Override
    public String enviar(String destinatario, String mensaje) {
        String mensajeFormateado = formateador.formatear(mensaje);
        // Simulación del envío de una notificación push
        System.out.println("Enviando PUSH a: " + destinatario + " con mensaje: " + mensajeFormateado);
        return "Notificación Push enviada a " + destinatario + " con formato: " + formateador.getClass().getSimpleName();
    }
}