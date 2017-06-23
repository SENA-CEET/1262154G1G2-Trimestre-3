package co.edu.sena.programming.genericos.ejemplo01;

/**
 * Created by Enrique on 20/06/2017.
 */
public class Papa {
    private String nombre;
    private String marca;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Papa{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
