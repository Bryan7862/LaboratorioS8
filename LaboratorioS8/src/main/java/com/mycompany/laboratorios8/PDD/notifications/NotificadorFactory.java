/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorios8.PDD.notifications;

/**
 *
 * @author Andy123
 */
public class NotificadorFactory {
    public static Notificador crearNotificador(String tipo) {
        if (tipo == null) {
            return null;
        }
        switch (tipo.toUpperCase()) {
            case "EMAIL":
                return new EmailNotificador();
            case "SMS":
                return new SmsNotificador();
            case "PUSH":
                return new PushNotificador();// Mi nuevo caso
            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado: " + tipo);
        }
    }
}