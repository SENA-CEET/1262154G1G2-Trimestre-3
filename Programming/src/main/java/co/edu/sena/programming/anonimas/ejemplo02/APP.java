package co.edu.sena.programming.anonimas.ejemplo02;

/**
 * Created by Enrique on 14/06/2017.
 */
public class APP {
    public static void main(String[] args) {
        ClaseUno claseUno = new ClaseUno();
        InterfaceClaseDos claseDos = claseUno.getClaseDos();
        InterfaceClaseTres claseTres = claseDos.getClaseTres();
        InterfaceClaseCuatro claseCuatro = claseTres.getClaseCuatro();
        System.out.println(claseUno);
        System.out.println(claseDos);
        System.out.println(claseTres);
        System.out.println(claseCuatro);
    }
}
