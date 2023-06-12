
package Ejercicio1_Guia11_Extra_Clases;


public class Perro {
    
    private String nombre;
    private String raza;
    private Integer edad;
    private String sexoAnimal ;
    private String tamanioPerro ;
    private boolean adoptado=false; 

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String sexoAnimal, String tamanioPerro) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sexoAnimal = sexoAnimal;
        this.tamanioPerro = tamanioPerro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(String sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    public String getTamanioPerro() {
        return tamanioPerro;
    }

    public void setTamanioPerro(String tamanioPerro) {
        this.tamanioPerro = tamanioPerro;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }
    
    
}
