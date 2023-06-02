
package ejercicio1_entidades;

public class Auto {
    private Persona propietario;
    private String marca;
    private String modelo;
    private String color;

    public Auto() {
    }

    public Auto(Persona propietario, String marca, String modelo, String color) {
        this.propietario = propietario;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "propietario=" + propietario + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
}
