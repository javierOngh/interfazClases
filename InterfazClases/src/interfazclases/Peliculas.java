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
public class Peliculas extends Visuales {
    private String Titulo[] = new String[5];
    private String Genero[] = new String[5];
    private String Creador[] = new String[5];
    private int Duracion[] = new int [5];
    private boolean Visto[] = new boolean[5];
    private int Año[] = new int[5];

    public Peliculas(String Titulo, String Genero, String Creador, int Duracion, boolean Visto , int Año) {
    }

    Peliculas() {
        Titulo[0] = "Sachi comilona";
        Titulo[1] = "Sachi Ladradora";
        Titulo[2] = "Sachi Corredora";
        Titulo[3] = "Sachi aulladora";
        Titulo[4] = "Sachi paseadora";
        Genero [0] = "Comedia";
        Genero [1] = "Accion";
        Genero [2] = "Policiaca";
        Genero [3] = "Drama";
        Genero [4] = "Romance";
        Creador [0] = "film.co"; 
        Creador [1] = "naviret.com"; 
        Creador [2] = "peli.co"; 
        Creador [3] = "vis.co"; 
        Creador [4] = "otr.co"; 
        Duracion[0] = 130;
        Duracion[1] = 110;
        Duracion[2] = 120;
        Duracion[3] = 150;
        Duracion[4] = 160;
        Visto[0] = true;
        Visto[1] = false;
        Visto[2] = true;
        Visto[3] = false;
        Visto[4] = true;
        Año[0] = 1987;
        Año[1] = 1988;
        Año[2] = 2019;
        Año[3] = 2017;
        Año[4] = 2015;
        //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @return the Año
     */
    public int[] getAño() {
        return Año;
    }

    /**
     * @param Año the Año to set
     */
    public void setAño(int Año[]) {
        this.Año = Año;
    }
//    public void PublicarProgramacion(String nombreClase){
//        //super.PublicarProgramacion(nombreClase);
//        String Titulo[] = new String[5];
//        Titulo [0] = "Tana Dormilona";
//        Titulo[1] = "Tana comilona";
//        Titulo[2] = "Tana Ladradora";
//        Titulo[3] = "Tana Corredora";
//        Titulo[4] = "Tana aulladora";
//        System.out.println("Año de realizacion:  "+Año);
//    }
    void main(String[] args) {
        System.out.println("Primera funcion - Titulo : " +Titulo[0]+"| Genero: "+Genero[0]+"| Productora : "+Creador[0]+"| Duracion :"+Duracion[0]+"| ¿Ya vista?"+Visto[0]+"| Año de realizacion:  "+Año[0]);
        System.out.println("Segunda funcion - Titulo : " +Titulo[1]+"| Genero: "+Genero[1]+"| Productora : "+Creador[1]+"| Duracion :"+Duracion[1]+"| ¿Ya vista?"+Visto[1]+"| Año de realizacion:  "+Año[1]);
        System.out.println("Tercera funcion - Titulo : " +Titulo[2]+"| Genero: "+Genero[2]+"| Productora : "+Creador[2]+"| Duracion :"+Duracion[2]+"| ¿Ya vista?"+Visto[2]+"| Año de realizacion:  "+Año[2]);
        System.out.println("Cuarta funcion - Titulo : " +Titulo[3]+"| Genero: "+Genero[3]+"| Productora : "+Creador[3]+"| Duracion :"+Duracion[3]+"| ¿Ya vista?"+Visto[3]+"| Año de realizacion:  "+Año[3]);
        System.out.println("Quinta funcion - Titulo : " +Titulo[4]+"| Genero: "+Genero[4]+"| Productora : "+Creador[4]+"| Duracion :"+Duracion[4]+"| ¿Ya vista?"+Visto[4]+"| Año de realizacion:  "+Año[4]);
    }

    /**
     * @return the Titulo
     */
    public String[] getTitulo() {
       return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String[] Titulo) {
        this.Titulo = Titulo;
        
        
    }

    /**
     * @return the Genero
     */
    public String[] getGenero() {
        return Genero;
    }

    /**
     * @param Genero the Genero to set
     */
    public void setGenero(String[] Genero) {
        this.Genero = Genero;
    }

    /**
     * @return the Creador
     */
    public String[] getCreador() {
        return Creador;
    }

    /**
     * @param Creador the Creador to set
     */
    public void setCreador(String[] Creador) {
        this.Creador = Creador;
    }

    /**
     * @return the Duracion
     */
    public int[] getDuracion() {
        return Duracion;
    }

    /**
     * @param Duracion the Duracion to set
     */
    public void setDuracion(int[] Duracion) {
        this.Duracion = Duracion;
    }

    /**
     * @return the Visto
     */
    public boolean[] getVisto() {
        return Visto;
    }

    /**
     * @param Visto the Visto to set
     */
    public void setVisto(boolean[] Visto) {
        this.Visto = Visto;
    }
}
