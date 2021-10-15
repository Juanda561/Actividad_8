
package Ej8_Habladores.modelo;

public class Alumno extends Persona implements Hablador{

    private String carrera;
    private String curso;

    public Alumno(String carrera, String curso, String nombre, long edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.curso = curso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Alumno y sé hablar");
    }
    
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\n"
               +"Edad: "+getEdad()+"\n"
               +"Carrera: "+getCarrera()+"\n"
               +"Curso: "+getCurso()+"\n" ;
    }
}
