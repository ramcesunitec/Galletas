package e_web_CodigosEstado;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/E_servlet_CodigosEstado")
public class Servlet_CodigosEstado extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Simulando los valores correctos 
        String usuarioOk="ramces";
        String passwordOk="nancy";
        String usuario=request.getParameter("usuario");
        String password=request.getParameter("password");
        
        PrintWriter out=response.getWriter();
        if(usuarioOk.equals(usuario) && passwordOk.equals(password)){
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Codigos de estado</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("<h1>Datos correcto</h1>");
            out.print("<br/>");
            out.print("Usuario: "+usuario);
            out.print("<br/>");
            out.print("Password: "+password);
            out.print("</body>");
            out.print("</html>");
            
        }else{
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        out.close();
    }
}
