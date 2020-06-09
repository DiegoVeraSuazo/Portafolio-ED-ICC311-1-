package ed.dci;

public enum TipoCarta {
    PICA("NEGRA"),
    CORAZON("ROJA"),
    DIAMANTE("ROJA"),
    TREBOL("NEGRA");

    private String color;

    TipoCarta(String color){
        this.color = color;
    }
    public String getColor(){
       return this.color;
    }

    public String getTipoCarta(){
        return this.name();
    }
}
