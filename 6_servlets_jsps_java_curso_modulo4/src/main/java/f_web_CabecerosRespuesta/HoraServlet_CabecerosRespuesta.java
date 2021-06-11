package f_web_CabecerosRespuesta;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/F_servletHoraServlet_CabecerosRespuesta")
public class HoraServlet_CabecerosRespuesta extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("refresh", "1");
        Date fecha = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("'Hora actualizada' HH:mm:ss");
        String horaConFormato = formateador.format(fecha);

        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Cabeceros Respuesta: HORA</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>");
        out.print(horaConFormato);
        out.print("</h1>");
        out.print("</body>");
        out.print("</html>");
        
        out.close();
    }
}
