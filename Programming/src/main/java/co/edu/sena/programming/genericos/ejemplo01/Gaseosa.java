package co.edu.sena.programming.genericos.ejemplo01;

/**
 * Created by Enrique on 20/06/2017.
 */
public class Gaseosa {
    private String marca;
    private float cantidad;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Gaseosa{" +
                "marca='" + marca + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
