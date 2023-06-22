package data;

public class Vendedor {
    private String nombre;
    private String rut;
    private String direccion;
    private String estadocivil;
    public Vendedor(String nombre, String rut, String direccion, String estadocivil) {
        this.nombre = nombre;
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadocivil = estadocivil;

    }
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil ) {
        this.estadocivil = estadocivil;

    }

}
