package co.edu.sena.programming.genericos.ejemplo01;

import java.util.*;

/**
 * Created by Enrique on 20/06/2017.
 */
public class APP {
    public static void main(String[] args) {

        ClaseGenerica<String, String , String, String, byte[]> usuario = new ClaseGenerica<>();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "UNO");
        map.put(2, "DOS");
        map.put(3, "TRES");
        map.put(4, "TRES");
        map.put(5, "TRES");

        for (String a:map.values()
             ) {
            System.out.println(a);
        }


        Papa p1 = new Papa();
        p1.setMarca("Margarita");
        p1.setNombre("Natural");
        Papa p2 = new Papa();
        p2.setMarca("SuperRicas");
        p2.setNombre("Natural");

        Papa [] papas = new Papa[2];
        papas[0] = p1;
        papas[1] = p2;


        imprimir(papas);


        CanastaGaseosa<Gaseosa350> canasta = new CanastaGaseosa<>();
        canasta.setLista(new ArrayList<>());
        canasta.getLista().add(new Gaseosa350());
        canasta.getLista().add(new Gaseosa350());
        //canasta.getLista().add(new GaseosaLitro());

        System.out.println(concatenarArreglo(canasta.getLista()));


        imprimirLista(canasta.getLista());

        //java 1
        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add("1");
        lista.add('1');
        lista.add(new String("1"));

        for (Object o: lista
             ) {
            if(o instanceof Integer){

            }else if(o instanceof Character){


            } else if(o instanceof String){

            }
        }








    }

    public static <E> void imprimir(E[] arreglo){
        for (E var: arreglo
             ) {
            System.out.println(var.toString());
        }
    }

    public static <E> String concatenarArreglo(Collection<E> lista){
        String con = "";
        for (E var: lista
             ) {
            con = con+ var+ " ";
        }
        return con;
    }

    public static <E> void imprimirLista (Collection<? extends E> lista){
        for (E var: lista
             ) {
            System.out.println(var.toString());
            System.out.println(var.getClass().getCanonicalName());
        }

    }

}
