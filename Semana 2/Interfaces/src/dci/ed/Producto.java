package dci.ed;

public interface Producto {
    double getPrecio();
    void setPrecio(double precio);

    String getNombre();
    void setNombre(String nombre);

    String getColor();
    void setColor(String color);

    default String getCodBarra(){
        return "sin cod de barra";
    }
}
