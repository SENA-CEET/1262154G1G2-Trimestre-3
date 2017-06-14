package co.edu.sena.ejemplotostring;

/**
 * Created by Enrique on 8/06/2017.
 */
public class Producto {
    private String codigoSerial;
    private String nombreProducto;
    private float precio;
    private Item item;

    public String getCodigoSerial() {
        return codigoSerial;
    }

    public void setCodigoSerial(String codigoSerial) {
        this.codigoSerial = codigoSerial;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producto producto = (Producto) o;

        return codigoSerial != null ? codigoSerial.equals(producto.codigoSerial) : producto.codigoSerial == null;
    }

    @Override
    public int hashCode() {
        return codigoSerial != null ? codigoSerial.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigoSerial='" + codigoSerial + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +

                '}';
    }
}
