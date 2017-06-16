package co.edu.sena.programming.anonimas.ejemplo03;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by Enrique on 15/06/2017.
 */
public class APP {
    public static void main(String[] args) {
        InterfaceAvionComercial avionNomal = new InterfaceAvionComercial() {
            @Override
            public void cargar() {
                System.out.println("cargo el equipaje");
            }
            @Override
            public void apagar() {
                System.out.println("me apago");
            }
            @Override
            public void encender() {
                System.out.println("enciendo");
            }
        };
        System.out.println(avionNomal);
        avionNomal.cargar();
        avionNomal.apagar();
        avionNomal.encender();

        InterfaceAvionMilitar avionMilitar = new InterfaceAvionMilitar() {
            @Override
            public void disparar() {
                System.out.println("tatatatata");
            }

            @Override
            public void apagar() {
                System.out.println("me apago");
            }

            @Override
            public void encender() {
                System.out.println("enciendo");
            }
        };

        System.out.println(avionMilitar);
        avionMilitar.disparar();
        avionMilitar.apagar();
        avionMilitar.encender();
        System.out.println(avionMilitar.getClass().getCanonicalName());


        List<Integer> lista = new ArrayList<>();


        lista.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

            }
        });





    }
}
