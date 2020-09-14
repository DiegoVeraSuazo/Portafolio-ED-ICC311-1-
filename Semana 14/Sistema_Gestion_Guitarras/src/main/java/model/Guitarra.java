package model;

import dateTime.DateItem;

public class Guitarra extends InstrumentoMusical{

    protected int cantidadCuerdas;
    protected String tipoMadera;
    protected String tipoCuerda;

    public Guitarra(int id, String fabricante, String nombreInstrumento, double precio, DateItem fechaIngreso, int cantidadCuerdas, String tipoMadera, String tipoCuerda) {
        super(id, fabricante, nombreInstrumento, precio, fechaIngreso);
        this.cantidadCuerdas = cantidadCuerdas;
        this.tipoMadera = tipoMadera;
        this.tipoCuerda = tipoCuerda;
    }

    public int getCantidadCuerdas() {
        return cantidadCuerdas;
    }

    public void setCantidadCuerdas(int cantidadCuerdas) {
        this.cantidadCuerdas = cantidadCuerdas;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getTipoCuerda() {
        return tipoCuerda;
    }

    public void setTipoCuerda(String tipoCuerda) {
        this.tipoCuerda = tipoCuerda;
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "cantidadCuerdas=" + cantidadCuerdas +
                ", tipoMadera='" + tipoMadera + '\'' +
                ", tipoCuerda='" + tipoCuerda + '\'' +
                ", id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", nombreInstrumento='" + nombreInstrumento + '\'' +
                ", precio=" + precio +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
