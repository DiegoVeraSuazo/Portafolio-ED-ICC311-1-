package Supermercado.Modelo;

public enum TipoProducto {

    PANADERIA(1),
    CONGELADOS(2),
    BEBESTIBLES(3),
    DESPENSA(4),
    HELADOS(5),
    LACTEOS(6),
    SNACKS(7);

    private int idProd;

    TipoProducto(int idProd){
        this.idProd = idProd;
    }

    public int getidProd() {return this.idProd;}

    public String getTipoProducto() {return this.name();}

}
