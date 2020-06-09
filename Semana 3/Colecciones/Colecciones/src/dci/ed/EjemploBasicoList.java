package dci.ed;

import java.util.*;

public class EjemploBasicoList {
    public static void main(String[] args) {
        /*
         *  implementaciones de la interface List
        */

        // Lista implementada con ArrayList()
        List arrayListFrutas = new ArrayList();
        arrayListFrutas.add("manzana");
        arrayListFrutas.add("limón");
        arrayListFrutas.add("plátano");
        arrayListFrutas.add("naranja");
        arrayListFrutas.add("limón");

        //System.out.println(arrayListFrutas.get(2)); // plátano
        //System.out.println(arrayListFrutas.size()); // 5
        //System.out.println(arrayListFrutas); // [manzana, limón, plátano, naranja, limón]


        // Lista enlazada
        List listaEnlazadaFrutas = new LinkedList();
        listaEnlazadaFrutas.add("manzana");
        listaEnlazadaFrutas.add("limón");
        listaEnlazadaFrutas.add("plátano");
        listaEnlazadaFrutas.add("naranja");
        listaEnlazadaFrutas.add("limón");

        //System.out.println(listaEnlazadaFrutas.get(2)); // plátano
        //System.out.println(listaEnlazadaFrutas.size()); // 5
        //System.out.println(listaEnlazadaFrutas); // [manzana, limón, plátano, naranja, limón]

        // Stack
        Stack stackNumbers = new Stack();
        stackNumbers.push(1); // agrega el item: 1
        stackNumbers.push(2); // agrega el item: 2
        stackNumbers.push(3); // agrega el item: 3
        stackNumbers.push(4); // agrega el item: 4

        //System.out.println(stackNumbers.size()); // 4
        //System.out.println(stackNumbers.peek()); // retorna valor de la posición top: 4
        //System.out.println(stackNumbers.pop()); // retorna remueve valor de la posición top: 4
        //System.out.println(stackNumbers.size()); // 3

    }
}
