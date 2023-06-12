
package Ejercicio4_Guia11_Extra_Clases;


public class Alumno {
    private String nombreCompleto;
    private String dni;
    private int cantidadVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, String dni, int cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = 0;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }
    
    public void incrementarVotos() {
        cantidadVotos++;
    }
}
