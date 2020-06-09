package dci.ed;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class EjemploBasicoQueue {
    public static void main(String[] args) {

        Queue<String> queueFrutas = new LinkedList();
        queueFrutas.add("manzana");
        queueFrutas.add("limón");
        queueFrutas.add("plátano");
        queueFrutas.add("naranja");
        queueFrutas.add("limón");

        // la cola queueFrutas original
        System.out.println("La cola queueFrutas es:"+ queueFrutas); // [manzana, limón, plátano, naranja, limón]

        //Crear un iterador para la lista
        //usando el método iterator()
        Iterator value = queueFrutas.iterator();

        System.out.println("\nLos valores iterados" + " de la cola son: ");
        for (String item: queueFrutas){
            System.out.println(item);
        }

    }

}
