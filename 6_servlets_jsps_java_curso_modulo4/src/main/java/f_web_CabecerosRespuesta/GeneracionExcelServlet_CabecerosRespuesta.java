package f_web_CabecerosRespuesta;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/F_servletGeneraExcel_CabecerosRespuesta")
public class GeneracionExcelServlet_CabecerosRespuesta extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Indicamos el tipo de respuesta al navegador
        response.setContentType("application/vnd.ms-excel"); //Responde con informacion de tipo Excel
        response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls"); //Con este cuando demos clic en el link se va descargar un Excel
        
        //Para un uso mas profesional de Excel se ocupa poi.apache.org
        
        //Indcamos al navegador que no guarde cache
        response.setHeader("Pragma", "no-cache"); //Indicamos que no guarda informacion anterior
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1); //Indicamos que la informacion expire de manera inmediata
        
        //Desplegamos informacion al cliente
        PrintWriter out=response.getWriter();
        out.println(("\tValores")); //A1=x=nada  B1=Valores
        out.println(("\t1")); //A2=x=nada  B2=1
        out.println(("\t2"));//A3=x=nada  B3=2
        out.println(("Total\t=SUMA(B2,B3)")); //A4=Total   B4=SUMA(B2+B3)
        out.close();
     }
}
