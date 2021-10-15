/*
La institución educativa Upar cuenta con dos tipos de trabajadores: empleados y docentes. Los empleados cuentan 
con un sueldo fijo y depende del cargo que ocupa, según la siguiente tabla:

   Cargo        Sueldo
Coordinador    $ 5.000
Asistente      $ 4.000
Secretaria     $ 3.000

El sueldo del docente está en función de las horas que dicta, el pago por hora es de $120. El departamento de 
recursos humanos necesita una aplicación para calcular la bonificación que se debe pagar a cada trabajador según 
el siguiente cuadro:

Trabajador    Bonificación
 Empleado    100% del sueldo
 Docente     70% del sueldo
 */
package Ej1_Trabajadores.vista;

import Ej1_Trabajadores.modelo.*;

public class Test {
    
    public static void main(String[] args) {
        
     Trabajador t1 = new Empleado("Coordinador");
     Trabajador t2 = new Docente(40);
     
        imprimirTrabajador(t1);
        imprimirTrabajador(t2);
      
    }
    
    public static void imprimirTrabajador(Trabajador t){
        System.out.println("Sueldo: "+t.getSueldo());
        System.out.println("Bonificacion: "+t.getBonificacion());
        System.out.println("");
    }
    
}
