package co.edu.sena.programming.genericos.ejemplo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Enrique on 20/06/2017.
 */
public class CanastaGaseosa <E extends Gaseosa> {

    Collection<E> lista;

    public Collection<E> getLista() {
        return lista;
    }

    public void setLista(Collection<E> lista) {
        this.lista = lista;
    }
}
