package co.edu.sena.programming.ejemplo03;

/**
 * Created by Enrique on 13/06/2017.
 */
public class APP {
    public static void main(String[] args) {
        Acount acct1 = new Cheking();
        Acount acct2 = new Savings();
        Savings acct3 = (Savings) acct1;

    }
}
