/*
Definir un interface llamado Coloreable que hace referencia a todos los objetos que admiten un color, definiendo los 
métodos void cambiaColor( String c ) que cambia el color del objeto y el Color queColor() que devuelve el color del 
objeto. 

Crear una clase llamada Figura de la que extiendan las clases Cuadrado, Triángulo y Círculo. Figura debe ser una 
clase abstracta que contenga dos métodos void dibujar() y void borrar() y como atributo su color. 

Hacer que Figura implemente el interfaz Coloreable.

Por otro lado, cada clase descendiente de Figura va a redefinir estos métodos visualizando por pantalla, en cada caso, 
un mensaje. (P. ej.: “Dibujando cuadrado/triángulo/círculo de color (Su color)”, “Borrando cuadrado/triángulo/círculo de 
color (Su color)”).

Asi mismo redefinir el método cambiarColor() para que en cada caso indique “Cambiando color de 
cuadrado/triangulo/circulo de color (color actual), a (nuevo color)”

Crear por otro lado una clase Pizarra que tenga un atributo que sea un array de Figuras. Además, tendrá un método 
para añadir Figuras al array , otro que permita dibujar todas las figuras del array, y otro para borrar todas las figuras 
del array.
 */
package Ej3_Figuras.vista;

import Ej3_Figuras.modelo.*;

public class Test {
    
    public static void main(String[] args) {
        
        Figura fcu1 = new Cuadrado("Negro");
        Figura fcu2 = new Cuadrado("Marrón");
        Figura ftr1 = new Triángulo("Verde");
        Figura fci1 = new Círculo("Amarillo");
        Figura ftr2 = new Triángulo("Naranjado");
        
        Pizarra p1 = new Pizarra();

        /*f2.cambiaColor("Morado");
        System.out.println(f2.queColor());
        
        f3.cambiaColor("Azul");
        System.out.println(f3.queColor());
        f3.dibujar();
        */
        
        
        /*p1.mostrarFiguras();
        */
        
        fcu1.dibujar();
        
        
        p1.añadirFigura(fcu1);
        p1.añadirFigura(fcu2);
        p1.añadirFigura(ftr1);
        p1.añadirFigura(fci1);
        p1.añadirFigura(ftr2);

        p1.mostrarFiguras();
        
        p1.dibujarFiguras();
        
        p1.borrarFiguras();
        
        p1.mostrarFiguras();

    }
   
    
}
