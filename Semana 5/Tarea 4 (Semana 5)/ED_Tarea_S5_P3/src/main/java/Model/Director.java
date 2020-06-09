package Model;

public class Director extends Persona{

    boolean trabajando;

    public Director(String nombre, String run, Departament departamento, boolean trabajando) {
        super(nombre, run, departamento);
        this.trabajando = trabajando;
    }

    public boolean isTrabajando() {
        return trabajando;
    }

    public void setTrabajando(boolean trabajando) {
        this.trabajando = trabajando;
    }
}
