
package Ejercicio4_Guia11_Extra_Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;




public class Simulador {
    private List<String> nombres;
    private List<String> apellidos;

    public Simulador() {
        nombres = new ArrayList();
        apellidos = new ArrayList();
        cargarNombres();
        cargarApellidos();
    }

    private void cargarNombres() {
        nombres.add("Emiliano");
        nombres.add("Jose");
        nombres.add("Valeria");
        nombres.add("Alejandro");
        nombres.add("Ramiro");
        nombres.add("Julio");
        nombres.add("Maxi");
        nombres.add("Noelia");   
    }
    
    private void cargarApellidos() {
        apellidos.add("Sosa");
        apellidos.add("Gomez");
        apellidos.add("Perez");
        apellidos.add("Gonzalez");
        apellidos.add("Diaz");
        apellidos.add("Suarez");
        apellidos.add("Olarticoechea");
        apellidos.add("Garcia");
        
    }
    
    
    
    public List<Alumno> generarListadoAlumnos(int cantidad) {
        List<Alumno> alumnos = new ArrayList();
        List<String> dnis = generarDNI(cantidad);

        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            String nombreCompleto = generarNombreCompleto();
            String dni = dnis.get(i);
            Alumno alumno = new Alumno(nombreCompleto, dni,0);
            alumnos.add(alumno);
        }

        return alumnos;
    }

    
    private List<String> generarDNI(int cantidad) {
        List<String> dnis = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            int dni = random.nextInt(90000000) + 10000000; // Genera un DNI de 8 dígitos
            dnis.add(Integer.toString(dni));
        }
        return dnis;
    }
    
    
    private String generarNombreCompleto() {
        Random random = new Random();
        String nombre = nombres.get(random.nextInt(nombres.size()));
        String apellido = apellidos.get(random.nextInt(apellidos.size()));
        return nombre + " " + apellido;
    }
    
    
    public void votacion(List<Alumno> alumnos) {
        Random random = new Random();
        Set<Integer> votosRealizados = new HashSet<>();

        for (Alumno alumno : alumnos) {
            int votos = 0;
            Set<Integer> votosRealizadosPorAlumno = new HashSet<>();

            while (votos < 3) {
                int indiceVoto = random.nextInt(alumnos.size());
                Alumno alumnoVotado = alumnos.get(indiceVoto);

                if (!alumnoVotado.getDni().equals(alumno.getDni()) && !votosRealizados.contains(indiceVoto)
                        && !votosRealizadosPorAlumno.contains(indiceVoto)) {
                    alumnoVotado.incrementarVotos();
                    votosRealizados.add(indiceVoto);
                    votosRealizadosPorAlumno.add(indiceVoto);
                    votos++;
                }
            }
        }
    }

    
    
    public void mostrarResultados(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombreCompleto());
            System.out.println("DNI: " + alumno.getDni());
            System.out.println("Cantidad de votos: " + alumno.getCantidadVotos());
            System.out.println("Votos realizados:");
            List<String> votosRealizados = obtenerVotosRealizados(alumno, alumnos);
            for (String voto : votosRealizados) {
                System.out.println("- " + voto);
            }
            System.out.println();
        }
    }
    
    
    private List<String> obtenerVotosRealizados(Alumno alumno, List<Alumno> alumnos) {
        List<String> votosRealizados = new ArrayList<>();
        for (Alumno votado : alumnos) {
            if (votado.getCantidadVotos() > 0 && alumno.getNombreCompleto() != votado.getNombreCompleto()) {
                votosRealizados.add(votado.getNombreCompleto());
            }
        }
        return votosRealizados;
    }

    
    public void recuentoVotos(List<Alumno> alumnos) {
        List<Alumno> facilitadores = new ArrayList<>();
        List<Alumno> facilitadoresSuplentes = new ArrayList<>();

        Collections.sort(alumnos, (Alumno a1, Alumno a2) -> Integer.compare(a2.getCantidadVotos(), a1.getCantidadVotos()));

        for (int i = 0; i < 5; i++) {
            facilitadores.add(alumnos.get(i));
            facilitadoresSuplentes.add(alumnos.get(i + 5));
        }

        System.out.println("Facilitadores:");
        mostrarListadoAlumnos(facilitadores);

        System.out.println("Facilitadores Suplentes:");
        mostrarListadoAlumnos(facilitadoresSuplentes);
    }
    
    
    private void mostrarListadoAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombreCompleto());
            System.out.println("DNI: " + alumno.getDni());
            System.out.println("Cantidad de votos: " + alumno.getCantidadVotos());
            System.out.println();
        }
    }
}
    
   
