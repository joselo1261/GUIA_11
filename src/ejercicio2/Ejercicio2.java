
package ejercicio2;

import ejercicio2_entidades.Equipo;
import ejercicio2_entidades.Jugadores;
import java.util.ArrayList;


public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<Jugadores> eq = new ArrayList();

        Jugadores j = new Jugadores("Jose", "Freytes", "Delantero", 10);
        eq.add(j);
        Jugadores j1 = new Jugadores("Nacho","Gimenez","Arquero",1);
        eq.add(j1);
        Jugadores j2 = new Jugadores("Jose Luis", "Elisseche", "Mediocampista", 5);
        eq.add(j2);
        Jugadores j3 = new Jugadores("Leonardo", "Baigorri", "Defensor", 2);
        eq.add(j3);
        
        Equipo e = new Equipo(eq);
        
        for (Jugadores jugadores : eq) {
            System.out.println(jugadores);
        }
        
    }
}
      
