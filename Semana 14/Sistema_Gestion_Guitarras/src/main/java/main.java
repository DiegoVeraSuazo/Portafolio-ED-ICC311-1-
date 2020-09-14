import dateTime.DateItem;
import model.Guitarra;
import model.Tienda;

public class main {

    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        tienda.getInventarioGuitarra().add(new Guitarra(1,"mARV","Guit",12,new DateItem("22-02-2020"),5,"Robl","Metal"));
        tienda.mostrar();

    }

}
