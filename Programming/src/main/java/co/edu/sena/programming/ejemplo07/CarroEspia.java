package co.edu.sena.programming.ejemplo07;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * Created by Enrique on 16/06/2017.
 */
public class CarroEspia {
    private CarroBasic carroBasic = new CarroBasic();
    private Escotilla escotilla = new Escotilla();
    private AccesorioCarroEspia accesorioCarroEspia = new AccesorioCarroEspia();

    public void encender(){

        this.carroBasic.encender();
    }

    public void dispararCohete(){

        this.accesorioCarroEspia.dispararCohete();
    }

    public void abrirEscotilla(){
        this.escotilla.abrirEscotilla();

    }

    public void cerrarEscotilla(){
        this.escotilla.cerrarEscotilla();
    }


}
