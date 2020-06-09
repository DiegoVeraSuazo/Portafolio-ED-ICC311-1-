package dci.ed;

public class Pila {
    // agregar los elementos que permiten implementar una Pila
    Nodo top = null;

    /*
     *  Método que permite agregar un elemento desde el frente de la pila
     */
    public void push(int valor){
        // implementar
        Nodo nuevoNodo = new Nodo(valor);
        if (this.top == null){
            top = nuevoNodo;
        } else {
            nuevoNodo.siguiente = top ;
            top = nuevoNodo;
        }
    }

    /*
     *  Método que permite eliminar un elemento desde el frente de la pila
     */
    public void pop(){
        // implementar
        if (top != null) {
            top = top.siguiente;
        }
        try {
            if (top == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException NPE) {
            System.out.println("\nLa pila es Null");
            throw NPE;
        }

    }


}
