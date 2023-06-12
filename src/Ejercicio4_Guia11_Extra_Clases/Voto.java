
package Ejercicio4_Guia11_Extra_Clases;

import java.util.ArrayList;

public class Voto {
    private Alumno votante;
    private ArrayList<Alumno> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumno votante, ArrayList<Alumno> alumnosVotados) {
        this.votante = votante;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getVotante() {
        return votante;
    }

    public void setVotante(Alumno votante) {
        this.votante = votante;
    }

    public ArrayList<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(ArrayList<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }
    
    
    
}
