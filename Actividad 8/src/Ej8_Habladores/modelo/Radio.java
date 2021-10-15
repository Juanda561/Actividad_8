
package Ej8_Habladores.modelo;

public class Radio extends Aparato implements Hablador{
    
    private String casette;

    public Radio(String casette, String consumo, double precio) {
        super(consumo, precio);
        this.casette = casette;
    }

    public String getCasette() {
        return casette;
    }

    public void setCasette(String casette) {
        this.casette = casette;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy una Radio y sé hablar");
    }
    
    @Override
    public String toString(){
        return "Consumo: "+getConsumo()+"\n"
               +"Precio: "+getPrecio()+"\n"
               +"Casette: "+getCasette()+"\n" ;
    }
    
}
