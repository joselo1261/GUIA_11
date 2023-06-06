
package Ejercicio2_Guia11_Clases_Otro;

import java.util.Random;



public class Revolver {
    Random random = new Random();
    
    private int posActual;
    private int posAgua;

    public Revolver() {
    }

    public Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }
    
    
    
    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }
    
    public void llenarRevolver() {
    
        posActual = random.nextInt(7);
        posAgua = random.nextInt(7);
        
        if (posActual == 0) {
            do {
            posActual = random.nextInt(7);
            } while (posActual == 0);
        }
        
        if (posAgua == 0) {
            do {
            posAgua = random.nextInt(7);
            } while (posAgua == 0);
        }
        
    
    }
    
    public boolean mojar(){
        return posActual == posAgua;
    }
    
    public void siguienteChorro() {
      
        if (posActual < 6) {
            posActual++;
        } else {
            posActual = 1;
        }
        
    }

    @Override
    public String toString() {
        return  "Posicion Actual: " + posActual + " <=> Posicion Agua: " + posAgua;
    }
 
}
