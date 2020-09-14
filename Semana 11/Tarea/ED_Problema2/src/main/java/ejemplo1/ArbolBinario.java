package ejemplo1;

public class ArbolBinario {

    protected Nodo root = null;

    /**
     *  Constructor parametrizado.
     * @param juego
     */
    ArbolBinario(Juego juego) {
        root = new Nodo(juego);
    }

    /**
     *  Constructor no parametrizado.
     */
    ArbolBinario() {
        root = null;
    }

    /**
     *  Metodo privado para agregar juegos.
     * @param actual
     * @param juego
     */
    private Nodo agregarNodo(Nodo actual, Juego juego) {
        actual = new Nodo (juego);
        actual.juego = juego;
        actual.nodoIzquierdo = null;
        actual.nodoDerecho = null;
        if (root == null)
            root = actual;
        else {
            Nodo anterior = null, reco;
            reco = root;
            while (reco != null) {
                anterior = reco;
                if (juego.getAnioEstrenoJuego() < reco.juego.getAnioEstrenoJuego())
                    reco = reco.nodoIzquierdo;
                else
                    reco = reco.nodoDerecho;
            }
            if (juego.getAnioEstrenoJuego() < anterior.juego.getAnioEstrenoJuego())
                anterior.nodoIzquierdo = actual;
            else
                anterior.nodoDerecho = actual;
        }
        return actual;
    }

    /**
     *  Metodo público para agregar juegos.
     * @param juego
     */
    public void agregar(Juego juego) {
        agregarNodo(root, juego);
    }

    /**
     *  Metodo privado para buscar juegos.
     * @param actual
     * @param juego
     */
    private boolean buscarNodo(Nodo actual, Juego juego) {
        Nodo auxiliar = actual;
        if (auxiliar == null) {
            return false;
        }
        if (juego == null) return false;
        while (auxiliar.juego != juego) {
            if (juego.getAnioEstrenoJuego() < auxiliar.juego.getAnioEstrenoJuego()) {
                auxiliar = auxiliar.nodoIzquierdo;
            } else {
                auxiliar = auxiliar.nodoDerecho;
            }
            if (auxiliar == null) {
                return false;
            }
        }

        return true;
    }


    /**
     *  Metodo público para buscar juegos.
     * @param juego
     */
    public boolean buscar(Juego juego) {
        return buscarNodo(root, juego);
    }

    /**
     *  Metodo privado para mostrar juegos.
     * @param nodo
     */
    private void imprimirEnOrden(Nodo nodo) {
        if (nodo == null)
            return;
        imprimirEnOrden(nodo.nodoIzquierdo); // primero el nodo izquierdo
        System.out.print(nodo.juego + " ; "); // luego imprimir el valor del nodo
        imprimirEnOrden(nodo.nodoDerecho);// luego el nodo  derecho
    }

    /**
     *  Metodo público para mostrar juegos.
     */
    public void imprimirEnOrden() {
        imprimirEnOrden(root);
    }

}