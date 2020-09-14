package ed.tarea.s11;

import java.lang.Math;
import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class arbolBinarioTest {

    arbolBinario arbolAgregar;
    arbolBinario arbolBuscar;
    arbolBinario arbolNodoSinHijos;
    arbolBinario arbolNodoConSoloHijo;
    arbolBinario arbolNodoDosHijo;


    @Before
    public void setUp() throws Exception {
        arbolAgregar = new arbolBinario();
        arbolBuscar = new arbolBinario();
        arbolNodoSinHijos = new arbolBinario();
        arbolNodoConSoloHijo = new arbolBinario();
        arbolNodoDosHijo = new arbolBinario();
        arbolBuscar.agregar(50);
        arbolBuscar.agregar(30);
        arbolBuscar.agregar(40);
        arbolBuscar.agregar(20);
        arbolBuscar.agregar(70);
        arbolBuscar.agregar(60);
        arbolBuscar.agregar(80);

        arbolNodoSinHijos.agregar(18);

        arbolNodoConSoloHijo.agregar(10);

        arbolNodoConSoloHijo.agregar(7);
        arbolNodoConSoloHijo.agregar(6);
        arbolNodoConSoloHijo.agregar(9);

        arbolNodoDosHijo.agregar(20);
        arbolNodoDosHijo.agregar(30);
        arbolNodoDosHijo.agregar(10);
    }

    @Test
    public void agregar() {
        Random rng = new Random();
        int numeroAleatorio = rng.nextInt(150);
        Assert.assertFalse(arbolAgregar.buscar(numeroAleatorio));
        arbolAgregar.agregar(numeroAleatorio);
        Assert.assertTrue(arbolAgregar.buscar(numeroAleatorio));
    }

    @Test
    public void buscar() {
        Random rng = new Random();
        int numeroAleatorio = rng.nextInt(150);
        Assert.assertTrue(arbolBuscar.buscar(70));
        Assert.assertTrue(arbolBuscar.buscar(80));
        Assert.assertTrue(arbolBuscar.buscar(30));
        Assert.assertTrue(arbolBuscar.buscar(40));
        Assert.assertTrue(arbolBuscar.buscar(70));
        Assert.assertTrue(arbolBuscar.buscar(20));
        Assert.assertTrue(arbolBuscar.buscar(60));
        Assert.assertFalse(arbolBuscar.buscar(numeroAleatorio));

    }

    @Test
    public void eliminarNodo() {
        Assert.assertTrue(arbolNodoConSoloHijo.buscar(7));
        Assert.assertTrue(arbolNodoConSoloHijo.buscar(9));
        arbolNodoConSoloHijo.eliminar(9);
        Assert.assertFalse(arbolNodoConSoloHijo.buscar(9));
        Assert.assertTrue(arbolNodoConSoloHijo.buscar(7));

    }

    @Test
    public void eliminarArbolNodoSinHijos() {
        Assert.assertTrue(arbolNodoSinHijos.buscar(18));
        arbolNodoSinHijos.eliminar(18);
        Assert.assertTrue(arbolNodoSinHijos.buscar(18));

    }

    @Test
    public void eliminarArbolNodoConSoloHijo() {
        Assert.assertTrue(arbolNodoConSoloHijo.buscar(7));
        Assert.assertTrue(arbolNodoConSoloHijo.buscar(6));
        Assert.assertTrue(arbolNodoConSoloHijo.buscar(9));
        arbolNodoConSoloHijo.eliminar(7);
        Assert.assertTrue(arbolNodoConSoloHijo.buscar(9));
        Assert.assertTrue(arbolNodoConSoloHijo.buscar(6));
        Assert.assertFalse(arbolNodoConSoloHijo.buscar(7));

    }

    @Test
    public void eliminarArbolNodoDosHijo() {
        Assert.assertTrue(arbolNodoDosHijo.buscar(20));
        Assert.assertTrue(arbolNodoDosHijo.buscar(30));
        Assert.assertTrue(arbolNodoDosHijo.buscar(10));
        arbolNodoDosHijo.eliminar(20);
        Assert.assertTrue(arbolNodoDosHijo.buscar(30));
        Assert.assertTrue(arbolNodoDosHijo.buscar(10));
        Assert.assertFalse(arbolNodoDosHijo.buscar(20));

    }
}