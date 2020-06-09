package gestionEstablecimiento;

public class Personal extends Persona{

    private String profesion;

    public Personal(String nombre, String direccion, String run, String fechaIngreso, String profesion) {
        super(nombre, direccion, run, fechaIngreso);
        this.profesion = profesion;
    }

    public Personal(String nombre, String profesion) {
        super(nombre, "", "", "");
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String nombrarPersonal() {
        return "Personal: " +
                "Nombre='" + getNombre() + '\'' +
                ", Profesion='" + profesion;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "profesion='" + profesion + '\'' +
                '}';
    }
}
