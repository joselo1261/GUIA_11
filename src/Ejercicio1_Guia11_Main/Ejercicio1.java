
package Ejercicio1_Guia11_Main;

import Ejercicio1_Guia11_Clases.Perro;
import Ejercicio1_Guia11_Clases.Persona;


public class Ejercicio1 {

    
    public static void main(String[] args) {
        Persona p1= new Persona("vale", "penayo",31, 34566545);
        Persona p2= new Persona("jose", "perez", 40, 56567555);
        
        Perro pe1= new Perro("draco", "caniche", "grande", 2);
        Perro pe2= new Perro("cleo", "bull dog", "mediano", 5);
        
        p1.adoptar(pe2);
        p2.adoptar(pe1);
        p1.mostrar();
        p2.mostrar();
    }
    
}
