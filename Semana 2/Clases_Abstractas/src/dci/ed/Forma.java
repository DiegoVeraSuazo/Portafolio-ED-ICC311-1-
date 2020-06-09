package dci.ed;
/*
 * Clase abstracta
 * Diseñada para funcionar como un template
 */
public abstract class Forma {
    /*
     * El método también debe ser abstracto
     */
    abstract double calcularArea();

    /*
     * Pero también puede existar 1 o más métodos no abstractos
     */
    public void imprimir(){
        System.out.println("Soy una forma" );
    }
}
