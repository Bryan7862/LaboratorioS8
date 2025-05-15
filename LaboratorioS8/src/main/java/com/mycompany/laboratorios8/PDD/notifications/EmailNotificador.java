/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorios8.PDD.notifications;

/**
 *
 * @author Andy123
 */
public class EmailNotificador implements Notificador {
    @Override
    public String enviar(String destinatario, String mensaje) {
        // Lógica simulada para enviar email
        System.out.println("Enviando EMAIL a: " + destinatario + " con mensaje: " + mensaje);
        return "Email enviado a " + destinatario;
      
    }
    
}