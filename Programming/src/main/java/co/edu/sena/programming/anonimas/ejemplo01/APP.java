package co.edu.sena.programming.anonimas.ejemplo01;

/**
 * Created by Enrique on 14/06/2017.
 */
public class APP {
    public static void main(String[] args) {
        ClaseUno claseUno = new ClaseUno();
        ClaseUno.ClaseDos claseDos = claseUno.new ClaseDos();
        ClaseUno.ClaseDos.ClaseTres claseTres = claseDos.new ClaseTres();
        ClaseUno.ClaseDos.ClaseTres.ClaseCuatro claseCuatro = claseTres.new ClaseCuatro();
        System.out.println(claseUno);
        System.out.println(claseDos);
        System.out.println(claseTres);
        System.out.println(claseCuatro);
    }

}
