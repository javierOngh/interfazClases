/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazclases;

/**
 *
 * @author naviret
 */
public class Visuales {
    //private String Titulo;
    String Titulo[] = new String[5];
    private String Genero;
    private String Creador;
    private int Duracion;
    private boolean Visto;
    Visuales(String Titulo, String Genero, String Creador, int Duracion, boolean Visto){
        this.Creador = Creador;
        this.Duracion = Duracion;
        this.Genero = Genero;
        //this.Titulo = Titulo;
        this.Visto = Visto;
    }

    Visuales() {
        this.Creador = Creador;
        this.Duracion = Duracion;
        this.Genero = Genero;
        this.Titulo = Titulo;
        this.Visto = Visto;
        Titulo[0]= "Pelicula";
    }
    
    public  void PublicarProgramacion(String nombreClase){
        System.out.println(nombreClase);
        System.out.println("Titulo:  "+Titulo);
        System.out.println("Tipo:  "+Genero);
        System.out.println("Autor:  "+Creador);
        System.out.println("Duracion:  "+Duracion);
        System.out.println("¿Ya vista?:  "+Visto);
    }

    void main(String[] args) {
        //System.out.println(nombreClase);
        System.out.println("Intento metodico");
        System.out.println("Titulo:  "+Titulo[0]);
        System.out.println("Tipo:  "+Genero);
        System.out.println("Autor:  "+Creador);
        System.out.println("Duracion:  "+Duracion);
        System.out.println("¿Ya vista?:  "+Visto);
        System.out.println("----------------------");
        System.out.println("Mi intento");
        Peliculas Peliculas = new Peliculas();
        Peliculas.main(args);
        System.out.println("----------------------");
        Serie Serie = new Serie();
        Serie.main(args);
    }
}
