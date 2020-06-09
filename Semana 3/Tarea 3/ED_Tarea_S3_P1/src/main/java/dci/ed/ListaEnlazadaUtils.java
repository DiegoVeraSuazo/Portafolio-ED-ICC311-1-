package dci.ed;


import java.text.Collator;
import java.util.Collections;
import java.util.*;
public class ListaEnlazadaUtils {

    public static void insertarOrdenado(LinkedList<Integer> lista, int valor) {
        /* Implementar método */
        if (lista == null) {
            throw new NullPointerException();
        } else {
            lista.add(valor);
            Collections.sort(lista);
            System.out.println(lista);
        }
    }

    public static void removerValoresMaximos(LinkedList<String> list, int N) {
        /* Implementar método */
        if (list == null || N < 0) {
            list.removeAll(list);
            System.out.println("Todas las instancias se han removido");
            return;
        } else if (N > list.size()) {
            System.out.println("Ingresado un N invalido");
            throw new IndexOutOfBoundsException();
        }
        LinkedList auxiliar = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            auxiliar.add(list.get(i));
        }
        Collections.sort(auxiliar);
        System.out.println(auxiliar);
        for (int i = auxiliar.size()-1; i>= auxiliar.size()-N ; i--) {
            list.remove(auxiliar.get(i));
        }
        System.out.println(list);
    }

    public static boolean contieneSubsecuencia(LinkedList<Integer> one, LinkedList<Integer> two) {
        /* Implementar método */
        if (one == null || two == null) {
            System.out.println(false);
            return false;
        }
        if (one.containsAll(two)){
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        LinkedList listStrings = new LinkedList<String>();
        listStrings.add("b");
        listStrings.add("c");
        listStrings.add("d");
        listStrings.add("a");
        listStrings.add("e");
        listStrings.add("f");
        listStrings.add("g");
        listStrings.add("c");


        LinkedList listLarga = new LinkedList<Integer>();
        listLarga.add(1);
        listLarga.add(2);
        listLarga.add(3);
        listLarga.add(4);
        listLarga.add(5);
        listLarga.add(6);
        listLarga.add(9);

        LinkedList list2Corta = new LinkedList<Integer>();
        list2Corta.add(4);
        list2Corta.add(5);
        list2Corta.add(6);

        LinkedList list3Corta = new LinkedList<Integer>();
        list3Corta.add(20);
        list3Corta.add(45);
        list3Corta.add(46);

        LinkedList listVacia = new LinkedList<Integer>();
        removerValoresMaximos(listStrings, 4);

    }

}
