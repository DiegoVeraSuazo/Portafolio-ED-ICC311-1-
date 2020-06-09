package Model;

import java.util.*;

public class Empresa {

    private List<Director> directorList;
    private List<Mecanico> mecanicoList;

    public Empresa(){
        directorList = new LinkedList();
        mecanicoList = new LinkedList();
    }


    public void mecanicoTrabaja(int mecanico){
        mecanicoList.get(mecanico).setReparando(true);
    }
    public void directorTrabaja(int director){
        directorList.get(director).setTrabajando(true);
    }

}
