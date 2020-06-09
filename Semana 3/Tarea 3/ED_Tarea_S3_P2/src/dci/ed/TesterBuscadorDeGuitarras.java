package dci.ed;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesterBuscadorDeGuitarras {
    public static void main(String[] args) {

        Inventario inventarioGuitarStar = new Inventario();
        inicializarInventarioDeGuitarras(inventarioGuitarStar);

        Guitarra guitarraClaudia = new Guitarra("", 0, "fender",
                "stratocastor", "electric", "Alder", "Alfer");

        Guitarra guitarra = inventarioGuitarStar.buscar(guitarraClaudia);

        if(guitarra != null){
            System.out.println("Claudia, te podría gustar esta " + guitarra.getFabricante() +
                    "" + guitarra.getModelo() + " " + guitarra.getTipo() + "guitarra:\n  " +
                    guitarra.getMaderaPosterior() + " madera posterior,\n  +" +
                    guitarra.getMaderaFrontal() + " madera frontal.\n Puedes tenerla por solo: $" +
                    guitarra.getPrecio() + "!");
        }else {
            System.out.println("Lo siento Claudia, no tenemos nada para ti.");
        }

        menu(inventarioGuitarStar);

    }

    private static void inicializarInventarioDeGuitarras(Inventario inventarioGuitarStar){
        // agregar guitarras al inventario
        inventarioGuitarStar.agregarGuitarra("",0,"fender","stratocastor", "electric", "Alder", "Alfer" );
    }

    /**
     * Metodo que llama a un menu clasico
     */
    public static void menu(Inventario inventarioGuitarStar){
        boolean ejec = true;
        System.out.println("Bienvenido al menu principal, ¿Que desea hacer?");
        do {
            System.out.println("Selecciona la operacion a realizar");
            System.out.println("1 - Ingreso guitarras nuevas");
            System.out.println("2 - Egreso o venta de guitarras");
            System.out.println("9 - Terminar");
            int opcion = validarNumero();
            if (opcion >= 1 && opcion <= 2 ) {
                seleccion(opcion, ejec, inventarioGuitarStar);

            } else if (opcion == 9) {
                ejec = false;
            } else {
                System.out.println("Opcion no valida");
            }

        } while (ejec);
    }

    /**
     * Extension del menu que usa un Switch para ir a cada metodo
     * @param opcion ingresado para saber a que caso ir
     * @param ejec usado para saber cuando esta activo
     */
    private static void seleccion(int opcion, boolean ejec, Inventario inv) {

        switch(opcion){
            case 1:
                agregarNuevaGuitar(inv);
                break;
            case 2:
                System.out.println("Escriba el Nro de serie que desea buscar");
                inv.obtenerGuitarra(stringNumeros());
                break;
            default:
                break;
        }

    }

    private static Inventario agregarNuevaGuitar(Inventario inv) {
        System.out.println("Ingrese el Numero de serie");
        String nro = stringNumeros();
        System.out.println("Ingrese el precio");
        double precio = (double)validarNumero();
        System.out.println("Ingrese el fabricante");
        String fabricante = teclado();
        System.out.println("Ingrese el modelo");
        String modelo = teclado();
        System.out.println("Ingrese el tipo de guitarra");
        String tipo = teclado();
        System.out.println("Ingrese la madera posterior que posee");
        String maderaPosterior = teclado();
        System.out.println("Ingrese la madera frontal que posee");
        String maderaFrontal= teclado();
        inv.agregarGuitarra(nro,precio,fabricante,modelo,tipo,maderaPosterior,maderaFrontal);
        return inv;
    }

    /**
     * Metodo que valida los numeros ingresados de letra y/o caracteres
     * @return Retorna una Variable de tipo int.
     */
    public static int validarNumero() {
        Scanner teclado = new Scanner(System.in);

        Integer entrada = 0;
        do {
            try {
                entrada = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("No ingrese letras u oraciones");
                teclado.next();
                entrada = -1;
            }
            if (entrada < 0){
                System.out.println("Opcion no valida");
            }
        } while (entrada < 0);
        return entrada;
    }

    /**
     * Metodo que Tranforma int a String
     * @return devuelve el int trasformado
     */
    private static String stringNumeros() {
        int numero = validarNumero();
        String numeroEnString = String.valueOf(numero);
        return  numeroEnString;
    }

    /**
     * Metodo que llama el teclado para escribir
     * @return el string escrito en el teclado
     */
    public static String teclado() {
        Scanner teclado = new Scanner(System.in);
        String texto = teclado.nextLine();
        return texto;
    }
}
