package b_web_parametros;

import com.sun.net.httpserver.HttpsServer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/B_Servlet")
public class Servlet_Parametros extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //METODO POST 
        
        //Se leen los parametros del formulario creado en b_index.html
        String usuario=request.getParameter("usuario");
        String password=request.getParameter("password");
        
        System.out.println("Usario: "+usuario+"\nPassword: "+password);
        
        //Respuesta a cliente
        PrintWriter out= response.getWriter();//Abre una pagina Web con los comandos que tenga out
            //Se puede manejar codigo HTML desde este Servlet_Parametros pero recomienda en un JSP
        out.print("<html>"); //Se puede trabajar con print o printl pero por se codigo HTML no reconoce el salto de println
        out.print("<body>");
        out.print("El parametro usuario es: "+usuario);
        out.print("<br/>");
        out.print("El parametro password es: "+password);
        out.print("<br/>");
        out.print("<br/>");
        out.print("<br/>");
        out.print("<br/>");
        out.print("Se maneja codigo HTML desde este Servlet; se recomienda usar ccodigo HTML en JSP");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
