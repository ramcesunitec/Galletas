package domain;

public class Registro {

    private static String usuario;
    private static String password;
    private static int paquetes;
    private static int precio_paquetes;
    private static int total;
    private static String fecha;


    public Registro() {
    }

    public Registro(String usuario, String password, int paquetes, int precio_paquetes, int total) {

        this.usuario = usuario;
        this.password = password;
        this.paquetes = paquetes;
        this.precio_paquetes = precio_paquetes;
        this.total = total;
    }

    public Registro(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Registro(int paquetes, int precio_paquetes, int total, String fecha) {
        this.paquetes = paquetes;
        this.precio_paquetes = precio_paquetes;
        this.total = total;
        this.fecha = fecha;

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(int paquetes) {
        this.paquetes = paquetes;
    }

    public int getPrecio_paquetes() {
        return precio_paquetes;
    }

    public void setPrecio_paquetes(int precio_paquetes) {
        this.precio_paquetes = precio_paquetes;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static String getFecha() {
        return fecha;
    }

    public static void setFecha(String aFecha) {
        fecha = aFecha;
    }

    @Override
    public String toString() {
        return "Registro{" + "usuario=" + usuario + ", password=" + password + ", paquetes=" + paquetes + ", precio_paquetes=" + precio_paquetes + ", total=" + total + ", fecha=" + fecha + '}';
    }

}
