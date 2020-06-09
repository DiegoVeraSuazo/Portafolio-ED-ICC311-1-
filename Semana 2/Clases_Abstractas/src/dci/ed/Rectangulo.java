package dci.ed;

public class Rectangulo extends Forma{

    private double largo;
    private double ancho;

    public Rectangulo(double l, double a){
        this.largo = l;
        this.ancho = a;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    double calcularArea() {
        return largo*ancho;
    }
}
