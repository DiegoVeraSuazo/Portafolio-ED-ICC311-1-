package ejemplo2;

public class Nodo {

    int valor;
    String dato;
    Nodo nodoDerecho;
    Nodo nodoIzquierdo;
    Nodo(int valor) {
        this.valor = valor;
    }

    public String getDato(int valor) {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "valor=" + valor +
                ", dato='" + dato + '\'' +
                '}';
    }
}

