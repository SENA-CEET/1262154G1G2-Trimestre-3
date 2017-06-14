package co.edu.sena.ejemplotostring;

/**
 * Created by Enrique on 8/06/2017.
 */
public class Item {
    private Producto producto;
    private int cantidad;
    private float valorVendido;
    private float totalProducto;
    private Factura factura;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(float valorVendido) {
        this.valorVendido = valorVendido;
    }

    public float getTotalProducto() {
        return totalProducto;
    }

    public void setTotalProducto(float totalProducto) {
        this.totalProducto = totalProducto;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Item{" +
                "producto=" + producto +
                ", cantidad=" + cantidad +
                ", valorVendido=" + valorVendido +
                ", totalProducto=" + totalProducto +

                '}';
    }
}
