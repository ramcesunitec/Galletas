package datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import domain.Registro;

public class RegistroDaoJDBC implements RegistroDAO{

    private Connection conexionTransaccional;
    private static final String SQL_SELECT = "SELECT paquetes, precio_paquetes, total, fecha_compra FROM registro WHERE id='1'"; //  
    private static final String SQL_SELECT_VAL = "SELECT usuario,password FROM registro WHERE id='1'";
    private static final String SQL_UPDATE = "UPDATE registro SET paquetes=?, precio_paquetes=?, total=?, fecha_compra=? WHERE id='1'";
    private static final String SQL_DELETE = "DELETE FROM registro WHERE id='2'";
    
    public RegistroDaoJDBC() {
    }

    public RegistroDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Registro> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Registro registro = null;
        List<Registro> registros = new ArrayList<>();
        

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                int paquetes = Integer.parseInt(rs.getString("paquetes"));
                int precio_paquetes = Integer.parseInt(rs.getString("precio_paquetes"));
                int total = Integer.parseInt(rs.getString("total"));
                String fecha=rs.getString("fecha_compra");
                
                

                registro = new Registro(paquetes, precio_paquetes, total,fecha);
                registros.add(registro);
            }
        } finally {
                Conexion.close(rs);
                Conexion.close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }

        }
        return registros;
    }
    
    public List<Registro> validar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Registro registro = null;
        List<Registro> registros = new ArrayList<>();
        

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_VAL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");
                
                

                registro = new Registro(usuario, password);
                registros.add(registro);
            }
        } finally {
                Conexion.close(rs);
                Conexion.close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }

        }
        return registros;
    }

    public int actualizar(Registro registro) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int reg = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
                        

            String paquetes=String.valueOf(registro.getPaquetes());
            String precio_pa=String.valueOf(registro.getPrecio_paquetes());
            String total=String.valueOf(registro.getTotal());
            String fecha=registro.getFecha();
            
            System.out.println(" "+paquetes+" "+precio_pa+" "+total+" "+fecha);
            
            stmt.setInt(1, registro.getPaquetes());
            stmt.setInt(2, registro.getPrecio_paquetes());
            stmt.setInt(3, registro.getTotal());
            stmt.setString(4, registro.getFecha());
            

//            System.out.println(" "+paquetes+" "+precio_pa+" "+total);
            reg = stmt.executeUpdate();
            System.out.println("Registro actualizado");
        } finally {
                Conexion.close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
        }
        
        return reg;
    }

}
