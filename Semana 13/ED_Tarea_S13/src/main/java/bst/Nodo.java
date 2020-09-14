package bst;


public class Nodo {
    int valor;
    Nodo leftChild;
    Nodo rightChild;

    Nodo(int value) {
        this.valor = value;
    }

    /**
     * Metodo que busca el nodo de maximo valor
     * @return el nodo que es maximo en el arbol
     */
    public Nodo encontrarMax(){
        if (rightChild != null){
            return rightChild.encontrarMax();
        }
        return this;
    }
}

