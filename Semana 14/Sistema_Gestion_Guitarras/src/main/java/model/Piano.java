package model;

import dateTime.DateItem;

public class Piano extends InstrumentoMusical{

    protected String tipoMadera;
    protected String tipoTecla;
    protected int cantidadTeclas;

    public Piano(int id, String fabricante, String nombreInstrumento, double precio, DateItem fechaIngreso, String tipoMadera, String tipoTecla, int cantidadTeclas) {
        super(id, fabricante, nombreInstrumento, precio, fechaIngreso);
        this.tipoMadera = tipoMadera;
        this.tipoTecla = tipoTecla;
        this.cantidadTeclas = cantidadTeclas;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getTipoTecla() {
        return tipoTecla;
    }

    public void setTipoTecla(String tipoTecla) {
        this.tipoTecla = tipoTecla;
    }

    public int getCantidadTeclas() {
        return cantidadTeclas;
    }

    public void setCantidadTeclas(int cantidadTeclas) {
        this.cantidadTeclas = cantidadTeclas;
    }

    @Override
    public String toString() {
        return "Piano{" +
                "tipoMadera='" + tipoMadera + '\'' +
                ", tipoTecla='" + tipoTecla + '\'' +
                ", cantidadTeclas=" + cantidadTeclas +
                ", id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", nombreInstrumento='" + nombreInstrumento + '\'' +
                ", precio=" + precio +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
