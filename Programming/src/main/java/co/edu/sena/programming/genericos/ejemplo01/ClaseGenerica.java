package co.edu.sena.programming.genericos.ejemplo01;

import org.omg.CORBA.Object;

import java.io.Serializable;

/**
 * Created by Enrique on 20/06/2017.
 */
public class ClaseGenerica <T1, T2, T3, T4, T5> {

    private T1 atributo1;
    private T2 atributo2;
    private T3 atributo3;
    private T4 atributo4;
    private T5 atributo5;


    public T1 getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(T1 atributo1) {
        this.atributo1 = atributo1;
    }

    public T2 getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(T2 atributo2) {
        this.atributo2 = atributo2;
    }

    public T3 getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(T3 atributo3) {
        this.atributo3 = atributo3;
    }

    public T4 getAtributo4() {
        return atributo4;
    }

    public void setAtributo4(T4 atributo4) {
        this.atributo4 = atributo4;
    }

    public T5 getAtributo5() {
        return atributo5;
    }

    public void setAtributo5(T5 atributo5) {
        this.atributo5 = atributo5;
    }
}
