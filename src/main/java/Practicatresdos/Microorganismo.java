package main.java.Practicatresdos;

public class Microorganismo {

    String nombre;
    int vida;
    int posicion;

    public Microorganismo(int vida, String nombre, int posicion){
        this.vida = vida;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public int GetVida(){
        return this.vida;
    }

    public String GetNombre(){
        return this.nombre;
    }

    public int GetPosicion(String lugares){
        return this.posicion;
    }

    public void posicion(String s) {
    }
}
