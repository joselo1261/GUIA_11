package Ejercicio1_Guia11_Clases;


public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private Perro perro;
    //private List<Persona> persona;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    } 
    
    public void adoptar(Perro perro) {
        this.perro= perro;
    }
    
    public void mostrar() {
        System.out.println("\nDATOS DE LA PERSONA ADOPTANTE");
        System.out.println("Nombre: "+ nombre); 
        System.out.println("Apellido: " + apellido); 
        System.out.println("Edad: " + edad); 
        System.out.println("DNI: " + dni); 
        System.out.println("--------------------------------");
        System.out.println("\nDATOS DEL PERRO A ADOPTAR");
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Raza: " + perro.getRaza());
        System.out.println("Edad: " + perro.getEdad());
        System.out.println("Tamaño: " + perro.getTamanio());
        System.out.println("*********************************");
        System.out.println("*********************************");
     
        
    }
                 
}
