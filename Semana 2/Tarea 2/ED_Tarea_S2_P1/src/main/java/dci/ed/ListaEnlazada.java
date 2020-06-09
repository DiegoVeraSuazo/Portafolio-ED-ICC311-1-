package dci.ed;

public class ListaEnlazada {

    Nodo cabeza = null;
    Nodo cola = null;

    /*
     *  Método que permite si un valor particular
     *  existe en la Lista Enlazada
     */
    public boolean contiene(int valor){
        // implementar
        Nodo actual = cabeza;
        while (actual != null){
            if ( actual.valor == valor ) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    /*
     *  Método que permite obtener un valor determinado
     *  en una posición específica de una la Lista Enlazada
     */
    public int getPorIndice(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            Nodo actual = cabeza;
            for (int i = 0; i < index; i++) {
                if (actual == null) {
                    throw new NullPointerException();
                }
                if (actual == null || actual.siguiente == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.siguiente;
            }
            return actual.valor;
        }
    }
    /*
     *  Método que permite remover un valor
     *  desde el frente de una la Lista Enlazada
     */
    public void removerDesdeFrente(){
        // implementar
        try {
            if (cabeza == null & cola == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException NPE) {
            System.out.println("\nLa Lista es Null");
            throw NPE;
        }
        if ( cabeza != null ) {
            cabeza = cabeza.siguiente;
        }
        if ( cabeza == null ) {
            cola = null;
        }
    }

    /*
     *  Método que permite remover un valor
     *  desde la rear una la Lista Enlazada
     */
    public void removerDesdeCola(){
        // implementar
        try {
            if (cabeza == null & cola == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException NPE) {
            System.out.println("\nLa Lista es Null");
            throw NPE;
        }
        if ( cabeza == null ) { // Lista vacía
            return;
        } else if ( cabeza.equals(cola) ) { // sólo un elemento en la lista
            cabeza = null;
            cola = null;
        } else {
            Nodo actual = cabeza;
            while ( actual.siguiente != cola ) {
                actual = actual.siguiente;
            }
            cola = actual;
            actual.siguiente = null;
        }
    }

    /*
     *  Método que permite remover un valor determinado
     *  en una posición específica de una la Lista Enlazada
     */
    public void removerEnIndice(int index){
        // implementar
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        } else if ( index == 0 ) {
            removerDesdeFrente();
        } else {
            Nodo actual = cabeza;
            for ( int i = 0; i < index - 1; i++ ) {
                if (actual == null) {
                    try {
                        throw new NullPointerException();
                    }catch (NullPointerException NPE) {
                        System.out.println("NullPointer");
                        throw NPE;
                    }
                }
                if (actual == null || actual.siguiente == null) {
                    try {
                        throw new IndexOutOfBoundsException();
                    }catch (IndexOutOfBoundsException IOE) {
                        System.out.println("IndexOut");
                        throw IOE;
                    }
                }
                actual = actual.siguiente;
            }
            actual.siguiente = actual.siguiente.siguiente;
            if ( actual.siguiente == null ) {
                cola = actual;
            }
        }
    }

    /*
     *  Método que permite agregar un elemento
     *  al frente de la Lista Enlazada
     */
    public void agregarFrente(int valor){
        // implementar
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
        Nodo nuevoNodo = new Nodo(valor);
        if (index< 0 ){
            throw new IndexOutOfBoundsException();
        } else if ( index == 0 ) {
            agregarFrente(valor);
        } else {
            Nodo actual = cabeza;
            for (int i = 0; i < index - 1; i++) {
                if (actual == null) {
                    try {
                        throw new NullPointerException();
                    }catch (NullPointerException NPE) {
                        System.out.println("NullPointer");
                        throw NPE;
                    }
                }
                if (actual == null || actual.siguiente == null) {
                    try {
                        throw new IndexOutOfBoundsException();
                    }catch (IndexOutOfBoundsException IOE) {
                        System.out.println("IndexOut");
                        throw IOE;
                    }
                }
                actual = actual.siguiente;
            }
            if (actual.siguiente == null) {
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
     */
    public void imprimirLista(ListaEnlazada nombreLista){
        // implementar
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

    
}
