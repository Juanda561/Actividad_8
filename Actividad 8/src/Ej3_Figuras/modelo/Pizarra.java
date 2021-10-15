
package Ej3_Figuras.modelo;

import java.util.ArrayList;

public class Pizarra {

    private ArrayList<Figura> ListaFiguras = new ArrayList<Figura>();

    public ArrayList<Figura> getListaFiguras() {
        return ListaFiguras;
    }

    public void setListaFiguras(ArrayList<Figura> ListaFiguras) {
        this.ListaFiguras = ListaFiguras;
    }
    
    public void mostrarFiguras(){
        System.out.println("");
        System.out.println("*****Lista de Figuras*****");
        for (int i = 0; i <ListaFiguras.size(); i++) {
            System.out.println(""+ListaFiguras.get(i));
        }
    }
    
    public void añadirFigura(Figura e){
                
        if (e instanceof Cuadrado) {
            System.out.println("Se ha añadido un Cuadrado a la lista ");
        }else if (e instanceof Triángulo) {
                    System.out.println("Se ha añadido un Triángulo a la lista ");
                }else{
                    System.out.println("Se ha añadido un Círculo a la lista ");
                }
       
        ListaFiguras.add(e);
    }
    
    public void imprimirDibujar(Figura e){
        e.dibujar();
    }
    
    public void imprimirBorrar(Figura e){
        e.borrar();
    }
    
    public void dibujarFiguras(){
        System.out.println("");
        for (int i = 0; i <ListaFiguras.size(); i++) {
            imprimirDibujar(ListaFiguras.get(i));
        }
    }
    
    public void borrarFiguras(){
        for (int i = 0; i <ListaFiguras.size(); i++) {
            imprimirBorrar(ListaFiguras.get(i));
        }
        ListaFiguras.clear();
    }
    
}
