package ed.dci;

public class ListaEnlazada {
    // variables miembro de la clase Lista Enlazada
    Nodo cabeza = null;
    Nodo cola = null;

    /*
     *  Método que permite agregar un elemento
     *  al frente de la Lista Enlazada
     */
    public void agregarFrente(int valor){
        // implementar
        /*---------------------------------
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        if ( nuevoNodo.siguiente == null ) {
            cola = nuevoNodo;
        }
        ----------------------------------*/
        //Implementación correcta
        Nodo nuevoNodo = new Nodo(valor);
        if ( this . cabeza == null ){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo. siguiente = cabeza ;
            cabeza = nuevoNodo;
        }

    }

    /*
     *  Método que permite agregar un elemento
     *  al final la Lista Enlazada
     */
    public void agregarFinal(int valor){
        // implementar
        /*------------------------------------
        Nodo nuevoNodo = new Nodo(valor);
        if ( cola == null ){
            cabeza = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
        }
        cola = nuevoNodo;
        ------------------------------------*/
        //Implementación correcta
        Nodo nuevoNodo = new Nodo(valor);
        if ( this . cabeza == null ){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola . siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    /*
     *  Método que permite agregar un elemento
     *  en un índice específico de la Lista Enlazada
     */
    public void agregarEnIndice(int index, int valor){
        // implementar
        /*----------------------------------------------------------------------------------------------
        int indiceAct = 0;
        Nodo nodoActual = cabeza;

        while (nodoActual != null) {
            nodoActual = nodoActual.siguiente;
            indiceAct++;
        }

        if (index > indiceAct){
            System.out.println("\n-----Se coloco un indice mayor a la que posee la Lista Enlazada-----");
            System.exit(0);
        }

        if (index < 0) {
            throw new IndexOutOfBoundsException();
        } else if ( index == 0) {
            agregarFrente (valor);
        } else {
            Nodo nuevoNodo = new Nodo(valor);
            Nodo actual = cabeza;
            for ( int i = 0; i < index - 1; i++ ){
                if ( actual == null ) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.siguiente;
            }
            if ( actual.siguiente == null ) {
                cola = nuevoNodo;
            } else {
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
                }
        }
         ----------------------------------------------------------------------------------------------*/
        //Implementacion Correcta
        int indiceAct = 0;
        Nodo nodoActual = cabeza;
        while (nodoActual != null) {
            nodoActual = nodoActual.siguiente;
            indiceAct++;
        }
        if (index > indiceAct){
            System.out.println("\n-----Se coloco un indice mayor a la que posee la Lista Enlazada-----");
            return;
        }
        Nodo nuevoNodo = new Nodo(valor);
        if (index< 0 ){
            throw new IndexOutOfBoundsException();
        } else if ( index == 0 ) { // agregar en la cabeza
            agregarFrente(valor);
        } else {
            Nodo actual = cabeza;
            for (int i = 0; i < index - 1; i++) {
                if (actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.siguiente;
            }
            if (actual.siguiente == null) { //añadir al final
                actual.siguiente = cola;
                cola = nuevoNodo;
            } else {
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
            }
        }
    }

    /*
     *  Método que permite imprimir los elementos
     *  de la Lista Enlazada
     *  Formato de salida: [1,2,3] o []
     */
    public void imprimirLista(ListaEnlazada nombreLista){
        /*---------------------------------------------------
        Nodo nodoActual = nombreLista.cabeza;
        System.out.print("ListaEnlazada: ");
        while (nodoActual != null) {
                System.out.print("["+nodoActual.valor + "]");
                nodoActual = nodoActual.siguiente;
        }
        ---------------------------------------------------*/
        //Implementación correcta
        if (nombreLista. cabeza == null ){
            System. out .print( "[]" );
        } else {
            Nodo actual = cabeza ;
            String respuesta = "[" ;
            while (actual != null ) {
                if (actual. siguiente != null ) {
                    respuesta = respuesta + actual. valor + "," ;
                } else {
                    respuesta = respuesta + actual. valor ;
                }
                actual = actual. siguiente ;
            }
            System. out .print(respuesta+ "]" );
        }
    }

    public static void main(String[] args) {

        ListaEnlazada listaEnlazada = new ListaEnlazada();

        listaEnlazada.agregarFrente(10);
        listaEnlazada.agregarFrente(14);
        listaEnlazada.agregarFrente(5);

        System.out.println("\nLista enlazada usando solo agregarFrente:");
        listaEnlazada.imprimirLista(listaEnlazada);

        listaEnlazada.agregarFinal(88);
        listaEnlazada.agregarFinal(56);
        listaEnlazada.agregarFinal(72);

        System.out.println("\nLista enlazada usando solo agregarFinal:");
        listaEnlazada.imprimirLista(listaEnlazada);

        listaEnlazada.agregarEnIndice(4, 18);

        System.out.println("\nLista enlazada usando agregarIndice con Index= 4 y Valor= 18 :");
        listaEnlazada.imprimirLista(listaEnlazada);

        listaEnlazada.agregarEnIndice(3, 43);

        System.out.println("\nLista enlazada usando agregarIndice con Index= 3 y Valor= 43 :");
        listaEnlazada.imprimirLista(listaEnlazada);

        listaEnlazada.agregarEnIndice(7, 52);

        System.out.println("\nLista enlazada usando agregarIndice con Index= 7 y Valor= 52 :");
        listaEnlazada.imprimirLista(listaEnlazada);

        listaEnlazada.agregarEnIndice(15, 134);

        listaEnlazada.imprimirLista(listaEnlazada);


    }
}
