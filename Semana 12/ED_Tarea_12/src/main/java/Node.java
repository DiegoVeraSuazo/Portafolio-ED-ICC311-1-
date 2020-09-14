public class Node {

    int valor;
    Node left;
    Node right;

    Node(int value) {
        this.valor = value;
    }

    Node(){}

    /**
     * Metodo que busca el nodo de maximo valor
     * @return el nodo que es maximo en el arbol
     */
    public Node encontrarMax(){
        if (right != null){
            return right.encontrarMax();
        }
        return this;
    }
}
