<%-- 
    -Las directivas nos permiten controlar un comportamiento de un JSP
    -Con las directivas podemos especificar:
        --Las clases Java que queremos importar en un JSP
        --El tipo MIME utilizado
        --Indicar si el JSP puede acceder a la sesion HTTP
        --El tamaño del buffer de salida
        --Indicar la pagina JSP de error en caso de una excepcion
        --El manejo de multihilos
    -Atributos en las directivas de un JSP
        --import: <%@page import="paquete.Clase1, paquete.ClaseN" %>
        --contentType: <%@page contentType="MIME-Type" %>
        --session: <%@page session="true" %>
        --isELIgnored: <%@page isELIgnored="false" %>
        --buffer: <%@page buffer="tamañoEnKb" %>
        --errorPage: <%@page errorPage="Url relativo al JSP de error" %>
        --isErrorPage: <%@page isErrorPage="true" %>
        --isThreadSafe: <%@page isThreadSafe="true" %>
        --extends: <%@page extends="paquete.NombreClase" %>
--%>

<%--Utilizamos la directiva errorPage para controlar las excepciones --%>
<%@page errorPage="/WEB-INF/ka_ManejoErrores_DirectivasJSP.jsp" %>
<%--Importamos las librerias y la clase Java con directivas --%>
<%@page import="k_utilerias_DirectivasJSP.ka_Conversiones, java.util.Date" %>
<%--Ocupamos otra directiva para indicar el tipo de contenido --%>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String nombreArchivo="reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename="+nombreArchivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reporte Excel JSP</title>
    </head>
    <body>
        <h1>Reporte Excel con JSP</h1>
        <br>
        <table border="q">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprenderemos la sintaxis basica de Java</td>
                <%-- Mostramos un error al colocar 500 en vez de new Date()para mostrar que la excepcion esta controlada --%>
                <td><%= ka_Conversiones.format("500") %></td>
                <%-- Codigo correcto sin el 500 
                <td><%= ka_Conversiones.format(new Date()) %></td>
                --%>
            </tr>
            <tr>
                <td>2. Programcion con Jva</td>
                <td>Pondremos en practica conceptos de la programacion orientada a objetos</td>
                <td><%= ka_Conversiones.format(new Date()) %></td>
            </tr>
        </table>
    </body>
</html>
