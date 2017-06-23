package co.edu.sena.programming.comparadores.ejemplo01;

/**
 * Created by Enrique on 21/06/2017.
 */
public class APP {
    public static void main(String[] args) {
        Factura f1 = new Factura();
        f1.setIdFactura(10);
        f1.setTotal(1200000F);
        f1.setFormaPago("efectivo");


        Factura f2 = new Factura();
        f2.setIdFactura(2);
        f2.setTotal(1200000F);
        f2.setFormaPago("cheque");

        System.out.println(f1.compareTo(f2));


    }
}
