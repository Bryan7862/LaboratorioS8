/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorios8.PDD.notifications;

/**
 *
 * @author Andy123
 */
public class SmsNotificador implements Notificador {
    @Override
    public String enviar(String destinatario, String mensaje) {
        // Lógica simulada para enviar SMS
        System.out.println("Enviando SMS a: " + destinatario + " con mensaje: " + mensaje);
        return "SMS enviado a " + destinatario;
    }
}