
package Ejercicio4_Guia11_Extra_Main;

import Ejercicio4_Guia11_Extra_Clases.Alumno;
import Ejercicio4_Guia11_Extra_Clases.Simulador;
import java.util.List;

public class Servicio {

  
    public static void main(String[] args) {
        Simulador simulador = new Simulador();
        List<Alumno> alumnos = simulador.generarListadoAlumnos(5);

        simulador.votacion(alumnos);
        simulador.mostrarResultados(alumnos);
        simulador.recuentoVotos(alumnos);
    }
}
        
        
        
        

