package gestionEstablecimiento;

public enum Asignatura {

    RELIGION("BASICA", 1),
    LENGUAJE("BASICA",2),
    MATEMATICA("MEDIO",3),
    BIOLOGIA("MEDIO",2),
    INGLES("MEDIO",3),
    FISICA("AVANZADO",3),
    FILOSOFIA("AVANZADO", 4);

    private String nivel;
    private int creditos;

    Asignatura(String nivel, int creditos) {
        this.nivel = nivel;
        this.creditos = creditos;
    }
    public String getNivel() {return this.nivel;}
    public int getCreditos() {return this.creditos;}

    public String getAsignatura() {return this.name();}

}
