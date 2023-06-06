package Ejercicio3_Guia11_Main;

import Ejercicio3_Guia11_Clases.Baraja;
import java.util.Scanner;


// Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
// y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). 
// Esta clase debe contener un método toString() que retorne el número de carta y el palo. 
// La baraja estará compuesta por un conjunto de cartas, 40 exactamente.

public class Ejercicio3 {

   public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Baraja b = new Baraja();
        
        boolean salir = true;
        
        do {
            System.out.println("*------- JUEGO BARAJAS -------*");
            System.out.println("1. Barajar");
            System.out.println("2. Siguiente Carta");
            System.out.println("3. Dar Cartas");
            System.out.println("4. Mostrar Monton");
            System.out.println("5. Mostrar Baraja");
            System.out.println("6. Mostrar Cartas Disponibles");
            System.out.println("7. Imprimir en 'n' columnas");
            System.out.println("8. Limpiar Pantalla");
            System.out.println("9. Salir");
            System.out.println("===============================");
            System.out.print("Ingrese una Opción: ");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    b.barajar(); break;
                case 2:
                    b.siguienteCarta(); break;
                case 3:
                    b.darCartas(); break;
                case 4:
                    b.cartasMonton(); break;
                case 5:
                    b.mostrarBaraja(); break;
                case 6:
                    System.out.println("Cartas disponibles: " + b.cartasDisponibles()); break;
                case 7:
                    System.out.print("En cuantas columnas desea imprimir? ");
                    int cant=sc.nextInt();
                    b.mostrarColumnas(cant); break; 
                case 8:
                    b.limpiar(1000); break;  
                case 9:
                    System.out.println("Saludos.");
                    salir = false; break;
                default:
                    System.out.println("Opcion invalida. Vuelva a intentarlo.");
            }
        } while (salir);

    }
    
}
