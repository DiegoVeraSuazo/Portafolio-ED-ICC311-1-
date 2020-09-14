package ed.tarea.s11;

public class arbolBinario {

    protected Nodo root = null;

    arbolBinario(int valor) {
        root = new Nodo(valor);
    }

    arbolBinario() {
        root = null;
    }

    /*
        método privado, para agregar nodo
     */

    private Nodo agregarNodo(Nodo actual, int value) {
        Nodo nuevo;
        nuevo = new Nodo (value);
        nuevo.valor = value;
        nuevo.nodoIzquierdo = null;
        nuevo.nodoDerecho = null;
        if (root == null)
            root = nuevo;
        else {
            Nodo anterior = null, reco;
            reco = root;
            while (reco != null) {
                anterior = reco;
                if (value < reco.valor)
                    reco = reco.nodoIzquierdo;
                else
                    reco = reco.nodoDerecho;
            }
            if (value < anterior.valor)
                anterior.nodoIzquierdo = nuevo;
            else
                anterior.nodoDerecho = nuevo;
        }
        return actual;
    }

    /*
        método público, para agregar nodo
     */
    public void agregar(int value) {
        // completar método
        agregarNodo(root, value);
    }

    /*
        método privado, para buscar nodo con cierto valor
     */
    private boolean buscarNodo(Nodo actual, int valor) {
        // completar método
        Nodo auxiliar = actual;
        if (auxiliar == null) return false;
        while (auxiliar.valor != valor) {
            if (valor < auxiliar.valor) {
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

    /*
        método público, para buscar nodo con cierto valor
     */
    public boolean buscar(int valor) {
        // completar método
        return buscarNodo(root,valor);
    }

    /*
        método privado, para eliminar nodo
     */
    private Nodo eliminarNodo(Nodo actual, int valor) {
        // completar método
        if (actual == null) { return actual; }
        if (valor < actual.valor)
            actual.nodoIzquierdo = eliminarNodo(actual.nodoIzquierdo, valor);
        else if (valor > actual.valor) {
            actual.nodoDerecho = eliminarNodo(actual.nodoDerecho, valor);
        } else {
            if (actual.nodoIzquierdo == null && actual.nodoDerecho == null) {
                return null;
            } else if (actual.nodoIzquierdo == null) {
                //actual = actual.nodoDerecho;
                return actual.nodoDerecho;
            } else if (actual.nodoDerecho == null) {
                //actual = actual.nodoIzquierdo;
                return actual.nodoIzquierdo;
            } else {
                Integer valorMin = minValor(actual.nodoDerecho);
                actual.valor = valorMin;
                actual.nodoDerecho = eliminarNodo(actual.nodoDerecho,valorMin);
            }
        }
        return actual;
    }
    private Integer minValor(Nodo nodo) {
        if(nodo.nodoDerecho != null) {
            return minValor(nodo.nodoIzquierdo);
        }
        return nodo.valor;
    }

    /*
        método público, para eliminar nodo
     */
    public void eliminar(int valor) {
        // completar método
        eliminarNodo(root,valor);
    }

    /*
     * Dado un árbol binario, imprime sus nodos en En Orden
     */
    void imprimirEnOrden(Nodo node) {
        if (node == null)
            return;

        /* primero el nodo izquierdo*/
        imprimirEnOrden(node.nodoIzquierdo);

        /* luego imprimir el valor del nodo*/
        System.out.print(node.valor + " ");

        /* luego el nodo  derecho */
        imprimirEnOrden(node.nodoDerecho);
    }

    /*
     * wrapper para el método imprimirEnOrden
     */
    void imprimirEnOrden() {
        imprimirEnOrden(root);
    }

}



