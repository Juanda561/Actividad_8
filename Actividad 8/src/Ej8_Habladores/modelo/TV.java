
package Ej8_Habladores.modelo;

public class TV extends Aparato implements Hablador{

    private String teletexto;
    private String antiguedad;

    public TV(String teletexto, String antiguedad, String consumo, double precio) {
        super(consumo, precio);
        this.teletexto = teletexto;
        this.antiguedad = antiguedad;
    }

    public String getTeletexto() {
        return teletexto;
    }

    public void setTeletexto(String teletexto) {
        this.teletexto = teletexto;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy una TV y sé hablar");
    }
    
    @Override
    public String toString(){
        return "Consumo: "+getConsumo()+"\n"
               +"Precio: "+getPrecio()+"\n"
               +"Teletexto: "+getTeletexto()+"\n"
               +"Antiguedad: "+getAntiguedad()+"\n" ;
    }
    
    
}
