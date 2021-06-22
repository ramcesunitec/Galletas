
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scriptlets</title>
    </head>
    <body>
        <h1>Scriplets</h1>
        <br>
        <%-- Scriptlet para enviar informacion al navegador --%>
        <%
            out.print("Saludos desde un Scriptlet");
        %>
        
        <%-- Scriptlet para manipular los objetos implicitos --%>
        <%
            String nombreAplicacion=request.getContextPath();
            out.print("Nombre de la aplicacion: "+nombreAplicacion);
        %>
        <br>
        <%-- Scriptlet con codigo condicionado --%>
        <%
            if(session!=null&&session.isNew()){
        %>
        La session es nueva
        <%
            }else if(session!=null){
        %>
        La session no es nueva
        <%
            }   
        %>
        <br>
        <br>
        <a href="j_index_ElementosJSP.jsp">Regresar a index de Elementos JSP</a>
    </body>
</html>
