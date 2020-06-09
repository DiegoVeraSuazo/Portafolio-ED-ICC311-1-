package dci.ed;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventario {
    public List<Guitarra> listaGuitarras;

    public Inventario() {
        listaGuitarras = new LinkedList();
    }

    public void agregarGuitarra(String numeroSerie, double precio,
                                String fabricante, String modelo, String tipo,
                                String maderaPosterior, String maderaFrontal) {
        Guitarra guitarra = new Guitarra(numeroSerie, precio, fabricante,
                modelo, tipo, maderaPosterior, maderaFrontal);
        listaGuitarras.add(guitarra);
    }

    public Guitarra obtenerGuitarra(String numeroSerie) {
        Iterator<Guitarra> iterador = listaGuitarras.iterator();
        while (iterador.hasNext()) {
            Guitarra guitarra = iterador.next();
            if (guitarra.getNumeroSerie().equals(numeroSerie)) {
                return guitarra;
            }
        }
        return null;
    }

    public Guitarra buscar(Guitarra guitarraBuscada) {

        Iterator<Guitarra> iterador = listaGuitarras.iterator();

        while (iterador.hasNext()) {

            Guitarra guitarra = iterador.next();
            String fabricante = guitarraBuscada.getFabricante();
            if ((fabricante != null) && (!fabricante.equals("")) &&
                    (!fabricante.equals(guitarra.getFabricante()))) {
                continue;
            }

            String modelo = guitarra.getModelo();
            if ((modelo != null) && (!modelo.equals("")) &&
                    (!modelo.equals(guitarra.getModelo()))){
                continue;
            }

            String tipo = guitarra.getTipo();
            if ((tipo != null) && (!tipo.equals("")) &&
                    (!tipo.equals(guitarra.getTipo()))){
                continue;
            }

            String maderaPosterior = guitarra.getMaderaPosterior();
            if ((maderaPosterior != null) && (!maderaPosterior.equals("")) &&
                    (!maderaPosterior.equals(guitarra.getMaderaFrontal()))){
                continue;
            }

            String maderaFrontal = guitarra.getMaderaFrontal();
            if ((maderaFrontal != null) && (!maderaFrontal.equals("")) &&
                    (!maderaFrontal.equals(guitarra.getMaderaFrontal()))){
                continue;
            }
        }
        return null;
    }


}
