
package Ej8_Habladores.modelo;

public abstract class Persona implements Hablador{
    
    private String nombre;
    private long edad;

    public Persona(String nombre, long edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }
    
    
    
}
