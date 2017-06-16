package co.edu.sena.programming.anonimas.ejemplo06;

/**
 * Created by Enrique on 15/06/2017.
 */
public class APP {
    public static void main(String[] args) {
        ClaseUno claseUno = new ClaseUno();
        InterfaceClaseDos claseDos = new ClaseUno.ClaseDos();
        InterfaceClaseTres claseTres = new ClaseUno.ClaseDos.ClaseTres();
        InterfaceClaseCuatro claseCuatro = new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro();


        if(claseDos instanceof InterfaceClaseDos){
            System.out.println("verdad");
        }else{
            System.out.println("falso");
        }

    }
}
