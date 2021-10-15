
package Ej8_Habladores.modelo;

public class Canario extends Ave{
    
    private String canta;

    public Canario(String canta, String sexo, long edad) {
        super(sexo, edad);
        this.canta = canta;
    }

    public String getCanta() {
        return canta;
    }

    public void setCanta(String canta) {
        this.canta = canta;
    }
    
    
    
}
