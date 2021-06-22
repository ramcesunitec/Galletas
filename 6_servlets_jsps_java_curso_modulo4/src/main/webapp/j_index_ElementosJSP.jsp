<%-- 
    -EXPRESSIONS 
        Sintaxis: <%= expresion %>
        La expresion se evalua y se inserta en la salida de servlet
        Es equivalente a out.println(expresion)

    -SCRIPTLETS
        Sintaxis: <% codigoJava %>
        El codigo Jva se inserta en el metodo Service() del Servlet generado
        Puede ser cualquier codigo Java valido

    -DECLARACIONES
        Sintaxis <%! codigoJava %>
        Se utiliza para agregar codigo a la clase Servlet generado
        Se pueden declarar variables o metodos que pertenecen a la clase

    -SINTAXIS XLM   
        Cada elemento JSP tiene su equivalente en sitaxis XLM
        Esta sintaxis se utiliza para tener una mayor compatibilidad, por ejemplo, con herramientas visuales

    VARIABLES IMPLICITAS
        -request: Es el objeto HTTPServletRequest
        -response: Es el obejto HTTPServletResponse
        -out: Es el objeto JspWriter(Equivalente a PrintWriter)
        -session: Es el objeto HttpSession asociado con el objeto Request; se puede deshabilitar el uso de sesiones en un JSP
        -application: Es el objeto ServletContext que se obtiene a partir del metodo getServletContext() en un Servlet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Elementos JSPs</title>
    </head>
    <body>
        <h1>Elementos JSP</h1>
        <br/>
        <a href="ja_expressions_ElementosJSP.jsp">Expressions JSP</a>
        <br/>
        <br>
        <h4>Procesar Formulario con JSP</h4>
        <form name="form1" action="jb_procesaFormulario_ElementosJSP.jsp">
            Usuario: <input type="text" name="usuario">
            <br>
            Password: <input type="password" name="password">
            <br>
            <input type="submit" value="Enviar">
        </form>
        <br>
        <br>
        <a href="jc_scriptlets_ElementosJSP.jsp">Scriptlets con JSP</a>
        <br/>
        <br>
        <h4>Fondo color con JSP</h4>
        <form action="jd_FondoColor_ElementosJSP.jsp">
            Proporciona el color de fondo(Ej. red, blue, yellow, white, etc)
            <input type="text" name="colorFondo">
            <br>
            <input type="submit" value="Enviar">
        </form>
        <br>
        <br>
        <a href="je_declaracionesJSP_ElementosJSP.jsp">Declaraciones con JSP</a>
        <br>
        <br>
        <a href="jf_documentos_ElementosJSP.jspx">Documentos con JSPx(xml)</a>
    </body>
</html>
