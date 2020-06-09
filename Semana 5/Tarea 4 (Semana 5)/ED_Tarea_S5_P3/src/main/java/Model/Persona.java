package Model;

public class Persona {
    private String nombre;
    private String run;
    private Departament departamento ;

    public Persona(String nombre, String run, Departament departamento) {
        this.nombre = nombre;
        this.run = run;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public Departament getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departament departamento) {
        this.departamento = departamento;
    }
}
