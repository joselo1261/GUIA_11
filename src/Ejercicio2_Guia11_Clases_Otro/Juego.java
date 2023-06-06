
package Ejercicio2_Guia11_Clases_Otro;


import java.util.Scanner;
import java.util.ArrayList;


public class Juego {
    Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Jugador> jugadores;
    private Revolver r = new Revolver();

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores){
        
        System.out.print("Ingrese la cantidad de jugadores: ");
        int cant = sc.nextInt();
        
        if (cant < 1) {
            cant = 1;
        } else if (cant > 6){
            cant = 6;
        }
        
        for (int i = 1; i < cant+1; i++) {
            
            System.out.print("Ingrese el nombre del Jugador Nro. " + i + " => ");
            Jugador jug = new Jugador(i, sc.next(),false);
            jugadores.add(jug);
            
        }
       
        
    }
    
    public boolean ronda(ArrayList<Jugador> jugadores){
        
        r.llenarRevolver();
        boolean terminar = true;
        System.out.println(" ");
        System.out.println("\t | Progreso |");
        System.out.println("--------------------------------------------------");
        
        while (terminar) {
            for (Jugador jugador : jugadores) {
                System.out.println(jugador.getNombre() + " " + r.toString()+" ");
                if (jugador.disparo(r)) {
                    System.out.println("Jugador Nro. " + jugador.getId() + " "+ jugador.getNombre() + " => se mojo !!!!. Se termino la partida.");
                    terminar = false;
                    break;
                }
            }
        }
        System.out.println("--------------------------------------------------");
        return terminar;
    }
    
    
}
