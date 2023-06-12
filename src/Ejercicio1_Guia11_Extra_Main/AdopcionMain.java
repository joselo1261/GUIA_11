
package Ejercicio1_Guia11_Extra_Main;

import Ejercicio1_Guia11_Extra_Clases.Adopcion;
import Ejercicio1_Guia11_Extra_Servcio.ServicioAdopcion;

public class AdopcionMain {

    
    public static void main(String[] args) {
        ServicioAdopcion sa=new ServicioAdopcion();
        
        Adopcion a =sa.ingresarPerrosPersonas();
        sa.adoptar(a);
        sa.mostrarPersonaConSuPerroAdoptadoDijoLaPaola(a);
        
        
        
        
    }
    
}
