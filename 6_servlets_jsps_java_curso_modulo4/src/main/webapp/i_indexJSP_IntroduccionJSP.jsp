<%--   COMENTARIOS EN JSPS 
    Document   : i_indexJSP_IntroduccionJSP
    Created on : 15 jun 2021, 22:10:56
    Author     : ramce
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Introduccion JSP</title>
    </head>
    <body>
        <h1>Primer JSP</h1>
        <ul>
            <li><% out.print("Primer JSP con Scriplets"); %></li>
            <li>${"Expresion Languaje(EL)"}</li>
            <li><%= "Expresion; manda mensaje sin necesidad del out"%></li>
            <li><c:out value="Usando JSTL" /></li>
        </ul>
    </body>
</html>
