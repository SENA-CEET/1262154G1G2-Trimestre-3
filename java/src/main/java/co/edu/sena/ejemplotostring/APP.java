package co.edu.sena.ejemplotostring;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Enrique on 8/06/2017.
 */
public class APP {

    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.setCodigoSerial("123");
        Producto p2 = new Producto();
        p2.setCodigoSerial("124");
        Producto p3 = new Producto();
        p3.setCodigoSerial("125");

        Item i1= new Item();
        i1.setProducto(p1);
        Item i2= new Item();
        i2.setProducto(p2);
        Item i3= new Item();
        i3.setProducto(p3);

        Factura f1 = new Factura();
        f1.setItems(new ArrayList<Item>());
        f1.getItems().add(i1);
        f1.getItems().add(i2);
        f1.getItems().add(i3);
        f1.getItems().add(i3);

        System.out.println(f1);



    }
}
