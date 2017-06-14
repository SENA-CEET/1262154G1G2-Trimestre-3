package co.edu.sena.joycd.model;

import java.util.List;

/**
 * Created by Enrique on 13/06/2017.
 */
public class Rol {
    private String rol;
    private String description;
    private String status;
    private List<RolHasCustomer> roles;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<RolHasCustomer> getRoles() {
        return roles;
    }

    public void setRoles(List<RolHasCustomer> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rol rol1 = (Rol) o;

        return rol != null ? rol.equals(rol1.rol) : rol1.rol == null;
    }

    @Override
    public int hashCode() {
        return rol != null ? rol.hashCode() : 0;
    }
}
