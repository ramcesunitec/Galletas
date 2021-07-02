<%-- 
    La inclusion de archivos es agregar un JSP dentro de otro JSP
    Hay dos formas de hacerlo:
        -Inclusion Estatica(translation time): 
            --SINTAXIS: <%@include file="paginaRelativa.jsp" %>
            --OBJETIVO: ---Reutilizar codigo en texto plano, HTML o JSP's
                        ---En este caso el JSP que se incluye puede afectar al JSP incluyente
            --NOTAS:    ---En este caso no se delega el control al JSP incluido, sino que se incluye el archivo JSP, genetando un unico JSP y Servlet
                        ---Por lo anterior, se pueden tener variables o metodos que se comparten entre los JSP's
                        ---Para tener la version mas reciente, se recomineda compilar y construir nuevamente el proyecto
        -Inclusion Dinamica(request time): 
            --SINTAXIS: <jsp:include page="PaginaRelativa.jsp" %> 
            --OBJETIVO: ---Reutilizar codigo en texto plano, HTML o JSP's
                        ---Permite actualizar el contenido sin alterar al JSP que invluye el contenido a reutilizar
            --NOTAS:    ---El JSP principal, delega el control al JSP incluido y la salida del JSP se agrega al JSP principal
                        ---No se comparten variables o metodos entro los JSP's, pero garantiza tener siempre su version mas reciente
                        ---La pagina debe ser relativa a la aplicacion Web(uso de /)
                        ---Se pueden incluir archivos privados (desde la carpeta WEB-INF)
            
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inclusion Archivos JSP</title>
    </head>
    <body>
        <h1>Inclusion Archivos JSP</h1>
    </body>
</html>
