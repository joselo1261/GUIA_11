
package Ejercicio3_Guia11_Extra_Main;

import Ejercicio3_Guia11_Extra_Clases.Servicios;
import java.text.ParseException;
import java.util.Scanner;


public class Seguros {

    
    public static void main(String[] args) throws ParseException {
        
        String verde = "\033[32m";
        Servicios serv = new Servicios();
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

        boolean salir = true;
        
        do {
            System.out.println(verde + "*-------- SEGUROS LA TERCERA --------*");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Agregar Vehiculo");
            System.out.println("3. Agregar Poliza");
            System.out.println("4. Consultar Cuotas");
            System.out.println("5. Listar Clientes");
            System.out.println("6. Listar Vehiculos");
            System.out.println("7. Listar Polizas");
            System.out.println("8. Limpiar Pantalla");
            System.out.println("9. Salir");
            System.out.println(verde+"*====================================*");
            System.out.println("");
            System.out.print("Ingrese una Opción: ");
                        
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    serv.agregarCliente(); break;
                case 2:
                    serv.agregarVehiculo(); break;
                case 3:
                    serv.agregarPoliza(); break;
                case 4:
                    serv.consultarCuotas(); break;
                case 5:    
                    serv.listarClientes();break;
                case 6:    
                    serv.listarVehiculos();break;   
                case 7:    
                    serv.listarPolizas();break;       
                case 8:
                    serv.limpiar(1000);break;
                case 9:
                    System.err.println("Hasta la Proxima !!!!!!\n");
                    salir = false;
                    System.out.println(""); break;
                default:
                    System.err.println("Opcion Incorrecta. Vuelva a intentarlo.");
                    System.out.println("");
            }
            
        } while (salir);
}

}
   