
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesar Formulario</title>
    </head>
    <body>
        <h1>Resultado de Procesar Formulario</h1>
        Usuario: <%= request.getParameter("usuario") %>
        <br>
        Password: <%= request.getParameter("password") %>
        <br>
        <br>
        <a href="j_index_ElementosJSP.jsp">Regresar a index de Elementos JSP</a>
    </body>
</html>
