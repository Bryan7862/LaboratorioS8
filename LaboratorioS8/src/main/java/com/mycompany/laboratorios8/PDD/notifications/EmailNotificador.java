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
public class EmailNotificador implements Notificador {
    private final FormateadorMensaje formateador;

    public EmailNotificador(FormateadorMensaje formateador) {
        this.formateador = formateador;
    }

    @Override
    public String enviar(String destinatario, String mensaje) {
        String mensajeFormateado = formateador.formatear(mensaje);
        // Lógica simulada para enviar email
        System.out.println("Enviando EMAIL a: " + destinatario + " con mensaje: " + mensajeFormateado);
        return "Email enviado a " + destinatario + " con formato: " + formateador.getClass().getSimpleName();
    }
}
