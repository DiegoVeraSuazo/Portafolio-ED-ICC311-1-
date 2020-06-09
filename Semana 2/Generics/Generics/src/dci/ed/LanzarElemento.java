package dci.ed;

public class LanzarElemento <T> {
    public static void main(String[] args) {
        Elemento<Double> elEntero = new Elemento<Double>();
        elEntero.setDato(23.3);
        System.out.println(elEntero.getDato());

        Elemento<String> elString = new Elemento<String>();
        elString.setDato("hola");
        System.out.println(elString.getDato());
    }
}
