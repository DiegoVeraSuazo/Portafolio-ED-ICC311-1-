package bst;

public class BST {

    // Raíz del BST
    Nodo root = null;

    // Constructor según valor
    BST(int value) {
        root = new Nodo(value);
    }

    // Constructor por defecto
    BST() {
        root = null;
    }

    /**
     * Metodo que consiste en Buscar nodo con determinado valor
     * @param nodo objeto que pasara por el proceso de busqueda
     * @param value variable que se esta buscando
     * @return booleano
     */
    public boolean buscar(Nodo nodo, int value) {
        // Caso base: la raíz del BST root es null
        if (nodo == null) {
            return false;
        }
        // Caso base: el valor la raíz del BST root
        // no es null y es igual que valor
        if (nodo.valor == value) {
            return true;
            // Caso valor del nodo es mayor que el que se busca,
            // el nodo debe estar en el sub árbol izquierdo
        } else if (nodo.valor > value) {
            return buscar(nodo.leftChild, value);
        } else {
            // Caso valor del nodo es menor que el que se busca,
            // el nodo debe estar en el sub árbol derecho
            return buscar(nodo.rightChild, value);
        }
    }

    /**
     * Metodo que elimina el nodo con el valor asignado si es que se confirma que existe aquel valor.
     * @param nodo objeto que pasara por el proceso de eliminar el nodo indicado
     * @param valor variable el cual indica el valor del nodo que se quiere eliminar
     * @return nodo retorna el nodo ya "procesado"
     */
    public Nodo eliminar(Nodo nodo, int valor){
        if (buscar(nodo, valor)){
            if (nodo == null) {
                return nodo;
            }
            if (valor < nodo.valor)
                nodo.leftChild = eliminar(nodo.leftChild, valor);
            else if (valor > nodo.valor) {
                nodo.rightChild = eliminar(nodo.rightChild, valor);
            } else {
                if (nodo.leftChild == null && nodo.rightChild == null){
                    nodo = null;
                } else if (nodo.leftChild == null || nodo.rightChild == null){
                    nodo = nodo.leftChild == null ? nodo.rightChild : nodo.leftChild;
                } else {
                    Nodo nodoPredecesor = nodo.leftChild.encontrarMax();
                    intercambiarDato(nodoPredecesor,nodo);
                    nodo.leftChild = eliminar(nodo.leftChild, nodoPredecesor.valor);
                }
            }
        }
        return nodo;
    }
    /**
     * Metodo que intercambia los valores entre los nodos dados
     * @param nodoA nodo que cambia el valor con el nodoB
     * @param nodoB nodo que cambia el valor con el nodoA
     */
    private void intercambiarDato(Nodo nodoA, Nodo nodoB){
        int temp = nodoA.valor;
        nodoA.valor = nodoB.valor;
        nodoB.valor = temp;
    }

    /**
     * Metodo que inserta un nuevo nodo con su respectivo valor, si es que el valor ingresado no existe
     * @param nodo objeto que pasara por el proceso de insertar el nodo dado
     * @param valor varible de tipo int que indica el numero relacionado con el nodo
     * @return nodo retorna el nodo ya "procesado"
     */
    public Nodo insertar(Nodo nodo, int valor){
        if (nodo == null) {
            return new Nodo(valor);
        }
        if (!buscar(nodo,valor)) {
            if (valor < nodo.valor)
                nodo.leftChild = insertar(nodo.leftChild, valor);
            else if (valor > nodo.valor)
                nodo.rightChild = insertar(nodo.rightChild, valor);
            return nodo;
        }
        return nodo;
    }


}

