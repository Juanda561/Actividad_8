
package Ej8_Habladores.modelo;

public abstract class Ave {
    
    private String sexo;
    private long edad;

    public Ave(String sexo, long edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }
    
    
    
}
