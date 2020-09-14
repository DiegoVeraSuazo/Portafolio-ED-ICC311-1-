package Supermercado.Modelo;

public enum Ocupacion {

    CAJERO(1),
    PANADERO(2),
    GUARDIA(3),
    CARNICERO(4),
    BODEGERO(5),
    FIAMBRES(6),
    REPONEDOR(7);

    private int idOcupacion;

    Ocupacion(int idOcupacion){
        this.idOcupacion = idOcupacion;
    }

    public int getIdOcupacion() {return this.idOcupacion;}

    public String getOcupacion() {return this.name();}

}
