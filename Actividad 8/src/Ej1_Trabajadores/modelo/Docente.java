
package Ej1_Trabajadores.modelo;

public class Docente implements Trabajador{
 
    private int horast;
    private double pagoxhora;

    public Docente() {
    }

    public Docente(int horast) {
        this.horast = horast;
        this.pagoxhora=120;
    }

    public int getHorast() {
        return horast;
    }

    public void setHorast(int horast) {
        this.horast = horast;
    }

    public double getPagoxhora() {
        return pagoxhora;
    }

    public void setPagoxhora(double pagoxhora) {
        this.pagoxhora = pagoxhora;
    }

    @Override
    public double getSueldo() {
        return this.horast * this.pagoxhora;
    }

    @Override
    public double getBonificacion() {
        return getSueldo() * 0.7;
    }
      
}
