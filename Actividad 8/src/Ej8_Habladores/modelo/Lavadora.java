
package Ej8_Habladores.modelo;

public class Lavadora extends Aparato{
    
    private float alto;
    private float ancho;

    public Lavadora(float alto, float ancho, String consumo, double precio) {
        super(consumo, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
    
    
}
