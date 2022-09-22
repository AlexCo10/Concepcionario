
package Modelo;

public class Persona {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private int contacto;
    private Vehiculo vehiculo;
    

    public Persona() {
        this.vehiculo = new Vehiculo();
    }

    public Persona(String cedula, String nombre, String apellido, int contacto, Vehiculo vehiculo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contacto = contacto;
        this.vehiculo = vehiculo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
    
    

    
    
    
    
}
