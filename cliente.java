public class cliente {
    private int IDCliente;
    private String nombre;
    private String domicilio;
    private String cuit;

    // Constructor
    public cliente(int IDCliente, String nombre, String domicilio, String cuit) {
        this.IDCliente = IDCliente;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.cuit = cuit;
    }

    // Getters y Setters
    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
}
