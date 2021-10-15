
package Ej8_Habladores.modelo;

public abstract class Aparato {

    private String consumo;
    private double precio;

    public Aparato(String consumo, double precio) {
        this.consumo = consumo;
        this.precio = precio;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
