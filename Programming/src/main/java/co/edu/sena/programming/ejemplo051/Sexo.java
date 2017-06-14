package co.edu.sena.programming.ejemplo051;

/**
 * Created by Enrique on 14/06/2017.
 */
public enum  Sexo {
    F("Femenino",2), M("Masculino", 3);

    private String sexo;
    private int codigo;
    private Sexo(String sexo, int codigo) {
        this.sexo= sexo;
        this.codigo=codigo;
    }

    public String getSexo() {
        return sexo;
    }

    public int getCodigo() {
        return codigo;
    }
}
