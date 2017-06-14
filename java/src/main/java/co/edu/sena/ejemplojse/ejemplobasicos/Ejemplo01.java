package co.edu.sena.ejemplojse.ejemplobasicos;

/**
 * Created by Enrique on 7/06/2017.
 */
public class Ejemplo01 {
    public static void main(String[] args) {
        for(String i="|" , t= "------";i.length()<7;i+="|", t=t.substring(1)){
            System.out.println(i+t);


        }
        suma(2,4);

        Camisa c1 = new Camisa();

        Camisa c2 = c1;

        System.out.println(c1);
        System.out.println(c2);

    }

    private static int suma(int a, int b){
        return a+b;
    }
}
