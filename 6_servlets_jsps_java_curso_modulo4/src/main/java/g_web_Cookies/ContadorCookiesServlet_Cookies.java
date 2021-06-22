package g_web_Cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/G_servlet_ContadorCookies")
public class ContadorCookiesServlet_Cookies extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Declaramos variable contador
        int contador=0;
        
        //Revisamos si existe la cookie contadorVisitas
        Cookie[] cookies=request.getCookies();
        if(cookies!=null){
            for(Cookie c:cookies){
                if(c.getName().equals("contadorVisitas")){
                    contador=Integer.parseInt(c.getValue());
                    
                }
            }
        }
        
        //Incrementamos el contador a 1
        contador++;
        
        //Agregamos la respuesta al navegador
        Cookie c=new Cookie("contadorVisitas", Integer.toString(contador));
        
        //La cookie se almacenara en el cliente por una hora (3600 seg)
        c.setMaxAge(3600);
        
        response.addCookie(c);
        
        //mandamos el mensaje al navegador
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        out.print("Contador de visitas de cada cliente: "+contador);
                
    }
}
