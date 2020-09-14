package Modelo;

public class Empleado extends Persona {

    private Ocupacion ocupacionEmpleado;
    private int horasTurno;
    private double sueldo;

    public Empleado(String nombre, String id, Ocupacion ocupacionEmpleado, int horasTurno, double sueldo) {
        super(nombre, id);
        this.ocupacionEmpleado = ocupacionEmpleado;
        this.horasTurno = horasTurno;
        this.sueldo = sueldo;
    }
}
