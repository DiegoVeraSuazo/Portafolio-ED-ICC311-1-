package dci.ed;

public class Cola {
    
    // agregar los elementos que permiten implementar una Cola
    Nodo rear;
    Nodo front;

    /*
     *  Método que permite agregar al final de la rear
     */
    public void agregarEnCola(int valor){
        // implementar
        Nodo nuevoNodo = new Nodo(valor);
        if (this.front == null){
            front = nuevoNodo;
            rear = nuevoNodo;
        } else {
            rear.siguiente = nuevoNodo;
            rear = nuevoNodo;
        }
    }

    /*
     *  Método que permite remover desde el frente de la rear
     */
    public void removerDesdeFrente(){
        // implementar
        if (front != null) {
            front = front.siguiente;
        }
        try {
            if (front == null) {
                rear = null;
                throw new NullPointerException();
            }
        } catch (NullPointerException NPE) {
            System.out.println("\nLa cola es Null");
            throw NPE;
        }
    }

}
