package ejemplo2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

import static org.junit.Assert.*;

public class ArbolBinarioTest {


    ArbolBinario arbolAgregar;
    ArbolBinario arbolBuscar;
    String datoBuscar;
    String datoAgregar;

    @Before
    public void setUp() throws Exception {
        arbolAgregar = new ArbolBinario();
        arbolBuscar = new ArbolBinario();
        arbolBuscar.agregar(50,"Palabra 1");
        arbolBuscar.agregar(30,"Palabra 2");
        arbolBuscar.agregar(40,"Palabra 3");
        arbolBuscar.agregar(20,"Palabra 4");
        arbolBuscar.agregar(70,"Palabra 5");
        arbolBuscar.agregar(60,"Palabra 6");
        arbolBuscar.agregar(80,"Palabra 7");

        datoBuscar = "Nodo{valor=70, dato='Palabra 5'}\r\n";
    }

    @Test
    public void agregar() {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Random rng = new Random();
        int numeroAleatorio = rng.nextInt(150);
        datoAgregar = "Nodo{valor="+numeroAleatorio+", dato='Dato de prueba'}\r\n";
        Assert.assertFalse(arbolAgregar.buscar(numeroAleatorio));
        arbolAgregar.agregar(numeroAleatorio, "Dato de prueba");
        Assert.assertTrue(arbolAgregar.buscar(numeroAleatorio));
        assertEquals(datoAgregar,out.toString());

    }

    @Test
    public void buscar() {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Random rng = new Random();
        int numeroAleatorio = rng.nextInt(150);
        if (numeroAleatorio != 70) {
            Assert.assertTrue(arbolBuscar.buscar(70));
            assertEquals(datoBuscar, out.toString());
            Assert.assertFalse(arbolBuscar.buscar(numeroAleatorio));
        } else {
            buscar();
        }
    }

}