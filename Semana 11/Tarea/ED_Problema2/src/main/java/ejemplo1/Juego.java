package ejemplo1;

public class Juego {

    private String nombreJuego;
    private int anioEstrenoJuego;
    private String consolaEstreno;

    public Juego(String nombreJuego, int anioEstrenoJuego, String consolaEstreno) {
        this.nombreJuego = nombreJuego;
        this.anioEstrenoJuego = anioEstrenoJuego;
        this.consolaEstreno = consolaEstreno;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public int getAnioEstrenoJuego() {
        return anioEstrenoJuego;
    }

    public void setAnioEstrenoJuego(int anioEstrenoJuego) {
        this.anioEstrenoJuego = anioEstrenoJuego;
    }

    public String getConsolaEstreno() {
        return consolaEstreno;
    }

    public void setConsolaEstreno(String consolaEstreno) {
        this.consolaEstreno = consolaEstreno;
    }

    public String toString() {
        return getNombreJuego();
    }

}
