
package ejercicio2_entidades;

public class Jugadores {
    private String nombre;
    private String apellido;
    private String posicion;
    private int numero;

    public Jugadores(String nombre, String apellido, String posicion, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    public Jugadores() {
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", numero=" + numero + '}';
    }
    
}  
    