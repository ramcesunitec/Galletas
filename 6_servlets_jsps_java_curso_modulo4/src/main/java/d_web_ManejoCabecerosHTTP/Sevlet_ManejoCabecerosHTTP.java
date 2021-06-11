package d_web_ManejoCabecerosHTTP;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/D_Servlet_ManejoCabecerosHTTP")
public class Sevlet_ManejoCabecerosHTTP extends HttpServlet{
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out=response.getWriter();
        String metodoHTTP=request.getMethod();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Headers HTTP</h1>");
        out.print("<br>");
        out.print("Metodo HTTP: "+metodoHTTP);
        
        String uri=request.getRequestURI();
        out.print("<br>");
        out.print("URI solicitada: "+uri);
        
        //Imprimimos todos los cabeceros disponibles
        out.print("</br>");
        out.print("</br>");
        Enumeration cabeceros=request.getHeaderNames();
        while(cabeceros.hasMoreElements()/*Analiza si hay mas cabeceros para iterar*/){
            String nombreCabecero=(String) cabeceros.nextElement();
            out.print("<b>"+nombreCabecero+"</b>");
            out.print(request.getHeader(nombreCabecero));//Imprimimos cabeceros
            out.print("</br>");
        }
        
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
