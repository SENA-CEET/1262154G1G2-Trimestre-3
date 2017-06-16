package co.edu.sena.programming.anonimas.ejemplo04;

/**
 * Created by Enrique on 15/06/2017.
 */
public class APP {
    public static void main(String[] args) {
        class Perro{

            private String color;

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }
        }
        Perro p1 = new Perro();
        System.out.println(p1);
        p1.setColor("Rojo");
        System.out.println(p1.getColor());

    }
}
