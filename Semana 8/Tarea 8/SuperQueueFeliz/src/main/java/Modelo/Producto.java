package Modelo;

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



}
