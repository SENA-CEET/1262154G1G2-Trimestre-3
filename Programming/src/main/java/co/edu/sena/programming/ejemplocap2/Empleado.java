package co.edu.sena.programming.ejemplocap2;

/**
 * Created by Enrique on 12/06/2017.
 */
public class Empleado {
    private double salario;
    public String nombre;
    protected String sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
