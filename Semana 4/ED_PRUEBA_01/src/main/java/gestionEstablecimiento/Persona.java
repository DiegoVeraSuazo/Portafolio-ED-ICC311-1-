package gestionEstablecimiento;

public abstract class Persona {

    private String nombre;
    private String direccion;
    private String run;
    private String fechaIngreso;

    public Persona(String nombre, String direccion, String run, String fechaIngreso) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.run = run;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", run='" + run + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }
}
