package co.edu.sena.programming.ejemplo051;

/**
 * Created by Enrique on 14/06/2017.
 */
public enum EstadosComputador {
    APAGADO("El computador esta apagado"),
    PRENDIDO("El computador esta prendido"),
    SUSPENDIDO("El compuatador esta suspendido")
    ;



    private String descripcion;

    private EstadosComputador(String d) {
        this.descripcion = d;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
