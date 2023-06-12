
package Ejercicio1_Guia11_Extra_Clases;

import java.util.ArrayList;


public class Adopcion {
    private ArrayList <Persona> personas;
    private ArrayList <Perro> perros;

    public Adopcion() {
    }

    public Adopcion(ArrayList<Persona> personas, ArrayList<Perro> perros) {
        this.personas = personas;
        this.perros = perros;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }

        
}
