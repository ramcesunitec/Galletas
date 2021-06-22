package h_web_HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/H_servlet_CarritoComprasSesionesHttp")
public class CarritoComprasServlet_HttpSessions extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        //Creeamos o recuperamos el objeto http Session
        HttpSession sesion = request.getSession();

        //Recuperamos las lista de articulos agregados previamente si existen
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //Verificamos si la lista de articulos existe
        if (articulos == null) {
            //Iniciamos la lista de articulos
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        //Procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");

        //Revisamos y agregamos el articulo nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        try (
                //Imprimimos la lista de articulos
                 PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de articulos</h1>");
            out.print("<br>");
            //Iteramos todos los articulos
            for (String articulo : articulos) {
                out.print("<li>" + articulo + "</li>");
            }
            out.print("<br>");
            out.print("<a href='/6_servlets_jsps_java_curso_modulo4/h_index_HTTPSession.html'>Regresar a la pagina de HttpSession</a>");
        }

    }
}
