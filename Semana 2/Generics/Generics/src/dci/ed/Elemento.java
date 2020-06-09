package dci.ed;

/*
 *  El parámetro T, representa un tipo de dato
 *  Es decir, T es un tipo genérico (Generics) o parametrizado
 */
public class Elemento <T> {

    public T dato;

    public Elemento(){ }

    public void setDato(T t){
        this.dato = t;
    }

    public T getDato(){
        return this.dato;
    }
}
