package co.edu.sena.ejemplo01;

import java.util.List;

/**
 * Created by Enrique on 8/06/2017.
 */
public class TypeDocument {
    private String document;
    private String description;
    private boolean status;
    private List<Customer> customers;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
