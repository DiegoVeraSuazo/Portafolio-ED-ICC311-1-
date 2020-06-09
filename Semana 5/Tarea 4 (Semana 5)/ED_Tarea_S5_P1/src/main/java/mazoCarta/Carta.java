package mazoCarta;

import java.util.Comparator;

public class Carta implements Comparable<Carta>{

//public class Carta {

    private TipoCarta tipoCarta;
    private ValorCarta valorCarta;

    public Carta(TipoCarta tipoCarta, ValorCarta valorCarta) {
        this.tipoCarta = tipoCarta;
        this.valorCarta = valorCarta;
    }

    public TipoCarta getTipoCarta() {
        return tipoCarta;
    }

    public void setTipoCarta(TipoCarta tipoCarta) {
        this.tipoCarta = tipoCarta;
    }

    public ValorCarta getValorCarta() {
        return valorCarta;
    }

    public void setValorCarta(ValorCarta valorCarta) {
        this.valorCarta = valorCarta;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "tipoCarta=" + tipoCarta +
                ", colorCarta=" +tipoCarta.getColor()+
                ", valorCarta=" + valorCarta +
                '}';
    }

    @Override
    public int compareTo(Carta o) { //decir que el problema de utilizar esta aproximacion es que este queda como default
        return this.tipoCarta.getColor().compareTo(o.getTipoCarta().getColor());
    }

    public static Comparator<Carta> ValorComparator
            = new Comparator<Carta>() {
        @Override
        public int compare(Carta o1, Carta o2) {
                int uno = o1.getValorCarta().getValorNumero();
                int dos = o2.getValorCarta().getValorNumero();
                if(uno>dos){
                    return 1;
                }else{
                    if(uno==dos){
                        return 0;
                    }else {
                        return -1;
                    }
                }
        }
    };
}
