
package Ejercicio2_Guia11_Main_Otro;


import java.util.ArrayList;

import Ejercicio2_Guia11_Clases_Otro.Jugador;
import Ejercicio2_Guia11_Clases_Otro.Juego;

public class Ejercicio2_Otro {

    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList();
        Juego j = new Juego();
        
        System.out.println("\t|Ruleta Rusa|");
        System.out.println
        ("--------------------------------------------------");
        j.llenarJuego(jugadores);
        
        System.out.println("");
        System.out.println("\t|Lista de Jugadores|");
        System.out.println("--------------------------------------------------");
        
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.toString());
        }
        
        System.out.println("--------------------------------------------------");
        j.ronda(jugadores);
                    
    }
    
}
