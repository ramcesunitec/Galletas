
package h_web_HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/H_servlet_ManejoSesionesHtml")
public class HttpSesionesServlet_HttpSession extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html; charset=UTF-8");
        
        HttpSession sesion=request.getSession();
        String titulo=null;
        
        //Pedir el atributo contadorVisitas a la sesion
        Integer contadorVisitas=(Integer) sesion.getAttribute("contadorVisitas");
        
        //Si es nulo es la primera vez que accedemos a la sesion
        if(contadorVisitas==null){
            contadorVisitas=1;
            titulo="BIENVENIDO POR PRIMERA VEZ";
            
        }else{
            contadorVisitas++;
            titulo="Bienvenido nuevamente";
        }
        
        //Agregamos el nuevo valor a la sesion
        sesion.setAttribute("contadorVisitar", contadorVisitas);
        
        //Mandamos respuesta al cliente
        PrintWriter out=response.getWriter();
        out.print(titulo);
        out.print("<br>");
        out.print("Numero de accesos al recurso: "+contadorVisitas);
        out.print("<br>");
        out.print("ID de la sesion: "+sesion.getId());
    }
}
