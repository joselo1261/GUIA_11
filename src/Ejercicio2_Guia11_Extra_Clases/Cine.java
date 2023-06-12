
package Ejercicio2_Guia11_Extra_Clases;

import java.util.Random;

public final class Cine {
    
    private Pelicula pelicula;
    private char[][] sala;
    private double precioEntrada;

    public Cine() {
    }
    
    public Cine(Pelicula pelicula, double precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.sala = new char[8][6];
        inicializarSala();
        
    }
    
    // Inicializar la sala con posiciones vacias
    public void inicializarSala() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][j] = ' ';
            }
        }
    }

   public void mostrarSala() {
        String amarillo = "\033[33m";
        String blanco = "\033[37m";
        String rojo = "\033[31m";
                
        System.out.println("");
        System.out.println(amarillo+"\t------- Estado de la Sala -------");
        System.out.println(amarillo+"*************************************************");
    for (int i = 7; i >= 0; i--) {
        for (int j = 0; j < 6; j++) {
            if (sala[i][j] == ' ') {
                System.out.print(blanco+"| " + String.format("%5s", (i + 1) + " " + (char) ('A' + j)) + " ");
            } else {
                System.out.print(rojo+"| " + String.format("%5s", sala[i][j]) + " ");
            }
        }
        System.out.println("|");
    }
        System.out.println(amarillo+"*************************************************");
        System.out.println("\033[0;1m"+rojo+"X => Vendidos");
        System.out.println("");
}
   
  
  // Metodo 1: Para vender entradas 
  public boolean venderEntrada(Espectador espectador) {
        
        String rojo = "\033[31m";
        String amarillo = "\033[33m";
                
        if (espectador.getEdad() < pelicula.getEdadMinima()) {
            System.out.println(rojo+espectador.getNombre() + " : No cumple con la edad mínima para ver la película.");
            return false;
        }

        if (espectador.getDineroDisponible() < precioEntrada) {
            System.out.println(amarillo+espectador.getNombre() + " : No tiene suficiente dinero para comprar la entrada.");
            return false;
        }

        Random random = new Random();
        int fila = random.nextInt(8);
        int columna = random.nextInt(6);

        while (sala[fila][columna] != ' ') {
            fila = random.nextInt(8);
            columna = random.nextInt(6);
        }

        // sala[fila][columna] = espectador.getNombre().charAt(0); //<= Muestra incial del comprador    
        sala[fila][columna] = 'X';
        //espectador.setDineroDisponible(espectador.getDineroDisponible() - precioEntrada);
        System.out.println(espectador.getNombre() + " : Ha comprado una entrada para la fila " + (fila + 1) +
                " y columna " + (char) ('A' + columna) + ".");

        return true;
    }
  
    // Metodo 2: Para vender entradas
    public void tuEntrada (int edadMin , double precioEnt, Espectador esp, char sala[][]){
        boolean cond=true;
        if (esp.getEdad()<edadMin) {
            System.out.println(esp.getNombre() +" : No cumple con la edad minima");
            cond=false;
        } else if(esp.getDineroDisponible()< precioEnt){
            System.out.println(esp.getNombre() + " : Tiene dinero insuficiente");
            cond=false;
        }
        if (cond) {
            Random random = new Random();
        int fila = random.nextInt(8);
        int col = random.nextInt(6);
                
        while (sala[fila][col] != ' ') {
            fila = random.nextInt(8);
            col = random.nextInt(6);
        }

        sala[fila][col] = 'X';
        System.out.println(esp.getNombre() + " ha comprado una entrada para la fila " + (fila + 1) +
                " y columna " + (char) ('A' + col) + ".");
        }
        
   
}
}