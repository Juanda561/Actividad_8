/*
Se solicita diseñar un método genérico y reutilizable que dado como parámetros un array con cualquier tipo de objetos 
dentro, y un valor boolean, nos devuelva ese array con los objetos ordenados según una determinada magnitud, 
ascendentemente si el valor boolean es true, en caso contrario, se ordenara descendentemente
*/
package Ej2_Genérico.vista;

import Ej2_Genérico.modelo.*;

public class Test {
    
    public static void main(String[] args) {
                
        int numeros[] = {45,35,11,7,54,32};
        boolean b = true;//si cambiamos a false, ordenará de forma descendente
        Clase.getNumero(numeros, b);
    }
    
}
