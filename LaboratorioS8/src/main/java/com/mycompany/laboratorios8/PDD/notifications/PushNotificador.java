/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorios8.PDD.notifications;

/**
 *
 * @author Andy123
 */
public abstract class PushNotificador implements Notificador {
    public String enviarNotificacion(String destinatario, String mensaje) {
        // Simulación de envío de notificación push
        return "Notificación Push enviada a " + destinatario + " con el mensaje: " + mensaje;
    }
}