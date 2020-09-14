package Supermercado.Modelo;

public class Producto {

    private String nombre;
    private TipoProducto tipoProducto;
    private double precio;
    private int id;

    public Producto(String nombre, TipoProducto tipoProducto, double precio, int id) {
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre= " + nombre +
                ", tipoProducto= " + tipoProducto +
                ", precio= " + precio +
                ", id= " + id +
                '}';
    }
}
