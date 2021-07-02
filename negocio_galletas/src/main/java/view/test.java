/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import datos.Conexion;
import datos.RegistroDAO;
import datos.RegistroDaoJDBC;
import domain.Registro;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ramce
 */
public class test {
    public static void main(String[] args) {
        Connection conexion=null;
        try{
            conexion=Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            RegistroDAO registroDAO=new RegistroDaoJDBC(conexion);
            Registro r=new Registro();
            
            //MOSTRAR PAQUETES PRECIO_PAQUETES TOTAL
            List<Registro> registros=registroDAO.seleccionar();
            for(Registro registro:registros){
                System.out.println("Registro DTO= "+registro);
            }
            
            //MOSTRAR USUARIO Y CONTRASEÑA
            List<Registro> regs=registroDAO.validar();
            for(Registro reg:regs){
                System.out.println("Registro Usuario y contraseña: "+reg);
            }
            
            
            System.out.println("usuario: "+r.getUsuario());
            
            String total=String.valueOf(r.getTotal());
            System.out.println("total: "+total);
            
             //ACTULIZAR REGISTRO
            Registro g=new Registro();
            int pa=5;
            int pp=26;
            int t=8;
            
            int paf=g.getPaquetes()-pa;
            int ppf=g.getPrecio_paquetes()-pp;
            int ptf=g.getTotal()-t;
            
            System.out.println("Paquetes= "+paf+"\nPrecio de Paquetes: "+ppf+"\nTotal: "+ptf);
            
            g.setPaquetes(paf);
            g.setPrecio_paquetes(ppf);
            g.setTotal(ptf);
            registroDAO.actualizar(g);
            
            System.out.println(" "+g.getPaquetes()+" "+g.getPrecio_paquetes()+" "+g.getTotal());
            conexion.commit();
            
            
            List<Registro> rgs=registroDAO.seleccionar();
            for(Registro rg:rgs){
                System.out.println(" 2.- Registro DTO= "+rg);
            }
                    
            
            
        }catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
                try {
                    conexion.rollback();
                } catch (SQLException ex1) {
                    ex1.printStackTrace(System.out);
                }
        }
    }
   
}
