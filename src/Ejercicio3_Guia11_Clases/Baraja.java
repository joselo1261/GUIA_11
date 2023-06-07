
package Ejercicio3_Guia11_Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Baraja {
    private ArrayList<Cartas> cartas;
    Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Cartas> monton = new ArrayList();
    
    // Creamos el objeto Baraja
    public Baraja() {
        
        cartas = new ArrayList<>();
        String[] palos = {"espadas", "bastos", "oros", "copas"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    Cartas carta = new Cartas(numero, palo);
                    cartas.add(carta);
                }
            }
        }
    }
    
    // Metodo Barajar: cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        // Collections.suffle() : método usado para permutar aleatoriamente la lista especificada 
        // utilizando una fuente predeterminada de aleatoriedad.
        
        Collections.shuffle(cartas);
        mostrarBaraja();
        
    }

            
    // Metodo Siguiente Carta: devuelve la siguiente carta que esta en la baraja,
    // cuando no haya mas o se haya llegado al final, se indica al usuario 
    // que no hay mas cartas.
    public void siguienteCarta() {
        // lista.isEmpty() => verifica si la lista esta vacia o no
        
        System.out.println("-----------------------------------------------------------------");
        if (cartas.isEmpty()) {
            System.out.println("No hay mas cartas disponibles para repartir.");
        } else {

            System.out.println("La siguiente carta es: " + cartas.get(0));
            monton.add(cartas.get(0));
            cartas.remove(0);
            
        }
        System.out.println("-----------------------------------------------------------------");
    }
    
    // Metodo Dar Cartas: dado un numero de cartas que nos pidan, le devolveremos ese numero de
    // cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    // debemos indicarselo al usuario.
    public void darCartas() {
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Ingrese un numero de cartas a repartir: ");
        int nro = sc.nextInt();
        if (nro > cartasDisponibles()) {
            System.out.println("No es posible repartir esa cantidad de cartas. Restan " + cartasDisponibles() + " cartas.");
        } else {

            for (int i = 0; i < nro; i++) {
                monton.add(cartas.get(i));
                cartas.remove(i);
            }

            cartasMonton();
            mostrarBaraja();  
        }
        System.out.println("-----------------------------------------------------------------");
    }

    // Metodo Cartas Monton: mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    // indicarselo al usuario
    
    public void cartasMonton() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Cartas repartidas (" + monton.size() + "): ");
        System.out.println("-----------------------------------------------------------------");
        int columnas = 4;// <= Definir cantidad columnas de la impresion.
        int elementosPorColumna = (int) Math.ceil((double) monton.size() / columnas);
        for (int i = 0; i < elementosPorColumna; i++) {
            for (int j = 0; j < columnas; j++) {
                int index = i + j * elementosPorColumna;
                if (index < monton.size()) {
                    Cartas elemento = monton.get(index);
                    System.out.printf("%-1s %-15s","|", elemento);
                }
            }
            System.out.println();

        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Restantes: " + cartasDisponibles());
        System.out.println("-----------------------------------------------------------------");
    }

    
    // Metodo Mostrar Baraja: muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    // luego se llama al metodo, este no mostrara esa primera carta.
    
    public void mostrarBaraja() {
        System.out.println("-----------------------------------------------------------------");
        
        int columnas = 4; // <= Definir cantidad columnas de la impresion.
        int elementosPorColumna = (int) Math.ceil((double) cartas.size() / columnas);

        for (int i = 0; i < elementosPorColumna; i++) {
            for (int j = 0; j < columnas; j++) {
                int index = i + j * elementosPorColumna;
                if (index < cartas.size()) {
                    Cartas elemento = cartas.get(index);
                    System.out.printf("%-1s %-15s","|", elemento);
                }
            }
            System.out.println();

        }
        System.out.println("-----------------------------------------------------------------");
    }

    
    // Metodo Cartas Disponibles: indica el numero de cartas que aun se puede repartir.
    public int cartasDisponibles() {
        return cartas.size();
    }
    
    // Metodo para imprimir en n cantidad de columnas, segun decidamos.
    public void mostrarColumnas(int cant) {
        System.out.println("-----------------------------------------------------------------");
        int columnas = cant; 
        int elementosPorColumna = (int) Math.ceil((double) cartas.size() / columnas);
        System.out.println("Cantidad columnas: "+columnas);
        for (int i = 0; i < elementosPorColumna; i++) {
            for (int j = 0; j < columnas; j++) {
                int index = i + j * elementosPorColumna;
                if (index < cartas.size()) {
                    Cartas elemento = cartas.get(index);
                    System.out.printf("%-1s %-15s","|", elemento); // Ajusta el ancho de columna segun tus necesidades
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------");
    
    }
    
    
    // Metodo para limpiar pantalla
    public void limpiar(int lineas){
    for (int i=0; i < lineas; i++)
    {
    System.out.println();
    }
}
}


