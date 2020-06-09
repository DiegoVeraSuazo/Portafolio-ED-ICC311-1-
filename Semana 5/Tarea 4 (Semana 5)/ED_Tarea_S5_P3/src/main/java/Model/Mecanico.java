package Model;

public class Mecanico extends Persona{

    boolean reparando;

    public Mecanico(String nombre, String run, Departament departamento, boolean reparando) {
        super(nombre, run, departamento);
        this.reparando = reparando;
    }

    public boolean isReparando() {
        return reparando;
    }

    public void setReparando(boolean reparando) {
        this.reparando = reparando;
    }
}
