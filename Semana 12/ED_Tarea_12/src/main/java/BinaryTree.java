import java.util.*;

public class BinaryTree {

    // Raíz del BST
    Node root = null;

    // Constructor según valor
    BinaryTree(int value) {
        root = new Node(value);
    }

    // Constructor por defecto
    BinaryTree() {
        root = null;
    }

    public Node insertarNodo(Node nodo, int valor){
        if (nodo == null) {
            return new Node(valor);
        }
        if (!buscar(nodo,valor)) {
            if (valor < nodo.valor)
                nodo.left = insertarNodo(nodo.left, valor);
            else if (valor > nodo.valor)
                nodo.right = insertarNodo(nodo.right, valor);
            return nodo;
        }
        return nodo;
    }

    public void insertar(int i) {
        root = insertarNodo(root, i);
    }


    /**
     * Metodo que consiste en Buscar nodo con determinado valor
     * @param nodo objeto que pasara por el proceso de busqueda
     * @param value variable que se esta buscando
     * @return booleano
     */
    public boolean buscar(Node nodo, int value) {
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
            return buscar(nodo.left, value);
        } else {
            // Caso valor del nodo es menor que el que se busca,
            // el nodo debe estar en el sub árbol derecho
            return buscar(nodo.right, value);
        }
    }


    public boolean comprobarArbolLleno(Node nodo){
        if (nodo!=null) {
            if(nodo.right == null && nodo.left == null) {
                return true;
            }
            if ((nodo.right != null && nodo.left != null)) {
                return comprobarArbolLleno(nodo.left)&&comprobarArbolLleno(nodo.right);
            }
        }
        return false;
    }

    /**
     * EJERCICIO 3
     * Método que entrega el nivel de un árbol binario.
     * @param nodo árbol que hay que analizar.
     * @return retorna un entero con el valor del nivel del árbol.
     * */
    public int obtenerNivel(Node nodo){
        if(nodo != null){
            return 1 + Math.max(obtenerNivel(nodo.left), obtenerNivel(nodo.right));
//            Math.max();
        }
        return 0;
    }

    public void valorMasGrandeNivel(Node nodo){
        if(nodo == null) return;
        System.out.print(nodo.valor + " ");
        if (nodo.right != null) valorMasGrandeNivel(nodo.right);
        else valorMasGrandeNivel(nodo.left);

    }



    /**
     * Metodo para listar Estudiantes con un mayor promedio al dictado
     */
//    public ArrayList<Estudiante> listarEstudiantesMayorAPromedio(double promedio){
//        ArrayList<Estudiante> estudiantesListados = new ArrayList<Estudiante>();
//        for(Estudiante estudiante:this.estudiantes){
//            if (estudiante.getPromedioGeneral>= promedio){
//                estudiantesListados.add(estudiante);
//            }
//        }
//        return estudiantesListados;
//    }



}
