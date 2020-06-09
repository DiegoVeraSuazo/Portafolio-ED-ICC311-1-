package gestionEstablecimiento;

import java.util.Comparator;

public class Estudiante extends Persona{

    private Asignatura asignatura;
    private double promedio;

    public Estudiante(String nombre, String direccion, String run, String fechaIngreso, Asignatura asignatura, double promedio) {
        super(nombre, direccion, run, fechaIngreso);
        this.asignatura = asignatura;
        this.promedio = promedio;
    }

    public Estudiante(String nombre, String direccion, String run, String fechaIngreso, double promedio) {
        super(nombre, direccion, run, fechaIngreso);
        this.promedio = promedio;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String nombrarEstudiante(){
        return "Estudiante: " +
                "Nombre='" + getNombre() + '\'' +
                ", Direccion='" + getDireccion() + '\'' +
                ", R.U.N='" + getRun() + '\'' +
                ", Fecha Ingreso='" + getFechaIngreso() + '\'' +
                ", Promedio=" + promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "asignatura=" + asignatura +
                ", promedio=" + promedio +
                '}';
    }

}
