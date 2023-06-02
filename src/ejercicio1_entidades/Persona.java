
package ejercicio1_entidades;

import java.util.List;

public class Persona {
    
    private String nombre;
    private String apellido;
    private DNI dni;
    private List<Auto> autos;    
    private List<Persona> amigos;

    public Persona(List<Persona> amigos, String nombre, String apellido, DNI dni, List<Auto> autos) {
        this.amigos = amigos;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.autos = autos;
    }

    public List<Persona> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Persona> amigos) {
        this.amigos = amigos;
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

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + "\ndni=" + dni + "\nautos=" + autos + "\namigos=" + amigos + '}';
    }
    
    public Persona() {
    }
    
  
}
