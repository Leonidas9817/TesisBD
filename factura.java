public class factura {
    private int nroFactura;
    private String nombre;
    private double importe;
    private boolean pendiente;

    // Constructor
    public factura(int nroFactura, String nombre, double importe, boolean pendiente) {
        this.nroFactura = nroFactura;
        this.nombre = nombre;
        this.importe = importe;
        this.pendiente = pendiente;
    }

    // Getters y Setters
    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isPendiente() {
        return pendiente;
    }

    public void setPendiente(boolean pendiente) {
        this.pendiente = pendiente;
    }

}
