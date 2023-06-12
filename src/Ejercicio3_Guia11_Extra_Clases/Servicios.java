
package Ejercicio3_Guia11_Extra_Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Servicios {
    
    Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    String verde = "\033[32m";
    
    
    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Vehiculo> vehiculos = new ArrayList();
    ArrayList<Poliza> polizas = new ArrayList();
    ArrayList<Cuota> cuotas = new ArrayList();
    //private int numeroPolizaActual;
    private int numeroCuotaActual;

        
    public void agregarCliente() {
                
        System.out.println(verde+ "** Ingrese los siguientes datos del Cliente** ");
        System.out.print("\nNombre: ");
        String nombre = sc.next();
        System.out.print("Apellido: ");
        String apellido = sc.next();
        System.out.print("Documento: ");
        String documento = sc.next();
        System.out.print("Mail: ");
        String mail = sc.next();
        System.out.print("Domicilio: ");
        String domicilio = sc.next();
        System.out.print("Telefono: ");
        String telefono = sc.next();

        Cliente cliente = new Cliente(nombre, apellido, documento, mail, domicilio, telefono);  
        clientes.add(cliente);
        System.out.println("");
        System.out.println(verde+"Cliente registrado correctamente !!");
        System.out.println("");
        
    }
      
      
    public void agregarVehiculo() {
        System.out.println(verde+ "** Ingrese los siguientes datos del Vehiculo** ");
        System.out.print("\nMarca: ");
        String marca = sc.next();
        System.out.print("Modelo: ");
        String modelo = sc.next();
        System.out.print("Año: ");
        int anio = Integer.parseInt(sc.next());
        sc.nextLine();
        System.out.print("Numero Motor: ");
        String numeroMotor = sc.next();
        System.out.print("Numero Chasis: ");
        String chasis = sc.next();
        System.out.print("Color: ");
        String color = sc.next();
        System.out.print("Tipo: ");
        String tipo = sc.next();

        Vehiculo vehiculo = new Vehiculo(marca, modelo, anio, numeroMotor, chasis, color, tipo);
        vehiculos.add(vehiculo);
        System.out.println("");
        System.out.println(verde+"Vehiculo registrado correctamente !!");
        System.out.println("");
        
    }
    
    
     public void agregarPoliza() throws ParseException {
        boolean incluyeGranizo = false;
        double montoMaximoGranizo = 0;
        
        System.out.println(verde+ "** Ingrese los datos de la Poliza** ");
        System.out.print("\nNumero: ");
        int numeroPoliza = Integer.parseInt(sc.next());
        System.out.print("Fecha Inicio (DD/MM/AAAA): ");
        String fechaInicioStr = sc.next();
        Date fechaInicio = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInicioStr);
        System.out.print("Fecha Finalizacion (DD/MM/AAAA): ");
        String fechaFinStr = sc.next();
        Date fechaFin = new SimpleDateFormat("dd/MM/yyyy").parse(fechaFinStr);
        System.out.print("Cantidad de Cuotas: ");
        int cantidadCuotas = sc.nextInt();
        System.out.print("Forma de pago: ");
        String formaPago = sc.next();
        System.out.print("Monto Total Asegurado: ");
        double montoTotalAsegurado = Double.parseDouble(sc.next());
        System.out.print("Incluye granizo? (SI/NO): ");
        String opc = sc.next();
        if (opc.equalsIgnoreCase("SI")) {
            System.out.print("Monto máximo por granizo: ");
            montoMaximoGranizo = sc.nextDouble();
            incluyeGranizo = true;
        }
        sc.nextLine();
        System.out.print("Tipo de Cobertura: ");
        String tipoCobertura = sc.next();
        
        System.out.println("");
        System.out.print("Seleccione un cliente (por numero de Documento):");
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            System.out.println((i + 1) + ". " + cliente.getDocumento() + " - " + cliente.getNombre());
        }
        int clienteIndex = sc.nextInt() - 1;
        Cliente cliente = clientes.get(clienteIndex);

        System.out.print("Seleccione un vehiculo (por numero de Chasis):");
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            System.out.println((i + 1) + ". " + vehiculo.getChasis() + " - " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        }
        int vehiculoIndex = sc.nextInt() - 1;
        Vehiculo vehiculo = vehiculos.get(vehiculoIndex);
        
        Poliza poliza = new Poliza(numeroPoliza, fechaInicio, fechaFin, cantidadCuotas, formaPago,
                montoTotalAsegurado, incluyeGranizo, montoMaximoGranizo, tipoCobertura, cliente, vehiculo);
        polizas.add(poliza);

        agregarCuota(poliza);
        System.out.println("");
        System.out.println(verde+"Poliza registrada correctamente !!");
        System.out.println("");
        
    }
     
    
    private void agregarCuota(Poliza poliza) {
        int cantidadCuotas = poliza.getCantidadCuotas();
        double montoTotalCuota = poliza.getMontoTotalAsegurado() / cantidadCuotas;
        String formaPago = poliza.getFormaPago();

        for (int i = 0; i < cantidadCuotas; i++) {
            int numeroCuota = numeroCuotaActual++;
            String fechaVencimiento = ""; // Lógica para calcular la fecha de vencimiento de la cuota
            boolean pagada = false;

            Cuota cuota = new Cuota(numeroCuota, montoTotalCuota, pagada, fechaVencimiento, formaPago);
            cuotas.add(cuota);
        }
    } 
     
    public void consultarCuotas() {
        
        System.out.println("Consulta de Cuotas");
        System.out.print("Ingrese el número de póliza: ");
        int numeroPoliza = sc.nextInt();
  
        List<Cuota> cuotasPoliza = new ArrayList();
        for (Cuota aux : cuotas) {
            if (aux.getNumeroCuota() == numeroPoliza) {
                cuotasPoliza.add(aux);
            }
        }

        if (cuotasPoliza.isEmpty()) {
            System.out.println("No se encontraron cuotas para la Poliza indicada.");
        } else {
            System.out.println("Cuotas de la Poliza " + numeroPoliza + ":");
            for (Cuota cuota : cuotasPoliza) {
                System.out.println("Numero de cuota: " + cuota.getNumeroCuota());
                System.out.println("Monto total de la cuota: " + cuota.getMontoTotalCuota());
                System.out.println("Pagada: " + cuota.pagada());
                System.out.println("Fecha de vencimiento: " + cuota.getFechaVencimiento());
                System.out.println("Forma de pago: " + cuota.getFormaPago());
                System.out.println();
            }
        }
    }
               
     public void listarClientes() {
        System.out.println(" ");
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            System.out.printf("%-3s %-15s %-15s ",(i + 1), cliente.getNombre(), cliente.getApellido());
            System.out.println("");
        }
    }

    
     public void listarVehiculos() {
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            System.out.print((i + 1) + ". " + vehiculo.getMarca() + " " + vehiculo.getModelo());
            System.out.println("");
        }
    }

     public void listarPolizas() {
        for (int i = 0; i < polizas.size(); i++) {
            Poliza poliza  = polizas.get(i);
            System.out.print((i + 1) + ". " + poliza.getNumeroPoliza() + " " + poliza.getFechaInicio()+ " " +poliza.getFechaFin() + " " + poliza.getCantidadCuotas());
            System.out.println("");
        }
    }
     
     
     
     
     // Metodo para limpiar pantalla
        public void limpiar(int lineas){
        for (int i=0; i < lineas; i++)
        {
        System.out.println();
        }
}
     
       
}