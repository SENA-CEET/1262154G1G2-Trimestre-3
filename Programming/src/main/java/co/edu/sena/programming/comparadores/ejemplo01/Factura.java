package co.edu.sena.programming.comparadores.ejemplo01;

/**
 * Created by Enrique on 21/06/2017.
 */
public class Factura implements Comparable<Factura> {
    private int idFactura;
    private String formaPago;
    private float total;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public int compareTo(Factura o) {
        return this.idFactura-o.idFactura;
    }
}
