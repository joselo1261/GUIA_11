
package Ejercicio1_Guia11_Extra_Servcio;

import Ejercicio1_Guia11_Extra_Clases.Adopcion;
import Ejercicio1_Guia11_Extra_Clases.Perro;
import Ejercicio1_Guia11_Extra_Clases.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAdopcion {
    
    Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Persona> personas = new ArrayList();
    private ArrayList<Perro> perros = new ArrayList();

    public Adopcion ingresarPerrosPersonas() {

        Adopcion a = new Adopcion();

//        private String nombre;
//    private String raza;
//    private Integer edad;
//    private String sexoAnimal ;
//    private String tamanioPerro ;
//    private boolean adoptado=false;
        System.out.println("----------------------Ingresar Perros--------------------");
        String resp = "s";
        do {
            Perro p = new Perro();
            System.out.println("Ingresar nombre del perro");
            p.setNombre(sc.next());
            System.out.println("Ingresar Raza");
            p.setRaza(sc.next());
            System.out.println("Ingresar Edad");
            p.setEdad(sc.nextInt());
            System.out.println("Ingresar Sexo");
            p.setSexoAnimal(sc.next());
            System.out.println("Ingresar Tamaño");
            p.setTamanioPerro(sc.next());

            perros.add(p);
            System.out.println("Desea ingresar otro perro?(s/n)");
            resp = sc.next();
        } while (!resp.equalsIgnoreCase("n"));

//          private String nombre;
//    private String apellido;
//    private Integer edad;
//    private Integer documento;
        resp = "s";
        System.out.println("----------------------Ingresar Personas--------------------");

        do {
            Persona p1 = new Persona();
            System.out.println("Ingresar nombre");
            p1.setNombre(sc.next());
            System.out.println("Ingresar apellido");
            p1.setApellido(sc.next());
            System.out.println("Ingresar edad");
            p1.setEdad(sc.nextInt());
            System.out.println("Ingresar DNI");
            p1.setDocumento(sc.nextInt());

            personas.add(p1);

            System.out.println("Desea ingresar otra persona?(s/n)");
            resp = sc.next();
        } while (!resp.equalsIgnoreCase("n"));
        a.setPerros(perros);
        a.setPersonas(personas);
        return a;
    }

    public void adoptar(Adopcion a) {

        for (Persona persona : a.getPersonas()) {
            System.out.println("Che " + persona.getNombre() + " que perro quere?");
            for (Perro perro : a.getPerros()) {

                System.out.print(" " + perro.getNombre() + ",");

            }

            String Adoptado = sc.next();
            for (int i = 0; i < a.getPerros().size(); i++) {

                if (a.getPerros().get(i).getNombre().equals(Adoptado)) {
                    if (a.getPerros().get(i).isAdoptado()) {

                        System.out.println("El perro ya tiene dueÃ±o");
                    } else {
                        persona.setPerro(a.getPerros().get(i));
                        a.getPerros().get(i).setAdoptado(true);
                    }
                }

            }

        }

    }
    
   public void mostrarPersonaConSuPerroAdoptadoDijoLaPaola(Adopcion a){
   
       for (Persona persona : a.getPersonas()) {
           System.out.println(persona);
       }
   }

}
