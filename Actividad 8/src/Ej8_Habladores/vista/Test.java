/*
 Observa la jerarquía de clases que se muestra en la figura:
 En la siguiente tabla se muestran las características mínimas que deben poseer cada una de estas clases: 

Se pide:

Implementar la jerarquía de clases de la figura, junto con los atributos y métodos de cada una de estas clases. 
Construir un interface llamado “Hablador” que posea un único método “hablar()” (sin parámetros y sin valor de 
retorno). 

Hacer que todas las clases que representen a entidades con la capacidad de hablar implementen este interface 
(éstas son las clases que en la figura aparecen sombreadas). 

Cada una de estas clases debe implementar este interfaz de manera que el método “hablar()” visualice por pantalla 
el mensaje “Hola, soy un y sé hablar”, junto con los valores de los atributos del objeto.
Una vez hecho esto, construir un programa que realice lo siguiente: 

Crear un array de 7 posiciones que permita almacenar únicamente a objetos con la capacidad de hablar.

Crear los siguientes objetos: un LORO, un PIOLIN, un ALUMNO, un PROFESOR, un BEDEL, una TV y una RADIO. 

Asignar valores a los atributos de estos objetos, introducir estos objetos en el array. 

Recorrer el array e invocar el método “hablar()” sobre cada uno de los objetos que has introducido en él.

*/


package Ej8_Habladores.vista;

import Ej8_Habladores.modelo.Radio;
import Ej8_Habladores.modelo.Alumno;
import Ej8_Habladores.modelo.Piolin;
import Ej8_Habladores.modelo.Loro;
import Ej8_Habladores.modelo.Profesor;
import Ej8_Habladores.modelo.Bedel;
import Ej8_Habladores.modelo.TV;
import Ej8_Habladores.modelo.Hablador;

public class Test {
    
    public static void main(String[] args) {
        
        Loro l1 = new Loro("Caribe", "Amarillo", "Macho", 1);
        Piolin p1 = new Piolin(34, "Si", "Femenino", 10);
        Alumno a1 = new Alumno("Ing de Sistemas", "03", "Juan David", 24);
        Profesor pr1 = new  Profesor("Ecológico", "jdayala@unicesar.edu.co", "Daniel Ayala", 34);
        Bedel b1 = new Bedel("Noche", "Si", "Carlos Ramirez", 45);
        TV t1= new TV("Noticias, Deportes. Entretenimiento", "si", "450", 800000);
        Radio r1 = new Radio("si", "45", 50000);
        
        Hablador Habladores[] = new Hablador[7];
        Habladores[0]=l1;
        Habladores[1]=p1;
        Habladores[2]=a1;
        Habladores[3]=pr1;
        Habladores[4]=b1;
        Habladores[5]=t1;
        Habladores[6]=r1;
        
        imprimirLista(Habladores);
    }
    
    public static void imprimirLista(Hablador[] lista){
        System.out.println("*****LISTA DE LOS QUE PUEDEN HABLAR*****");
        for (int i = 0; i <lista.length; i++) {
            imprimirHabladores(lista[i]);
        }
    }
    
    public static void imprimirHabladores(Hablador e){ 
        e.hablar();
        System.out.println(e.toString());
    }
    
}
