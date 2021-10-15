
package Ej8_Habladores.modelo;

public class Loro extends Ave implements Hablador{

    private String region;
    private String color;

    public Loro(String region, String color, String sexo, long edad) {
        super(sexo, edad);
        this.region = region;
        this.color = color;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un Loro y sé hablar");
    }
    
    public String toString(){
        return "Sexo: "+getSexo()+"\n"
               +"Edad: "+getEdad()+"\n"
               +"Región: "+getRegion()+"\n"
               +"Color: "+getColor()+"\n" ;
    }
    
}
