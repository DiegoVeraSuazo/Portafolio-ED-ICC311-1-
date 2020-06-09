package dci.ed;

import java.util.*;

public class EjemploIteratorList {
    public static void main(String[] args) {

        List<String> arrayListFrutas = new ArrayList();
        arrayListFrutas.add("manzana");
        arrayListFrutas.add("limón");
        arrayListFrutas.add("plátano");
        arrayListFrutas.add("naranja");
        arrayListFrutas.add("limón");

        // la lista arrayListFrutas
        System.out.println("La lista arrayListFrutas es: \n" + arrayListFrutas);

        //Crear un iterador para la lista
        //usando el método iterator()
        Iterator iterador = arrayListFrutas.iterator(); // [manzana, limón, plátano, naranja, limón]

        //Desplegar los valores luego de
        //iterar la lista
        System.out.println("\nLos valores iterados" + " de la lista son: ");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        // Lista enlazada
        List<String> listaEnlazadaFrutas = new LinkedList();
        listaEnlazadaFrutas.add("manzana");
        listaEnlazadaFrutas.add("limón");
        listaEnlazadaFrutas.add("plátano");
        listaEnlazadaFrutas.add("naranja");
        listaEnlazadaFrutas.add("limón");

        // la lista arrayListFrutas original
        System.out.println("La lista listaEnlazadaFrutas es: \n" + listaEnlazadaFrutas);

        //Crear un iterador para la lista
        //usando el método iterator()
        Iterator<String> iterator = listaEnlazadaFrutas.iterator();

        //Desplegar los valores luego de
        //iterar la lista
        System.out.println("\nLos valores iterados" + " de la lista son: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterar LinkedList usando for loop
        System.out.println("Iterando con for loop");
        for (int i = 0; i < listaEnlazadaFrutas.size(); i++) {
            System.out.println(listaEnlazadaFrutas.get(i));
        }

        // Enhanced for loop
        // observar que es necesario definir la lista genérica
        System.out.println("Iterando con Enhanced for loop");
        for (String temp : listaEnlazadaFrutas) {
            System.out.println(temp);
        }

        // Iterar usando While loop
        System.out.println("Iterando con While loop: ");
        int i = 0;
        while (i < listaEnlazadaFrutas.size()) {
            System.out.println(listaEnlazadaFrutas.get(i));
            i++;
        }

        // Iterar usando forEach()
        // Observe que debe tener java superior a 8
        System.out.println("Iterando con forEach() opción 1: ");
        listaEnlazadaFrutas.forEach(x -> System.out.println(x));

        System.out.println("Iterando con forEach() opción 2: ");
        listaEnlazadaFrutas.forEach(System.out::println);





    }
}
