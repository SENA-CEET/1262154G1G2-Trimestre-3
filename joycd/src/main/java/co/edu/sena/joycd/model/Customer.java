package co.edu.sena.joycd.model;

/**
 * Created by Enrique on 13/06/2017.
 */
public class Customer {
    private TypeDocument typeDocument;
    private String documentNumber;
    private String fistName;
    private String secondName;
    private String lastName;
    private String secondLastName;
    private RolHasCustomer rolHasCustomer;


    public TypeDocument getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(TypeDocument typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public RolHasCustomer getRolHasCustomer() {
        return rolHasCustomer;
    }

    public void setRolHasCustomer(RolHasCustomer rolHasCustomer) {
        this.rolHasCustomer = rolHasCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (typeDocument != null ? !typeDocument.equals(customer.typeDocument) : customer.typeDocument != null)
            return false;
        return documentNumber != null ? documentNumber.equals(customer.documentNumber) : customer.documentNumber == null;
    }

    @Override
    public int hashCode() {
        int result = typeDocument != null ? typeDocument.hashCode() : 0;
        result = 31 * result + (documentNumber != null ? documentNumber.hashCode() : 0);
        return result;
    }
}
