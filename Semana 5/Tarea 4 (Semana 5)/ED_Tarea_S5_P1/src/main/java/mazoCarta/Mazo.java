package mazoCarta;
import java.util.*;

public class Mazo {

    private List<Carta> cartasList;
    private Queue<Carta> cartasQueue;
    private Set<Carta> cartasSet;

    public Mazo(){
        MazoList();
        MazoQueue();
        MazoSet();
    }

    public void MazoList(){
        this.cartasList = new LinkedList();
        TipoCarta tipos[] = TipoCarta.values();
        ValorCarta valoresCartas[] = ValorCarta.values();
        for(TipoCarta tipo:tipos){
            for(ValorCarta valorCarta:valoresCartas){
                this.cartasList.add(new Carta(tipo,valorCarta));
            }
        }
    }

    public void MazoQueue(){
        this.cartasQueue = new LinkedList();
        TipoCarta tipos[] = TipoCarta.values();
        ValorCarta valoresCartas[] = ValorCarta.values();
        for(TipoCarta tipo:tipos){
            for(ValorCarta valorCarta:valoresCartas){
                this.cartasQueue.add(new Carta(tipo,valorCarta));
            }
        }
    }

    public void MazoSet(){
        this.cartasSet = new HashSet();
        TipoCarta tipos[] = TipoCarta.values();
        ValorCarta valoresCartas[] = ValorCarta.values();
        for(TipoCarta tipo:tipos){
            for(ValorCarta valorCarta:valoresCartas){
                this.cartasSet.add(new Carta(tipo,valorCarta));
            }
        }
    }

    public void mostrarMazoList(){
        Iterator<Carta> it = cartasList.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    public void mostrarMazoQueue(){
        Iterator<Carta> it = cartasQueue.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    public void mostrarMazoSet(){
        Iterator<Carta> it = cartasSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }


    public Carta obtenerPrimeraCartaList(){
        Carta auxiliar = this.cartasList.get(0);
        this.cartasList.remove(0);
        return auxiliar;
    }
    public Carta obtenerPrimeraCartaQueue(){
        return this.cartasQueue.remove();
    }
    public Carta obtenerPrimeraCartaSet(){
        Carta[] arrayCarta = cartasSet.toArray(new Carta[cartasSet.size()]);
        cartasSet.remove(arrayCarta[0]);
        return arrayCarta[0];
    }

    public Carta verPrimeraCartaList(){
        return this.cartasList.get(0);
    }

    public Carta verPrimeraCartaQueue(){
        return this.cartasQueue.peek();
    }

    public Carta verPrimeraCartaSet(){
        Carta[] arrayCarta = cartasSet.toArray(new Carta[cartasSet.size()]);
        return arrayCarta[0];
    }

    public void barajarList(){
        Collections.shuffle(this.cartasList);
    }

    /*
    public void barajarSet(){
        Collections.shuffle(this.cartasSet);
    }
    */

    /*
    public void barajarQueue(){
        Collections.shuffle(this.cartasQueue);
    }
    */

    public void ordenarPorColorList(){
        //Collections.sort(this.cartas);  //descomentar para ejemplificar como funciona implementar comparable
        Collections.sort(this.cartasList,new Comparator<Carta>() {
            @Override
            public int compare(Carta c1, Carta c2) {
                return c1.getTipoCarta().getColor().compareTo(c2.getTipoCarta().getColor());
            }
        });
    }

    public void ordenarPorValorList() {// menor a mayor, dar vuelta para ordenar de mayor a menos
        Collections.sort(this.cartasList,Carta.ValorComparator);//ordena con comparator
    }

    public void ordenarPorTipoList(){ //ordena con lamba
        this.cartasList.sort((c1,c2)->c1.getTipoCarta().compareTo(c2.getTipoCarta()));
    }


    public Stack<Carta> repartirCartasList(int numeroCartas){
        Stack<Carta> mano = new Stack<>();
        for(int i=0;i<numeroCartas;i++){
            Carta auxiliar = this.cartasList.get(0);
            this.cartasList.remove(0);
            mano.push(auxiliar);
        }
        return mano;
    }

    public Stack<Carta> repartirCartasQueue(int numeroCartas){
        Stack<Carta> mano = new Stack<>();
        for(int i=0;i<numeroCartas;i++){
            mano.push(cartasQueue.remove());
        }
        return mano;
    }
    public Stack<Carta> repartirCartasSet(int numeroCartas){
        Stack<Carta> mano = new Stack<>();
        for(int i=0;i<numeroCartas;i++){
            Carta[] arrayCarta = cartasSet.toArray(new Carta[cartasSet.size()]);
            cartasSet.remove(arrayCarta[0]);
            mano.push(arrayCarta[0]);
        }
        return mano;
    }

}
