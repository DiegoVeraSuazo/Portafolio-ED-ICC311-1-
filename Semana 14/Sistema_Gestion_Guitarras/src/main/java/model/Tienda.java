package model;


import dateTime.DateItem;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Tienda implements Operaciones {

    private LinkedList<Guitarra> inventarioGuitarra;
    private LinkedList<Piano> inventarioPiano;


    public Tienda() {
        this.inventarioGuitarra = new LinkedList<>();
        this.inventarioPiano = new LinkedList<>();
    }

    public boolean agregarGuitarra(Guitarra guitarra){return inventarioGuitarra.add(guitarra);}
    public boolean agregarPiano(Piano piano){return inventarioPiano.add(piano);}


    public LinkedList<Guitarra> getInventarioGuitarra() {
        return inventarioGuitarra;
    }

    public void setInventarioGuitarra(LinkedList<Guitarra> inventarioGuitarra) {
        this.inventarioGuitarra = inventarioGuitarra;
    }

    public LinkedList<Piano> getInventarioPiano() {
        return inventarioPiano;
    }

    public void setInventarioPiano(LinkedList<Piano> inventarioPiano) {
        this.inventarioPiano = inventarioPiano;
    }


    @Override
    public void mostrar() {
        Iterator<Guitarra> iteratorGuitarra = inventarioGuitarra.iterator();
        while (iteratorGuitarra.hasNext()){
            System.out.println(iteratorGuitarra.next().toString());
        }
        Iterator<Piano> iteratorPiano = inventarioPiano.iterator();
        while (iteratorPiano.hasNext()){
            System.out.println(iteratorPiano.next().toString());
        }
    }
}
