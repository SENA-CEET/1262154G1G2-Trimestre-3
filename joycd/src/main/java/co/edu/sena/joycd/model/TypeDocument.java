package co.edu.sena.joycd.model;

import java.util.List;
/**
 * Created by Enrique on 13/06/2017.
 */
public class TypeDocument {
    private String typeDocument;
    private String nameTypeDocument;
    private boolean status;
    private List<Customer> customers;

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getNameTypeDocument() {
        return nameTypeDocument;
    }

    public void setNameTypeDocument(String nameTypeDocument) {
        this.nameTypeDocument = nameTypeDocument;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeDocument that = (TypeDocument) o;

        return typeDocument != null ? typeDocument.equals(that.typeDocument) : that.typeDocument == null;
    }

    @Override
    public int hashCode() {
        return typeDocument != null ? typeDocument.hashCode() : 0;
    }
}
