package gestionEstablecimiento;

public class Profesor extends Persona{

    private String especialidad;
    private int anosExperiencia;

    public Profesor(String nombre, String direccion, String run, String fechaIngreso, String especialidad, int anosExperiencia) {
        super(nombre, direccion, run, fechaIngreso);
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
    }

    public Profesor(String nombre, String especialidad, int anosExperiencia) {
        super(nombre, "", "", "");
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String nombrarProfes() {
        return "Profesor: " +
                "Nombre='" + getNombre() + '\'' +
                ", Especialidad='" + especialidad + '\'' +
                ", Años Experiencia='" + anosExperiencia;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "especialidad='" + especialidad + '\'' +
                ", anosExperiencia='" + anosExperiencia + '\'' +
                '}';
    }

}
