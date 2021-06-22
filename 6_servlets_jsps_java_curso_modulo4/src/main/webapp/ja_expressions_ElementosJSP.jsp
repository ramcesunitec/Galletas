
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expression JSP</title>
    </head>
    <body>
        <h1>Expression JSP</h1>
        Concatenacion<%= "Saludos + ' ' + " + " " + " JSP" %>
        <br>
        Operacion matematica: <%= 2*3/2  %>
        <br>
        Session id: <%= session.getId() %>
        <br>
        <br>
        <a href="j_index_ElementosJSP.jsp">Regresar a index de Elementos JSP</a>
    </body>
</html>
