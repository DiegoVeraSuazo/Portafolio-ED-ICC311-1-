package ed.dci;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SetDemo {

    public ArrayList<Integer>[] buckets;

    private int tamanoActual = 0;

    private double factorIndicador;

    public SetDemo(int tamano, double factorIndicador){
        buckets = new ArrayList[tamano];
        for(int i=0;i<tamano;i++){
            buckets[i] = new ArrayList<Integer>();
        }
        this.factorIndicador = factorIndicador;
    }

    private int hashCode(int valor){
        return valor;
    }

    public boolean add(int valor){
        if (!contiene(valor)){
            int index = hashCode(valor) % buckets.length;
            ArrayList<Integer> bucket = buckets[index];
            bucket.add(valor);
            tamanoActual++;
            return true;
        }
        return false;
    }



    public boolean contiene(int valor){
        int index = hashCode(valor) % buckets.length;
        ArrayList<Integer> bucket = buckets[index];
        return bucket.contains(valor);
    }
}
