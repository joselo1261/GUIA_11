
package Ejercicio3_Guia11_Clases;

public class Cartas {
 
    private int numero;
    private String palo;

    public Cartas() {
    }

    public Cartas(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }

     
}
