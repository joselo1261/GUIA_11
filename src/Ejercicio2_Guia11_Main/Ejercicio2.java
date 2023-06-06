
package Ejercicio2_Guia11_Main;

import Ejercicio2_Guia11_Clases.Juego;
import Ejercicio2_Guia11_Clases.Jugador;
import Ejercicio2_Guia11_Clases.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio2 {

    
    // Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
    // un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
    // se dispara y se moja. Las clases por hacer del juego son las siguientes:
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        RevolverAgua revag = new RevolverAgua();
        
        System.out.println("Llenar Revolver");
        System.out.println("---------------");
        revag.llenarRevolver();
        System.out.println(revag);
        System.out.println(" ");
               
        if(revag.mojar()){
           System.out.print("\nLa posición del agua coincide con la posición actual");
           System.out.print("\nTe mojaste !!!!!");
        }else{
            System.out.print("\nLa posición del agua no coincide con la posición actual");
            System.out.print("\nEsta vez zafaste !!!!");
        }
        
        System.out.println(" ");
        System.out.println("\nSiguiente Chorro");
        System.out.println("----------------");
        revag.siguienteChorro();
        System.out.println(revag);
        System.out.println(" ");
        
               
        Juego juego = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList();
        
        System.out.print("Ingrese el número de jugadores (entre 1 y 6): ");
        int numJug = sc.nextInt();

        if (numJug < 1 || numJug > 6) {
            numJug = 6;
            System.out.println("Numero de jugador invalido. Se establecerá a 6 por defecto.");
        }
        
        for (int i = 1; i <= numJug; i++) {
            jugadores.add(new Jugador(i));
        }
        
        revag.llenarRevolver();
        
        juego.llenarJuego(jugadores, revag);
        juego.ronda();
        
        
        
    }
}
        
        
        
        
        
        
        
     
        
        
        
      
        
        
         
        
        
        
        
     
        
        
      