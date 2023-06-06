
package Ejercicio2_Guia11_Clases;

import java.util.Random;


// Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
// del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
// tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
// Métodos:
// • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
// deben ser aleatorios.
// • mojar(): devuelve true si la posición del agua coincide con la posición actual
// • siguienteChorro(): cambia a la siguiente posición del tambor
// • toString(): muestra información del revolver (posición actual y donde está el agua)

public class RevolverAgua {
    private int posicionActual;
    private int posicionAgua;

    public RevolverAgua() {
    }

    public RevolverAgua(int posicionActual, int posicionAgua) {
        Random rand = new Random();
        this.posicionActual = rand.nextInt();
        this.posicionAgua = rand.nextInt();
    }
    
    

    public void llenarRevolver() {
        Random rand = new Random();
        posicionActual = rand.nextInt(6)+1;
        posicionAgua = rand.nextInt(6)+1;
         
    }
    
    public boolean mojar() {
        return posicionActual == posicionAgua;
    }
    
    public void siguienteChorro() {
        if (posicionActual == 6) {
            posicionActual = 1;
        } else {
            posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "Posicion Actual = " + posicionActual 
              + "\nPosicion Agua   = " + posicionAgua ;
    }
}
