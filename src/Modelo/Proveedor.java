
package Modelo;


public class Proveedor {
    private int ID;
    private int CUIT;
    private String nombre;
    private int telefono;
    private String direccion;
    private String razon;

    public Proveedor() {
    }

    public Proveedor(int ID, int CUIT, String nombre, int telefono, String direccion, String razon) {
        this.ID = ID;
        this.CUIT = CUIT;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.razon = razon;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
    
    
    
}
