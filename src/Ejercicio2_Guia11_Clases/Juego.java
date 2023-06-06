
package Ejercicio2_Guia11_Clases;

import java.util.ArrayList;


// Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
// Revolver
// Métodos:
// • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
// y el revolver para guardarlos en los atributos del juego.
// • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
// aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
// moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
// mojar. Al final del juego, se debe mostrar que jugador se mojó.
// Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.

public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;
        
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    
    public void ronda() {
        boolean alguienMojado = false;
        
        while (!alguienMojado) {
            for (Jugador jugador : jugadores) {
                alguienMojado = jugador.disparo(revolver);
                if (alguienMojado) {
                    break;
                }
            }
        }
        
     for (Jugador jugador : jugadores) {
            if (jugador.estaMojado()) {
                System.out.println("¡El jugador " + jugador + " se ha mojado!");
                break;
            }
        }
    }
}

