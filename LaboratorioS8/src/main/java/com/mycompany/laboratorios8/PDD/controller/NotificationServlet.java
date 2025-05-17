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
import com.mycompany.laboratorios8.PDD.strategy.FormateadorMensaje;
import com.mycompany.laboratorios8.PDD.strategy.HtmlFormateador;
import com.mycompany.laboratorios8.PDD.strategy.TextoPlanoFormateador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet("/enviarNotificacion")
public class NotificationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8");
        String tipoNotificacion = req.getParameter("tipo");
        String destinatario = req.getParameter("destinatario");
        String mensaje = req.getParameter("mensaje");
        String formato = req.getParameter("formato"); // Mi nuevo parametro
        String resultado = "";

        try {
            // seleccionar formateador segun el tipo
            FormateadorMensaje formateador;
            if ("HTML".equalsIgnoreCase(formato)) {
                formateador = new HtmlFormateador();
            } else {
                formateador = new TextoPlanoFormateador();
            }

            // crear notificador con el formateador
            Notificador notificador = NotificadorFactory.crearNotificador(tipoNotificacion, formateador);

            if (notificador != null) {
                resultado = notificador.enviar(destinatario, mensaje);
            } else {
                resultado = "Error: Tipo de notificación no especificado.";
            }
        } catch (IllegalArgumentException e) {
            resultado = "Error: " + e.getMessage();
        }

        req.setAttribute("resultado", resultado);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}