package dci.ed;

public class Cliente {

    public static void main(String[] args) {
        //Producto libro = new Producto();
        Producto libro = new Libro();
        libro.setPrecio(33.3);
        libro.getPrecio();
        System.out.println(libro.getCodBarra());
    }


}
