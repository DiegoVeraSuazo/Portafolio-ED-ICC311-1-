package ejemplo2;
import java.util.Scanner;

// Guardar datos en los nodos(Escritura de String con metodo Scanner) //

public class ArbolBinario {

    protected Nodo root = null;

    ArbolBinario(int valor) {
        root = new Nodo(valor);
    }

    ArbolBinario() {
        root = null;
    }

    /**
     * Método privado, para agregar nodo un valor al nodo ademas de un dato escrito.
     * @param actual variable del tipo Nodo al que se le agregara un valor ademas de un dato.
     * @param valor variable del tipo int que indica el valor que se le va a dar al Nodo actual.
     * @return retorna el objeto nodo con los valores agregados.
     **/
    private Nodo agregarNode(Nodo actual, int valor, String dato) {
        if (actual == null) {
            Nodo nuevo = new Nodo(valor);
            nuevo.setDato(dato);
            return nuevo;
        }
        if (valor < actual.valor) {
            actual.nodoIzquierdo = agregarNode(actual.nodoIzquierdo, valor, dato);
        } else if (valor > actual.valor) {
            actual.nodoDerecho = agregarNode(actual.nodoDerecho, valor, dato);
        } else {
            // value already exists
            return actual;
        }
        return actual;
    }

    /**
     * Método privado, que retorna un String que es escrito con Scanner.
     * @return la escritura del dato.
     **/
    private String agregarDato() {
        System.out.println("Agregue el texto que desee");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }

    /**
     *Método público, para agregar nodo.
     * @param valor variable del tipo int que indica el valor que se le va a dar al Metodo que se esta llamando.
     **/
    public void agregar(int valor,String dato) {
        // completar método
        if (dato == null){
            root = agregarNode(root, valor, agregarDato());
        } else {
            root = agregarNode(root, valor, dato);
        }

    }

    /**
     * Método privado, para buscar un nodo con cierto valor, ademas de devolver el dato asignado a esta.
     * @param actual variable del tipo Nodo en la que sera buscado el valor.
     * @param valor variable del tipo int que indica el valor que se esta buscando.
     * @return retorna un booleano dependiendo de si se encontro el valor a no.
     **/
    private boolean buscarNodo(Nodo actual, int valor) {
        // completar método
        Nodo auxiliar = actual;
        boolean existeValor = true;
        if (auxiliar == null) return false;
        while (auxiliar.valor != valor) {
            if (valor < auxiliar.valor) {
                auxiliar = auxiliar.nodoIzquierdo;
            } else {
                auxiliar = auxiliar.nodoDerecho;
            }
            if (auxiliar == null) {
                System.out.println("No existe el nodo escrito");
                existeValor = false;
                return existeValor;
            }
        }
        mostrarDato(auxiliar,existeValor);
        return existeValor;
    }
    /**
     * Método privado, para mostrar el dato con el se encuentra asociado el nodo.
     * @param auxiliar variable del tipo Nodo en la que se obtiene el dato.
     * @param existeValor variable del tipo booleano que indica si existe el valor muestre el dato.
     **/
    private void mostrarDato(Nodo auxiliar, boolean existeValor) {
        if (existeValor == true) System.out.println(auxiliar.toString());
    }

    /**
     * Método publico, para buscar un nodo.
     * @param valor variable del tipo int que indica el valor que se esta buscando.
     * @return retorna un metodo de tipo booleano.
     **/
    public boolean buscar(int valor) {
        // completar método
        return buscarNodo(root,valor);
    }

}



