package co.edu.sena.programming.ejemplo05;

/**
 * Created by Enrique on 14/06/2017.
 */
public class Ejemplo05 {
    public static void main(String[] args) {
        Impuesto a = new Impuesto();
        System.out.println(a.po.ordinal());
        boolean ab = Boolean.TRUE;

        System.out.println(PowerState.OFF.ordinal());
        System.out.println(PowerState.ON.ordinal());
        System.out.println(PowerState.SUSPEND.ordinal());

        PowerState[] powerStatesArray = PowerState.values();
        for (PowerState p:powerStatesArray
             ) {
            System.out.println(p);
        }

    }

    public int suma (final int a, final int b){
        final int c= 3;
        return a+b;
    }

}
