
package Ej8_Habladores.modelo;

public class Bedel extends Persona implements Hablador{

    private String turno;
    private String antiguedad;

    public Bedel(String turno, String antiguedad, String nombre, long edad) {
        super(nombre, edad);
        this.turno = turno;
        this.antiguedad = antiguedad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Bedel y sé hablar");

    }
    
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\n"
               +"Edad: "+getEdad()+"\n"
               +"Turno: "+getTurno()+"\n"
               +"Antiguedad: "+getAntiguedad()+"\n" ;
    }
    
    
}
