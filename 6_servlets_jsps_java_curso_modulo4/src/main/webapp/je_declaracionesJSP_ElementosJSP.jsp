<%-- 
    Agregamos una declaracion de JPS
--%>

<%! 
    //Declaramos una variable con su metodo get
    private String usuario="Ramces";
    public String getUsuario(){
    return this.usuario;
    }

    //Declaramos un contador de visitas
    private int contadorVisitas=1;

    
%>
    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de Declaraciones JSP</title>
    </head>
    <body>
        <h1>Uso de Declaraciones JSP</h1>
        Valor de usuario por medio del atributo: <%= this.usuario%>
        <br>
        Valor de usuario por medio del metodo: <%= this.getUsuario() %>
        <br>
        Contador Visitas: <%= this.contadorVisitas++%>
    </body>
</html>
