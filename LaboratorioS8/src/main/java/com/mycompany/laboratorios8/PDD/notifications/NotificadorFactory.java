
package com.mycompany.laboratorios8.PDD.notifications;

import com.mycompany.laboratorios8.PDD.strategy.FormateadorMensaje;

/**
 *
 * @author Andy123
 */
public class NotificadorFactory {
     public static Notificador crearNotificador(String tipo, FormateadorMensaje formateador) {
        if (tipo == null) {
            return null;
        }
        switch (tipo.toUpperCase()) {
            case "EMAIL" -> {
                return new EmailNotificador(formateador);
            }
            case "SMS" -> {
                return new SmsNotificador(formateador);
            }
            case "PUSH" -> {
                return new PushNotificador(formateador);
            }
            default -> throw new IllegalArgumentException("Tipo de notificación no soportado: " + tipo);
        }
    }

    public static Notificador crearNotificador(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}