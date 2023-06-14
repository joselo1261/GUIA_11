
package Ejercicio4_Guia11_Extra_Clases_Otro;

import java.util.List;


public class Voto {
    private Alumno alumno;
    private List<Alumno> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumno alumno, List<Alumno> alumnosVotados) {
        this.alumno = alumno;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(List<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }
    
}
