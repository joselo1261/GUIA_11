

package Ejercicio2_Guia11_Clases;


// Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
// jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
// si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
// debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
// Métodos:
// • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
// mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
// revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
// devuelve true, sino false.

public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }
    
    
    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo(RevolverAgua revolv){
       if (revolv.mojar()) {
            System.err.println("Se ha Mojado !!!!");
            mojado = true;
            return true;
        }else{
            System.out.println("No se Mojo");
            revolv.siguienteChorro();
            mojado = false;
            return false;
        }
       
    
    }
    
    public boolean estaMojado() {
        return mojado;
    }
        
    @Override
    public String toString() {
        return nombre;
    }  
}

   
