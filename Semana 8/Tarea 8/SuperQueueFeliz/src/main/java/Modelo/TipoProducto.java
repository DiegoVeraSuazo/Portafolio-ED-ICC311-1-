package Modelo;

public enum TipoProducto {

    PANADERIA(1),
    CONGELADO(2),
    BEBESTIBLES(3),
    DESPENSA(4),
    HELADOS(5),
    LACTEOS(6),
    SNACCK(7);

    private int idProd;

    TipoProducto(int idProd){
        this.idProd = idProd;
    }

    public int getidProd() {return this.idProd;}

    public String getTipoProducto() {return this.name();}

}
