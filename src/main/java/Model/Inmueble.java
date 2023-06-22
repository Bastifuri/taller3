package data;

public class Inmueble {
    private String tipoC;
    private String ciudad;
    private String direccion;
    private int precio;
    public Inmueble(String tipoC,String ciudad,String direccion, int precio) {
        this.tipoC= tipoC;
        this.ciudad= ciudad;
        this.direccion = direccion;
        this.precio = precio;
    }
    public String getTipoC() {
        return tipoC;
    }

    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
