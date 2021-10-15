
package Ej3_Figuras.modelo;

public abstract class Figura implements Coloreable{
    
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract void dibujar();
    public abstract void borrar();
    
}
