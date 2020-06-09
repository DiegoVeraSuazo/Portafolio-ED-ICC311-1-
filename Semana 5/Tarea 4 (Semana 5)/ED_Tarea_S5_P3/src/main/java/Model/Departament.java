package Model;

public enum Departament {

    MOTOR(1),
    FRENOS(2),
    GASES(3);

    private int valorDep;
    Departament(int valorDep){this.valorDep = valorDep;}

    public int getValorDep() {
        return valorDep;
    }

    public String getDepartamento() {
        return this.name();
    }
}
