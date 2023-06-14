
package Ejercicio4_Guia11_Extra_Main_Otro;

import Ejercicio4_Guia11_Extra_Clases_Otro.Simulador;


public class Pulsos {

    
    public static void main(String[] args) {
        
        Simulador s = new Simulador();
        
        System.out.println(s.generarAlumnos());
        s.votacion();
        s.mostrarAlumnos();
        s.facilitadores(); 
        
}
    
}
