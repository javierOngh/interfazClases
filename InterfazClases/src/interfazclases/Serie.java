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
public class Serie extends Visuales {
    private String Titulo[] = new String[5];
    private String Genero[] = new String[5];
    private String Creador[] = new String[5];
    private int Duracion[] = new int [5];
    private boolean Visto[] = new boolean[5];
    private int NoTemporadas[] = new int[5];

    public Serie(String Titulo, String Genero, String Creador, int Duracion, boolean Visto, int NoTemporadas) {
        //super(Titulo, Genero, Creador, Duracion, Visto);
    }

    Serie() {
        Titulo[0] = "Sachi en la ciudad";
        Titulo[1] = "Sachi viaja";
        Titulo[2] = "Sachi y sus amigos";
        Titulo[3] = "Sachi triunfa";
        Titulo[4] = "Simplemente Sachi";
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
        Duracion[0] = 40;
        Duracion[1] = 30;
        Duracion[2] = 50;
        Duracion[3] = 35;
        Duracion[4] = 60;
        Visto[0] = false;
        Visto[1] = true;
        Visto[2] = true;
        Visto[3] = true;
        Visto[4] = false;
        NoTemporadas[0] = 10;
        NoTemporadas[1] = 8;
        NoTemporadas[2] = 7;
        NoTemporadas[3] = 6;
        NoTemporadas[4] = 5;
       //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the NoTemporadas
     */
    public int[] getNoTemporadas() {
        return NoTemporadas;
    }

    /**
     * @param NoTemporadas the NoTemporadas to set
     */
    public void setNoTemporadas(int NoTemporadas[]) {
        this.NoTemporadas = NoTemporadas;
    }
    void main(String[] args){
        System.out.println("Horario familiar - Titulo : " +getTitulo()[0]+"| Genero: "+getGenero()[0]+"| Productora : "+getCreador()[0]+"| Duracion :"+getDuracion()[0]+"| ¿Ya vista?"+getVisto()[0]+"| Cantidad de temporadas:  "+NoTemporadas[0]);
        System.out.println("Horario infantil - Titulo : " +getTitulo()[1]+"| Genero: "+getGenero()[1]+"| Productora : "+getCreador()[1]+"| Duracion :"+getDuracion()[1]+"| ¿Ya vista?"+getVisto()[1]+"| Cantidad de temporadas:  "+NoTemporadas[1]);
        System.out.println("Horario Nocturno - Titulo : " +getTitulo()[2]+"| Genero: "+getGenero()[2]+"| Productora : "+getCreador()[2]+"| Duracion :"+getDuracion()[2]+"| ¿Ya vista?"+getVisto()[2]+"| Cantidad de temporadas:  "+NoTemporadas[2]);
        System.out.println("Prime Time - Titulo : " +getTitulo()[3]+"| Genero: "+getGenero()[3]+"| Productora : "+getCreador()[3]+"| Duracion :"+getDuracion()[3]+"| ¿Ya vista?"+getVisto()[3]+"| Cantidad de temporadas:  "+NoTemporadas[3]);
        System.out.println("Horario Dominical - Titulo : " +getTitulo()[4]+"| Genero: "+getGenero()[4]+"| Productora : "+getCreador()[4]+"| Duracion :"+getDuracion()[4]+"| ¿Ya vista?"+getVisto()[4]+"| Cantidad de temporadas:  "+NoTemporadas[4]);
    }
    public void PublicarProgramacion(String nombreClase){
       // super.PublicarProgramacion(nombreClase);
        System.out.println("Cantidad de temporadas:  "+getNoTemporadas()[0]);
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
