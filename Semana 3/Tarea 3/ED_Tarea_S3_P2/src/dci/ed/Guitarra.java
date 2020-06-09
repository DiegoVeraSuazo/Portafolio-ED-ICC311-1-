package dci.ed;

public class Guitarra {
    private String numeroSerie, fabricante, modelo, tipo, maderaPosterior, maderaFrontal;
    private double precio;

    public Guitarra(String numeroSerie, double precio,
                    String fabricante, String modelo, String tipo,
                    String maderaPosterior, String maderaFrontal){
        this.numeroSerie = numeroSerie;
        this.precio = precio;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tipo = tipo;
        this.maderaPosterior = maderaPosterior;
        this.maderaFrontal = maderaFrontal;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaderaPosterior() {
        return maderaPosterior;
    }

    public void setMaderaPosterior(String maderaPosterior) {
        this.maderaPosterior = maderaPosterior;
    }

    public String getMaderaFrontal() {
        return maderaFrontal;
    }

    public void setMaderaFrontal(String maderaFrontal) {
        this.maderaFrontal = maderaFrontal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
