package Supermercado.Modelo;

public class Empleado extends Persona {

    private Ocupacion ocupacion;
    private int horasTurno;
    private double sueldo;

    public Empleado(String nombre, String rut, Ocupacion ocupacion, int horasTurno, double sueldo) {
        super(nombre, rut);
        this.ocupacion = ocupacion;
        this.horasTurno = horasTurno;
        this.sueldo = sueldo;
    }

    public Ocupacion getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(Ocupacion ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getHorasTurno() {
        return horasTurno;
    }

    public void setHorasTurno(int horasTurno) {
        this.horasTurno = horasTurno;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{nombre= " + getNombre() +
                ", rut= " + getRut() +
                ", ocupacion= " + ocupacion +
                ", horasTurno= " + horasTurno +
                ", sueldo= " + sueldo +
                '}';
    }
}
