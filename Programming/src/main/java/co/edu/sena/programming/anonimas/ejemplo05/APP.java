package co.edu.sena.programming.anonimas.ejemplo05;

/**
 * Created by Enrique on 15/06/2017.
 */
public class APP {
    public static void main(String[] args) {
        ClaseUno claseUno = new ClaseUno();
        ClaseUno.ClaseDos claseDos = new ClaseUno.ClaseDos();
        ClaseUno.ClaseDos.ClaseTres claseTres = new ClaseUno.ClaseDos.ClaseTres();
        ClaseUno.ClaseDos.ClaseTres.ClaseCuatro claseCuatro = new ClaseUno.ClaseDos.ClaseTres.ClaseCuatro();

        System.out.println(claseUno);
        System.out.println(claseDos);
        System.out.println(claseTres);
        System.out.println(claseCuatro);

    }
}
