

package ejercicio1;

import ejercicio1_entidades.DNI;
import ejercicio1_entidades.Persona;
import java.util.LinkedList;


public class Ejercicio1 {

    
    public static void main(String[] args) {
              
        Persona p = new Persona();
        DNI d = new DNI();
        LinkedList<Persona> amigos = new LinkedList();
        
        d.setNumero(35579644);
        d.setSerie('A');
        p.setNombre("Jose");
        p.setApellido("Freytes");
        p.setDni(d);
        
        Persona p1 = new Persona();
        
        p1.setNombre("Alejandro");
        p1.setApellido("Meneses");
        
        amigos.add(p1);
        
        Persona p2 = new Persona();
        
        p2.setNombre("Marianela");
        p2.setApellido("Gorrini");
        
        amigos.add(p2);
        
        p.setAmigos(amigos);
  
        System.out.println(p.toString());
        
    }
    
}
