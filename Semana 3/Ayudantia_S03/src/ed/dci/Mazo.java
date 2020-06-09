package ed.dci;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Stack;

public class Mazo {

    private Stack<Carta> cartas;

    public Mazo(){
        this.cartas = new Stack();
        TipoCarta tipos[] = TipoCarta.values();
        ValorCarta valoresCartas[] = ValorCarta.values();
        for(TipoCarta tipo:tipos){
            for(ValorCarta valorCarta:valoresCartas){
                this.cartas.push(new Carta(tipo,valorCarta));
            }
        }
    }

    public void mostrarMazo(){
        Iterator<Carta> it = cartas.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    public Carta obtenerPrimera(){ return this.cartas.pop(); }

    public Carta verPrimera(){
        return this.cartas.peek();
    }

    public void barajar(){
        Collections.shuffle(this.cartas);
    }

    public void ordenarPorColorOP1(){
        //Collections.sort(this.cartas);  //descomentar para ejemplificar como funciona implementar comparable
        Collections.sort(this.cartas,new Comparator<Carta>() {
            @Override
            public int compare(Carta c1, Carta c2) {
                return c1.getTipoCarta().getColor().compareTo(c2.getTipoCarta().getColor());
            }
        });
    }

    public void ordenarPorColorOP2(){//lambda
        this.cartas.sort((c1,c2)->
                c1.getTipoCarta().getColor().compareTo(c2.getTipoCarta().getColor()));
    }

    public void ordenarPorValor() {// menor a mayor, dar vuelta para ordenar de mayor a menos
        Collections.sort(this.cartas,Carta.ValorComparator);//ordena con comparator
    }

    public void ordenarPorTipo(){ //ordena con lamba
        this.cartas.sort((c1,c2)->c1.getTipoCarta().compareTo(c2.getTipoCarta()));
    }

    public Stack<Carta> repartirCartas(int numeroCartas){
        Stack<Carta> mano = new Stack<>();
        for(int i=0;i<numeroCartas;i++){
            mano.push(this.cartas.pop());
        }
        return mano;
    }

}
