package bst;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class BSTTest {

    BST arbolAgregar;
    BST arbolEliminar;

    @Before
    public void setUp() throws Exception {
        arbolAgregar = new BST();
        arbolEliminar = new BST();

        arbolEliminar.root = arbolEliminar.insertar(arbolEliminar.root,50);
        arbolEliminar.insertar(arbolEliminar.root,30);
        arbolEliminar.insertar(arbolEliminar.root,40);
        arbolEliminar.insertar(arbolEliminar.root,20);
        arbolEliminar.insertar(arbolEliminar.root,70);
        arbolEliminar.insertar(arbolEliminar.root,60);
        arbolEliminar.insertar(arbolEliminar.root,80);
        arbolEliminar.insertar(arbolEliminar.root,100);
        arbolEliminar.insertar(arbolEliminar.root,10);
        arbolEliminar.insertar(arbolEliminar.root,25);


    }

    @Test
    public void eliminar() {
        Assert.assertTrue(arbolEliminar.buscar(arbolEliminar.root,20));
        Assert.assertTrue(arbolEliminar.buscar(arbolEliminar.root,30));
        Assert.assertTrue(arbolEliminar.buscar(arbolEliminar.root,50));
        arbolEliminar.eliminar(arbolEliminar.root,20);
        arbolEliminar.eliminar(arbolEliminar.root,30);
        arbolEliminar.eliminar(arbolEliminar.root,50);
        Assert.assertFalse(arbolEliminar.buscar(arbolEliminar.root,20));
        Assert.assertFalse(arbolEliminar.buscar(arbolEliminar.root,30));
        Assert.assertFalse(arbolEliminar.buscar(arbolEliminar.root,50));

    }

    @Test
    public void insertar() {
        arbolAgregar = new BST();
        Random rng = new Random();
        int numeroAleatorio = rng.nextInt(150);
        Assert.assertFalse(arbolAgregar.buscar(arbolAgregar.root, numeroAleatorio));
        arbolAgregar.root = arbolAgregar.insertar(arbolAgregar.root, numeroAleatorio);
        Assert.assertTrue(arbolAgregar.buscar(arbolAgregar.root, numeroAleatorio));

        arbolAgregar.insertar(arbolAgregar.root,200);
        arbolAgregar.insertar(arbolAgregar.root,500);
        arbolAgregar.insertar(arbolAgregar.root,300);

        Assert.assertTrue(arbolAgregar.buscar(arbolAgregar.root, 200));
        Assert.assertTrue(arbolAgregar.buscar(arbolAgregar.root, 500));
        Assert.assertTrue(arbolAgregar.buscar(arbolAgregar.root, 300));

    }
}