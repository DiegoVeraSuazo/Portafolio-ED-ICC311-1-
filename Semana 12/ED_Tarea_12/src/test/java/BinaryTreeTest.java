import org.junit.Before;
import org.junit.Test;

import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    BinaryTree arbolBinario;
    BinaryTree arbolBinario1;
    BinaryTree arbolBinario2;
    BinaryTree arbolBinario3;
    BinaryTree arbolBinario4;
    BinaryTree arbolBinario5;
    BinaryTree arbolBinarioVacio;
    String arbolEnPreOrden;
    String valoresMax;
    String valoresMax2;


    @Before
    public void setUp() throws Exception {
        arbolBinario = new BinaryTree();
        arbolBinario.insertar(50);
        arbolBinario.insertar(30);
        arbolBinario.insertar(20);
        arbolBinario.insertar(40);
        arbolBinario.insertar(70);
        arbolBinario.insertar(60);
        arbolBinario.insertar(80);

        arbolEnPreOrden = "50 30 20 40 70 60 80 ";

        arbolBinario1 = new BinaryTree();
        arbolBinario1.insertar(100);
        arbolBinario1.insertar(120);

        arbolBinario2 = new BinaryTree();
        arbolBinario2.insertar(100);
        arbolBinario2.insertar(110);
        arbolBinario2.insertar(90);

        arbolBinario3 = new BinaryTree();
        arbolBinario3.insertar(100);

        arbolBinario4 = new BinaryTree();
        arbolBinario4.insertar(4);
        arbolBinario4.insertar(9);
        arbolBinario4.insertar(11);
        arbolBinario4.insertar(3);
        arbolBinario4.insertar(5);
        arbolBinario4.insertar(7);

        arbolBinario5 = new BinaryTree();
        arbolBinario5.insertar(80);
        arbolBinario5.insertar(70);
        arbolBinario5.insertar(75);

        arbolBinarioVacio = new BinaryTree();

        valoresMax = "50 70 80 ";
        valoresMax2 = "80 70 75 ";
    }

    @org.junit.Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @org.junit.Test
    public void buscar() {
        assertTrue(arbolBinario.buscar(arbolBinario.root, 50));
        assertTrue(arbolBinario.buscar(arbolBinario.root, 30));
        assertTrue(arbolBinario.buscar(arbolBinario.root, 20));
        assertTrue(arbolBinario.buscar(arbolBinario.root, 40));
        assertTrue(arbolBinario.buscar(arbolBinario.root, 70));
        assertTrue(arbolBinario.buscar(arbolBinario.root, 60));
        assertTrue(arbolBinario.buscar(arbolBinario.root, 80));
    }

    @org.junit.Test
    public void comprobarArbolLleno(){
        assertTrue(arbolBinario.comprobarArbolLleno(arbolBinario.root));
        assertFalse(arbolBinario1.comprobarArbolLleno(arbolBinario1.root));
        assertTrue(arbolBinario2.comprobarArbolLleno(arbolBinario2.root));
    }

    @org.junit.Test
    public void obtenerNivel(){
        assertEquals(3, arbolBinario.obtenerNivel(arbolBinario.root));
        assertEquals(2, arbolBinario1.obtenerNivel(arbolBinario1.root));
        assertEquals(2, arbolBinario2.obtenerNivel(arbolBinario2.root));
        assertEquals(1, arbolBinario3.obtenerNivel(arbolBinario3.root));
    }

    @org.junit.Test
    public void valorMasGrandeNivel(){
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        arbolBinario.valorMasGrandeNivel(arbolBinario.root);
        assertEquals(valoresMax,out.toString());

        final ByteArrayOutputStream out2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out2));
        arbolBinario.valorMasGrandeNivel(arbolBinario5.root);
        assertEquals(valoresMax2,out2.toString());

    }
}