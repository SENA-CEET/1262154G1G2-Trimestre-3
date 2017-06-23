package co.edu.sena.programming.colecciones;

import java.util.*;

/**
 * Created by Enrique on 21/06/2017.
 */
public class Ejemplo01 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(5);
        lista.add(1);
        System.out.println("lista normal "+lista.size());
        for (Integer a:lista) {
            System.out.println(a);
        }


        Set<Integer> listaSinRepetidos = new HashSet<>();
        listaSinRepetidos.add(2);
        listaSinRepetidos.add(3);
        listaSinRepetidos.add(4);
        listaSinRepetidos.add(2);
        listaSinRepetidos.add(6);

        System.out.println("lista sin repetidos "+listaSinRepetidos.size());
        for (Integer a: listaSinRepetidos
             ) {
            System.out.println(a);
        }




        Set<Integer> listaSinRepetidosOrdenada = new TreeSet<>();
        listaSinRepetidosOrdenada.add(2);
        listaSinRepetidosOrdenada.add(3);
        listaSinRepetidosOrdenada.add(5);
        listaSinRepetidosOrdenada.add(21);
        listaSinRepetidosOrdenada.add(2);
        listaSinRepetidosOrdenada.add(4);
        listaSinRepetidosOrdenada.add(2);
        System.out.println("lista sin repetidos "+listaSinRepetidosOrdenada.size());
        for (Integer a:listaSinRepetidosOrdenada
             ) {
            System.out.println(a);
        }


        Stack<Integer> pila = new Stack();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        System.out.println("pila");

        pila.pop();

        for (Integer a:pila
             ) {
            System.out.println(a);
        }

        Queue<Integer> cola = new LinkedList();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);
        cola.add(6);
        cola.add(7);
        cola.poll();
        System.out.println("cola");
        for (Integer a:cola
             ) {
            System.out.println(a);
        }


        Map<Integer, String> matrizAsociativa = new HashMap<>();
        matrizAsociativa.put(1, "Uno");
        matrizAsociativa.put(2, "Dos");
        matrizAsociativa.put(3, "tres");
        matrizAsociativa.put(4, "cuatro");
        matrizAsociativa.put(null, "cinco");
        System.out.println("---"+matrizAsociativa.get(3));
        for (String a:matrizAsociativa.values()
             ) {
            System.out.println(a);
        }

        Deque<Integer> pila2 = new ArrayDeque<>();
        pila2.push(1);
        pila2.push(2);
        pila2.push(3);
        pila2.push(4);
        pila2.push(5);
        pila2.push(6);
        pila2.pop();
        System.out.println("pila con el deque");
        for (Integer a:pila2
             ) {
            System.out.println(a);
        }

        Deque<Integer> cola2 = new ArrayDeque<>();
        cola2.add(1);
        cola2.add(2);
        cola2.add(3);
        cola2.add(4);
        cola2.add(5);
        cola2.add(6);
        cola2.add(7);
        cola2.remove();

        System.out.println("cola con la interface deque");
        for (Integer a:cola2
             ) {
            cola2.remove();
            System.out.println(a);
        }
        cola2.remove();








    }
}
