package datos;

import java.sql.SQLException;
import java.util.List;
import domain.Registro;

public interface RegistroDAO {
    
    public List<Registro> seleccionar()throws SQLException;
    public List<Registro> validar()throws SQLException;
    public int actualizar(Registro registro)throws SQLException;
}
