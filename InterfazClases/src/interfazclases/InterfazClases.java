/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazclases;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.ArrayList;
import interfazclases.Visuales;
import interfazclases.Peliculas;

/**
 *
 * @author naviret
 */
public class InterfazClases {
    //ArrayList Peliculas[] = new ArrayList[5];
    //ArrayList Series [] = new ArrayList[5];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String Peliculas [] = new String[5];
        //Peliculas[0] = "Tana Dormilona "+" comedia "+" naviret "+5+" "+false;
        
        //Peliculas.getGenero;
        System.out.println(" Cartelera de Estrenos y\n Series disponibles ");
        System.out.println("----------------------");
        //System.out.println(Peliculas[0]);
        //Visuales PublicarProgramacion = new Visuales("Tana Dormilona", "comedia", "naviret", 5, false);
        //PublicarProgramacion.PublicarProgramacion(nombreClase);
//        Peliculas Peliculas = new Peliculas();
//        Peliculas.main(args);
        Visuales Visuales = new Visuales();
        Visuales.main(args);
        // TODO code application logic here
    }

//    public InterfazClases(String Titulo, String Genero, String Creador, int Duracion, boolean Visto) {
//        super(Titulo, Genero, Creador, Duracion, Visto);
//    }
    
}
