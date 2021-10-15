
package Ej1_Trabajadores.modelo;

public class Empleado implements Trabajador{
    
    private String cargo;

    public Empleado() {
    }
    
    public Empleado(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public double getSueldo() {
        
        double sueldo=0;
        
        switch (this.cargo) {
            case "Coordinador":
                
                sueldo=5000;
                break;
                
            case "Asistente":
                
                sueldo=4000;
                break;
                
            default:
                
                sueldo=3000;
        }
        
        return sueldo;
    }

    @Override
    public double getBonificacion() {
        return this.getSueldo();
    }
   
}
