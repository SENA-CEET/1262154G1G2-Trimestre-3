package co.edu.sena.ejemplo01;

import java.util.List;

/**
 * Created by Enrique on 8/06/2017.
 */
public class Customer {
    private TypeDocument typeDocument;
    private String numberDocument;
    private String firstName;
    private String secondName;
    private String fistLastName;
    private String secondLastName;
    private byte photo;


    public TypeDocument getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(TypeDocument typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFistLastName() {
        return fistLastName;
    }

    public void setFistLastName(String fistLastName) {
        this.fistLastName = fistLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public byte getPhoto() {
        return photo;
    }

    public void setPhoto(byte photo) {
        this.photo = photo;
    }
}
