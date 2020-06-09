package ed.dci;

public enum ValorCarta {
    JOKER(0),
    ACE(1),
    N2(2),
    N3(3),
    N4(4),
    N5(5),
    N6(6),
    N7(7),
    N8(8),
    N9(9),
    JACK(10),
    QUEEN(11),
    KING(12);


    private int valor;
    ValorCarta(int valor){
        this.valor = valor;
    }

    public int getValorNumerico(){
        return this.valor;
    }
    public String getValorCarta(){
        return this.name();
    }

}
