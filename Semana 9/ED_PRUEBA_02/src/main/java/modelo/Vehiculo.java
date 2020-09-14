package modelo;

import dateTime.DateItem;

public class Vehiculo {

    private String patente;
    private String chasis;
    private Integer ejes;
    private String marca;
    private DateItem fechaCompra;
    private double kmActual;
    private double kmUltimaMantencion;
    private DateItem fechaUltimaMantencion;
    private Integer tipoDeBus;
    private String tipoCarga;


    public Vehiculo(String patente, String chasis, Integer ejes, String marca, DateItem fechaCompra,
                    double kmActual, double kmUltimaMantencion, DateItem fechaUltimaMantencion, Integer tipoDeBus, String tipoCarga) {
        this.patente = patente;
        this.chasis = chasis;
        this.ejes = ejes;
        this.marca = marca;
        this.fechaCompra = fechaCompra;
        this.kmActual = kmActual;
        this.kmUltimaMantencion = kmUltimaMantencion;
        this.fechaUltimaMantencion = fechaUltimaMantencion;
        this.tipoDeBus = tipoDeBus;
        this.tipoCarga = tipoCarga;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Integer getEjes() {
        return ejes;
    }

    public void setEjes(Integer ejes) {
        this.ejes = ejes;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public DateItem getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(DateItem fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getKmActual() {
        return kmActual;
    }

    public void setKmActual(double kmActual) {
        this.kmActual = kmActual;
    }

    public double getKmUltimaMantencion() {
        return kmUltimaMantencion;
    }

    public void setKmUltimaMantencion(double kmUltimaMantencion) {
        this.kmUltimaMantencion = kmUltimaMantencion;
    }

    public DateItem getFechaUltimaMantencion() {
        return fechaUltimaMantencion;
    }

    public void setFechaUltimaMantencion(DateItem fechaUltimaMantencion) {
        this.fechaUltimaMantencion = fechaUltimaMantencion;
    }

    public Integer getTipoDeBus() {
        return tipoDeBus;
    }

    public void setTipoDeBus(Integer tipoDeBus) {
        this.tipoDeBus = tipoDeBus;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", chasis='" + chasis + '\'' +
                ", ejes=" + ejes +
                ", marca='" + marca + '\'' +
                ", fechaCompra=" + fechaCompra.datetime +
                ", kmActual=" + kmActual +
                ", kmUltimaMantencion=" + kmUltimaMantencion +
                ", fechaUltimaMantencion=" + fechaUltimaMantencion.datetime +
                ", tipoDeBus=" + tipoDeBus +
                ", tipoCarga='" + tipoCarga + '\'' +
                '}';
    }
}
