package dci.ed;

public class FormaTester {
    public static void main(String[] args) {

        Forma rectangulo = new Rectangulo(5, 6);
        rectangulo.imprimir();
        System.out.println(rectangulo.calcularArea());
    }
}

