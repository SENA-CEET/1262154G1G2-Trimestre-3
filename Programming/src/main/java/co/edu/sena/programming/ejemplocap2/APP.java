package co.edu.sena.programming.ejemplocap2;

/**
 * Created by Enrique on 12/06/2017.
 */
public class APP {
    public static void main(String[] args) {
        String a ="hola";

        Empleado e = new Empleado();
        foo(e);

        System.out.println(e.getSalario());

        Empleado e1 = new Empleado();
        e1.nombre = "Fred";
        e= cambioNombre(e, "Bob");
        System.out.println(e.getNombre());

        System.out.println(promedio(1,2,3,4,5,6,7,8,9));
        System.out.println(promedio(1,2,3,4));
        System.out.println(promedio());


    }

    public static Empleado cambioNombre(Empleado e, String nombreNuevo){
        e.nombre= nombreNuevo;

        return e;
    }


    public static void foo(Empleado empleado){
        //empleado = new Empleado();
        empleado.setSalario(100000);


    }
    
    public static float promedio (int... arg){
        float suma=0, promedio;
        for (int numero:arg
             ) {
            suma=suma+numero;
        }
        promedio= suma/arg.length;
        return promedio;
    }
}
