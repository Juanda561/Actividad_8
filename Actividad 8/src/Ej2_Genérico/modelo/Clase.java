
package Ej2_Genérico.modelo;

import java.util.Arrays;

public class Clase {
    
    public static <T> int getNumero(int[] a, boolean b){
        
        if (b==true) {
            Arrays.sort(a);
            for (int i = 0; i <a.length; i++) {
                System.out.println(a[i]);    
            }
        }else{}
            if (b==false) {
                Arrays.sort(a);
                for (int i = a.length-1; i >=0 ; i--) {
                    System.out.println(a[i]);    
                }
            }
        return 0;
    }
    
}
