/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorios8.PDD.controller;

/**
 *
 * @author Andy123
 */


import com.mycompany.laboratorios8.PDD.notifications.Notificador;
import com.mycompany.laboratorios8.PDD.notifications.NotificadorFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;


@WebServlet(name = "EnviarNotificacion", urlPatterns = {"/enviarNotificacion"})
public class enviarNotificacion extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obtener parámetros del formulario
        String tipo = request.getParameter("tipo");
        String destinatario = request.getParameter("destinatario");
        String mensaje = request.getParameter("mensaje");

        String resultado;

        // Obtener el notificador desde la fábrica
        Notificador notificador = NotificadorFactory.crearNotificador(tipo);

        if (notificador != null) {
            // Enviar notificación y guardar el resultado
            resultado = notificador.enviar(destinatario, mensaje);
        } else {
            resultado = "Error: Tipo de notificación no válido.";
        }

        // Enviar el resultado de vuelta al JSP
        request.setAttribute("resultado", resultado);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
