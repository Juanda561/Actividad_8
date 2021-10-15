
package Ej8_Habladores.modelo;

public class Piolin extends Canario implements Hablador{

    private int n_peliculas;

    public Piolin(int n_peliculas, String canta, String sexo, long edad) {
        super(canta, sexo, edad);
        this.n_peliculas = n_peliculas;
    }

    public int getN_peliculas() {
        return n_peliculas;
    }

    public void setN_peliculas(int n_peliculas) {
        this.n_peliculas = n_peliculas;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Piolín y sé hablar");
    }
    
    @Override
    public String toString(){
        return "Canta: "+getCanta()+"\n"
               +"Sexo: "+getSexo()+"\n"
               +"Edad: "+getEdad()+"\n"
               +"Numero de Películas: "+getN_peliculas()+"\n";
    }
    
    
    
}
