
package Ejercicio4_Guia11_Extra_Clases_Otro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;


    public class Simulador {
    List<Alumno> alumnos = new ArrayList();
    Random random = new Random();
    List<Long> dnis = new ArrayList();
    List<String> nombresCompletos = new ArrayList<>();
    String magenta = "\033[35m";
            
    public List<Alumno> generarAlumnos() {

        String[] nombres = {"Juan", "Maria", "Pedro", "Laura", "Carlos", "Ana", "Luis", "Marta", "Jose", "Elena","Nacho","Dora","Francisco","Agostina","Agustina","Agustin","Leonardo","Javier"};
        String[] apellidos = {"Garcia", "Lopez", "Rodriguez", "Martinez", "Fernandez", "Gonzalez", "Perez", "Sanchez", "Romero", "Torres","Gimenez","Abuaf","Freytes","Basualdo","Giampietro","Castro"};

        for (int i = 0; i < 20; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido = apellidos[random.nextInt(apellidos.length)];
            String nombreCompleto = nombre + " " + apellido;
            long dni = (long) (random.nextDouble() * 50000000L) + 10000000L;
            Alumno a = new Alumno(nombreCompleto,dni,0);
            dnis.add(dni); 
            nombresCompletos.add(nombreCompleto);
            alumnos.add(a);
        }
        
        return alumnos;
        
    }
    
//Crearemos un metodo votacion en la clase Simulador que, recibe el listado de alumnos y
//para cada alumno genera tres votos de manera aleatoria. En este metodo debemos
//guardar al alumno que vota, a los alumnos a los que voto y sumarle uno a la cantidad de
//votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
//Tener en cuenta que un alumno no puede votarse a si mismo o votar mas de una vez al
//mismo alumno. Utilizar un hashset para resolver esto.
    
    public void votacion() {
        
        ArrayList<Alumno> alumnosTemporal = new ArrayList<>(alumnos);
        
        for (int i = 0; i < alumnosTemporal.size(); i++) {
            
            Voto voto = new Voto();
            HashSet<Alumno> alumnosVotadosTemp = new HashSet<>();//3
            Alumno alumno = alumnosTemporal.get(i);
            
            System.out.println(magenta+"Votos de: " + alumno.getNombreCompleto());
            for (int j = 0; j < 3; j++) {
                Alumno alumnoVotado = alumnosTemporal.get(random.nextInt(alumnosTemporal.size()));
                if (!alumnoVotado.equals(alumno) && !alumnosVotadosTemp.contains(alumnoVotado)) {
                    System.out.println(alumnoVotado.getNombreCompleto());
                    voto.setAlumno(alumno);
                    alumnoVotado.setCantVotos(alumnoVotado.getCantVotos() + 1);
                    alumnosVotadosTemp.add(alumnoVotado);
                } else {
                    j--;
                }
            }
            System.out.println(magenta+"---------------------------------------------");
            ArrayList<Alumno> alumnosVotados = new ArrayList<>(alumnosVotadosTemp);
            voto.setAlumnosVotados(alumnosVotados);

        }
        System.out.println("Todos los alumnos votaron...\n");
    }
    
    
    public void mostrarAlumnos() {
        System.out.println(alumnos);
    }
    
//Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
//facilitadores suplentes con los 5 segundos alumnos mas votados. A continuacion, mostrar
//los 5 facilitadores y los 5 facilitadores suplentes.
    
    public void facilitadores(){
        
        ArrayList<Alumno> facilitadores = new ArrayList();
        ArrayList<Alumno> suplentes = new ArrayList();
        
        Collections.sort(alumnos, Comparator.comparingInt(Alumno::getCantVotos).reversed());
        
        System.out.println("ORDENADOS: ");
        
        for (int i = 0; i < 10; i++) {
            if (i<5) {
                facilitadores.add(alumnos.get(i));
            } else {
                suplentes.add(alumnos.get(i));
            }
        }
    
        System.out.println("Facilitadores: " + facilitadores);
        System.out.println("Suplentes: " + suplentes);
        
    }
    

}
