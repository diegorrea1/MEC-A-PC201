import java.util.Scanner;


public class Ruta {
    public static void main(String [] args);
     String distancia;
     String duracion;
    String paradas;

    public Ruta(String distancia, String duracion, String paradas) {
        this.distancia = distancia;
        this.duracion = duracion;
        this.paradas = paradas;
    }
}

class Estacion {
    private String nombre;
    private String ubicacion;
    private String vagones;
    public Estacion(String nombre, String ubicacion,String vagones) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.vagones = vagones;
    }

}
