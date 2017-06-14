package co.edu.sena.pilallamada;

/**
 * Created by Enrique on 12/06/2017.
 */
public class ClaseUno  {

    public static void errorClaseUno(){

        try {
            ClaseDos.errorClaseDos();

        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("ocurrio un error y es este "+ e.getMessage());
        }


    }


}
