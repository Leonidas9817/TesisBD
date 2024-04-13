import java.util.Date;

public class Recibo {
    private int nroRecibo;
    private int nroFactura;
    private double importe;
    private Date fecha;

    public Recibo() {
    }

    public Recibo(int nroRecibo, int nroFactura, double importe, Date fecha) {
        this.nroRecibo = nroRecibo;
        this.nroFactura = nroFactura;
        this.importe = importe;
        this.fecha = fecha;
    }

    public int getNroRecibo() {
        return nroRecibo;
    }

    public void setNroRecibo(int nroRecibo) {
        this.nroRecibo = nroRecibo;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}

