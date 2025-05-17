<%-- 
    Document   : index
    Created on : 14 may 2025, 18:38:49
    Author     : Andy123
--%>
 <%-- 
    Document   : index
    Created on : 14 may 2025, 18:38:49
    Author     : Andy123
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>PDD: Sistema de Notificaciones</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
        rel="stylesheet">
  <link href="estilos.css" rel="stylesheet" type="text/css"/>
</head>
<body class="p-4">
  <div class="container">
    <h2>Enviar Notificación (PDD - Factory)</h2>
    <form action="enviarNotificacion" method="post">
      <div class="mb-3">
        <label for="tipo" class="form-label">Tipo de Notificación:</label>
        <select class="form-select" id="tipo" name="tipo" required>
  <option value="EMAIL">Email</option>
  <option value="SMS">SMS</option>
  <option value="PUSH">Push Notification</option> <!-- mi actualizacion -->
</select>
      </div>
      <div class="mb-3">
        <label for="destinatario" class="form-label">Destinatario:</label>
        <input type="text" class="form-control" id="destinatario" name="destinatario" required
               value="<c:out value='${param.destinatario}'/>" />
      </div>
      <div class="mb-3">
        <label for="mensaje" class="form-label">Mensaje:</label>
        <textarea class="form-control" id="mensaje" name="mensaje" rows="3" required><c:out value='${param.mensaje}'/></textarea>
      </div>
      <div class="mb-3">
  <label for="formato" class="form-label">Formato del Mensaje:</label>
  <select class="form-select" id="formato" name="formato" required>
    <option value="PLANO">Texto Plano</option>
    <option value="HTML">HTML</option>
  </select>
</div>
      <button class="btn btn-primary" type="submit">Enviar Notificación</button>
    </form>

    <c:if test="${not empty resultado}">
      <div class="alert ${resultado.startsWith('Error:') ? 'alert-danger' : 'alert-success'} mt-4" role="alert">
        <c:out value="${resultado}" />
      </div>
    </c:if>
  </div>
</body>
</html>