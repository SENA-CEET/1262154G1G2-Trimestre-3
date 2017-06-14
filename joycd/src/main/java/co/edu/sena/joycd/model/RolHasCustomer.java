package co.edu.sena.joycd.model;

/**
 * Created by Enrique on 13/06/2017.
 */
public class RolHasCustomer {
    private Rol rol;
    private Customer customer;
    private String status;

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RolHasCustomer that = (RolHasCustomer) o;

        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;
        return customer != null ? customer.equals(that.customer) : that.customer == null;
    }

    @Override
    public int hashCode() {
        int result = rol != null ? rol.hashCode() : 0;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        return result;
    }
}
