package co.edu.sena.ejemplotostring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by Enrique on 8/06/2017.
 */
public class Factura {
    private int numeroFacura;
    private Date fecha;
    private Collection<Item> items;

    public int getNumeroFacura() {
        return numeroFacura;
    }

    public void setNumeroFacura(int numeroFacura) {
        this.numeroFacura = numeroFacura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Collection<Item> getItems() {
        return items;
    }

    public void setItems(Collection<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numeroFacura=" + numeroFacura +
                ", fecha=" + fecha +
                ", items=" + items +
                '}';
    }
}
