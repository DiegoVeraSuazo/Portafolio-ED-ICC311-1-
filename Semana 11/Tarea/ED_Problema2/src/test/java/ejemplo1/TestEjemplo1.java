package ejemplo1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestEjemplo1 {

    ArbolBinario arbol;
    Juego juego1;
    Juego juego2;
    Juego juego3;
    Juego juego4;
    Juego juego5;
    Juego juegoSinAgregar;
    Juego juegoAgregar;
    String impresion1;
    String impresion2;
    Juego juegoImpresion;

    @Before
    public void setUp() throws Exception {
        arbol = new ArbolBinario();
        juego1 = new Juego("The Legend of Zelda", 1986, "Famicom Disk System");
        juego2 = new Juego("Zelda II: The Adventure of Link", 1987, "Famicom Disk System");
        juego3 = new Juego("The Legend of Zelda: A Link to the Past", 1991, "Super Famicom/Super Nintendo");
        juego4 = new Juego("The Legend of Zelda: Link's Awakening", 1993, "Game Boy");
        juego5 = new Juego("The Legend of Zelda: Ocarina of Time", 1998, "Nintendo 64");
        arbol.agregar(juego1);
        arbol.agregar(juego2);
        arbol.agregar(juego3);
        arbol.agregar(juego4);
        arbol.agregar(juego5);

        impresion1 = "The Legend of Zelda ; Zelda II: The Adventure of Link ; The Legend of Zelda: A Link to the Past ; The Legend of Zelda: Link's Awakening ; The Legend of Zelda: Ocarina of Time ; ";
        impresion2 = "The Legend of Zelda ; Zelda II: The Adventure of Link ; The Legend of Zelda: A Link to the Past ; The Legend of Zelda: Link's Awakening ; The Legend of Zelda: Ocarina of Time ; The Legend of Zelda: Skyward Sword ; ";

    }

    @Test
    public void agregar() {
        juegoAgregar = new Juego("The Legend of Zelda: Majora's Mask", 2000, "Nintendo 64");
        Assert.assertFalse(arbol.buscar(juegoAgregar));
        arbol.agregar(juegoAgregar);
        Assert.assertTrue(arbol.buscar(juegoAgregar));
    }

    @Test
    public void buscar() {
        Assert.assertTrue(arbol.buscar(juego1));
        Assert.assertTrue(arbol.buscar(juego2));
        Assert.assertTrue(arbol.buscar(juego3));
        Assert.assertTrue(arbol.buscar(juego4));
        Assert.assertTrue(arbol.buscar(juego5));
        Assert.assertFalse(arbol.buscar(juegoSinAgregar));
    }

    @Test
    public void impresionOrden() {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        arbol.imprimirEnOrden();
        assertEquals(impresion1,out.toString());

        final ByteArrayOutputStream impreso = new ByteArrayOutputStream();
        System.setOut(new PrintStream(impreso));
        juegoImpresion = new Juego("The Legend of Zelda: Skyward Sword", 2011, "Nintendo Wii");
        arbol.agregar(juegoImpresion);
        arbol.imprimirEnOrden();
        assertEquals(impresion2,impreso.toString());
    }

}
