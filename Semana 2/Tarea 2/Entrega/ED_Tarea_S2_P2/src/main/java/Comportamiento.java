public interface Comportamiento {

    default String comer() {
        return "crac-crac";
    }

    default String hacerSonido() {
        return "sound";
    }

}
