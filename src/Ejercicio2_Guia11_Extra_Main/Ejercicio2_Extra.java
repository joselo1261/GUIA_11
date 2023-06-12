
package Ejercicio2_Guia11_Extra_Main;

import Ejercicio2_Guia11_Extra_Clases.Cine;
import Ejercicio2_Guia11_Extra_Clases.Espectador;
import Ejercicio2_Guia11_Extra_Clases.Pelicula;
import java.text.SimpleDateFormat;
import java.util.Date;




public class Ejercicio2_Extra {

    
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Titanic", 180, 13, "James Cameron");
        Cine cine = new Cine(pelicula, 10.0);
        
        String verde = "\033[32m"; //<= Cambiar color texto
                
        System.out.println(verde+"************ CINE METROPOLITAN ************");
        Date date = new Date();
        System.out.print("Cartelera del dia => " + (new SimpleDateFormat("dd-MM-yyyy").format(date)));
        System.out.println("\n"+pelicula.toString());
        
        System.out.println("");
        String celeste = "\033[36m";
        System.out.println(celeste+"Operaciones realizadas");
        System.out.println(celeste+"......................");
        Espectador espectador1 = new Espectador("Juan", 15, 15.0);
        cine.venderEntrada(espectador1);

        Espectador espectador2 = new Espectador("María", 20, 5.0);
        cine.venderEntrada(espectador2);

        Espectador espectador3 = new Espectador("Pedro", 12, 12.0);
        cine.venderEntrada(espectador3);
        
        Espectador espectador4 = new Espectador("Jose", 35, 25.0);
        cine.venderEntrada(espectador4);

        Espectador espectador5 = new Espectador("Pedro", 28, 8.0);
        cine.venderEntrada(espectador5);

        Espectador espectador6 = new Espectador("Emma", 12, 20.0);
        cine.venderEntrada(espectador6);

        Espectador espectador7 = new Espectador("Leo", 35, 25.0);
        cine.venderEntrada(espectador7);

        Espectador espectador8 = new Espectador("Vale", 40, 25.0);
        cine.venderEntrada(espectador8);

        Espectador espectador9 = new Espectador("Agus", 22, 20.0);
        cine.venderEntrada(espectador9);

        Espectador espectador10 = new Espectador("Emi", 25, 35.0);
        cine.venderEntrada(espectador10);

        Espectador espectador11 = new Espectador("Dora", 40, 35.0);
        cine.venderEntrada(espectador11);

        Espectador espectador12 = new Espectador("Luciano", 40, 10.0);
        cine.venderEntrada(espectador12);

        Espectador espectador13 = new Espectador("Diego", 30, 25.0);
        cine.venderEntrada(espectador13);

        Espectador espectador14 = new Espectador("Kary", 28, 45.0);
        cine.venderEntrada(espectador14);

        Espectador espectador15 = new Espectador("Juan", 32, 22.0);
        cine.venderEntrada(espectador15);
        
        Espectador espectador16 = new Espectador("Juan", 15, 15.0);
        cine.venderEntrada(espectador16);

        Espectador espectador17= new Espectador("María", 20, 5.0);
        cine.venderEntrada(espectador17);

        Espectador espectador18 = new Espectador("Pedro", 12, 12.0);
        cine.venderEntrada(espectador18);
        
        Espectador espectador19 = new Espectador("Jose", 35, 25.0);
        cine.venderEntrada(espectador19);

        Espectador espectador20 = new Espectador("Pedro", 28, 8.0);
        cine.venderEntrada(espectador20);

        Espectador espectador21 = new Espectador("Emma", 12, 20.0);
        cine.venderEntrada(espectador21);

        Espectador espectador22 = new Espectador("Leo", 35, 25.0);
        cine.venderEntrada(espectador22);

        Espectador espectador23 = new Espectador("Vale", 40, 25.0);
        cine.venderEntrada(espectador23);

        Espectador espectador24 = new Espectador("Agus", 22, 20.0);
        cine.venderEntrada(espectador24);

        Espectador espectador25 = new Espectador("Emi", 25, 35.0);
        cine.venderEntrada(espectador25);

        Espectador espectador26 = new Espectador("Dora", 40, 35.0);
        cine.venderEntrada(espectador26);

        Espectador espectador27 = new Espectador("Luciano", 40, 10.0);
        cine.venderEntrada(espectador27);

        Espectador espectador28 = new Espectador("Diego", 30, 25.0);
        cine.venderEntrada(espectador28);

        Espectador espectador29 = new Espectador("Kary", 28, 45.0);
        cine.venderEntrada(espectador29);

        Espectador espectador30 = new Espectador("Juan", 32, 22.0);
        cine.venderEntrada(espectador30);


        cine.mostrarSala();
    }
}
