package model;

import dateTime.DateItem;

public abstract class InstrumentoMusical {

    protected int id;
    protected String fabricante, nombreInstrumento;
    protected double precio;
    protected DateItem fechaIngreso;

    public InstrumentoMusical(int id, String fabricante, String nombreInstrumento, double precio, DateItem fechaIngreso) {
        this.id = id;
        this.fabricante = fabricante;
        this.nombreInstrumento = nombreInstrumento;
        this.precio = precio;
        this.fechaIngreso = fechaIngreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNombreInstrumento() {
        return nombreInstrumento;
    }

    public void setNombreInstrumento(String nombreInstrumento) {
        this.nombreInstrumento = nombreInstrumento;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public DateItem getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(DateItem fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "InstrumentoMusical{" +
                "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", nombreInstrumento='" + nombreInstrumento + '\'' +
                ", precio=" + precio +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
