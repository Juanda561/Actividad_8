
package Ej8_Habladores.modelo;

public class Profesor extends Persona implements Hablador{

    private String despacho;
    private String email;

    public Profesor(String despacho, String email, String nombre, long edad) {
        super(nombre, edad);
        this.despacho = despacho;
        this.email = email;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Profesor y sé hablar");
    }
    
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\n"
               +"Edad: "+getEdad()+"\n"
               +"Despacho: "+getDespacho()+"\n"
               +"Email: "+getEmail()+"\n" ;
    }
    
    
    
}
