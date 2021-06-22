<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    String fondo=request.getParameter("colorFondo");
    if(fondo==null||fondo.trim().equals("")){
        fondo="white";
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Cambio de color</title>
    </head>
    <body bgcolor="<%=fondo%>">
        <h1>JSP cambio de color</h1>
        <br>
        Color de fondo aplicado: <%=fondo%>
        <br>
        <br>
        <a href="j_index_ElementosJSP.jsp">Regresar a index de Elementos JSP</a>
    </body>
</html>
