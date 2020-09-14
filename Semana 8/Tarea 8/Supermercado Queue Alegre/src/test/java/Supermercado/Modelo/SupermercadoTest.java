package Supermercado.Modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SupermercadoTest {

    Supermercado supermercado;
    Supermercado supermercadoVacio;
    String productosOrdenados;
    String empleadosTurno;

    @Before
    public void preparacion() {
        supermercado = new Supermercado();
        supermercadoVacio = new Supermercado();
        supermercado.agregarEmpleado(new Empleado("Teresa","12.002.123-K",Ocupacion.CAJERO,5,321000));
        supermercado.agregarEmpleado(new Empleado("Magaly","10.607.890.2",Ocupacion.CAJERO,5,321000));
        supermercado.agregarEmpleado(new Empleado("Henry Dículo","13.820.234-5",Ocupacion.CAJERO,4,311000));
        supermercado.agregarEmpleado(new Empleado("Pedro","17.003.432-6",Ocupacion.PANADERO,3,301000));
        supermercado.agregarEmpleado(new Empleado("Nachito","18.231.435-8",Ocupacion.PANADERO,3,3010000));
        supermercado.agregarEmpleado(new Empleado("Elvio Lento","16.002.123-3",Ocupacion.GUARDIA,7,341000));
        supermercado.agregarEmpleado(new Empleado("Elvis Tk","19.231.124-5",Ocupacion.CARNICERO,7,341000));
        supermercado.agregarEmpleado(new Empleado("Graciela","17.213.512-9",Ocupacion.BODEGERO,3,301000));
        supermercado.agregarEmpleado(new Empleado("Jean","20.123.412-1",Ocupacion.BODEGERO,3,301000));
        supermercado.agregarEmpleado(new Empleado("Cesar","14.123.342-2",Ocupacion.FIAMBRES,7,341000));
        supermercado.agregarEmpleado(new Empleado("Lucio","30.121.141-1",Ocupacion.REPONEDOR,7,341000));
        supermercado.agregarProducto(new Producto("Arroz",TipoProducto.DESPENSA,2100,1));
        supermercado.agregarProducto(new Producto("Pan Marraqueta 1 kg",TipoProducto.PANADERIA,800,2));
        supermercado.agregarProducto(new Producto("Maiz",TipoProducto.CONGELADOS,2000,3));
        supermercado.agregarProducto(new Producto("Sprite 1 Lt",TipoProducto.BEBESTIBLES,1200,4));
        supermercado.agregarProducto(new Producto("Helado Piña",TipoProducto.HELADOS,2000,5));
        supermercado.agregarProducto(new Producto("Leche 1 Lt",TipoProducto.LACTEOS,1100,6));
        supermercado.agregarProducto(new Producto("Chips Pop",TipoProducto.SNACKS,1000,7));
        productosOrdenados = "Productos: \r\n" +
                "Producto{nombre= Pan Marraqueta 1 kg, tipoProducto= PANADERIA, precio= 800.0, id= 2}\r\n" +
                "Producto{nombre= Chips Pop, tipoProducto= SNACKS, precio= 1000.0, id= 7}\r\n" +
                "Producto{nombre= Leche 1 Lt, tipoProducto= LACTEOS, precio= 1100.0, id= 6}\r\n" +
                "Producto{nombre= Sprite 1 Lt, tipoProducto= BEBESTIBLES, precio= 1200.0, id= 4}\r\n" +
                "Producto{nombre= Maiz, tipoProducto= CONGELADOS, precio= 2000.0, id= 3}\r\n" +
                "Producto{nombre= Helado Piña, tipoProducto= HELADOS, precio= 2000.0, id= 5}\r\n" +
                "Producto{nombre= Arroz, tipoProducto= DESPENSA, precio= 2100.0, id= 1}\r\n";
        empleadosTurno = "Empleados: \r\n" +
                "Empleado{nombre= Magaly, rut= 10.607.890.2, ocupacion= CAJERO, horasTurno= 5, sueldo= 321000.0}\r\n" +
                "Empleado{nombre= Henry Dículo, rut= 13.820.234-5, ocupacion= CAJERO, horasTurno= 4, sueldo= 311000.0}\r\n" +
                "Empleado{nombre= Pedro, rut= 17.003.432-6, ocupacion= PANADERO, horasTurno= 3, sueldo= 301000.0}\r\n" +
                "Empleado{nombre= Nachito, rut= 18.231.435-8, ocupacion= PANADERO, horasTurno= 3, sueldo= 3010000.0}\r\n" +
                "Empleado{nombre= Elvio Lento, rut= 16.002.123-3, ocupacion= GUARDIA, horasTurno= 7, sueldo= 341000.0}\r\n" +
                "Empleado{nombre= Elvis Tk, rut= 19.231.124-5, ocupacion= CARNICERO, horasTurno= 7, sueldo= 341000.0}\r\n" +
                "Empleado{nombre= Graciela, rut= 17.213.512-9, ocupacion= BODEGERO, horasTurno= 3, sueldo= 301000.0}\r\n" +
                "Empleado{nombre= Jean, rut= 20.123.412-1, ocupacion= BODEGERO, horasTurno= 3, sueldo= 301000.0}\r\n" +
                "Empleado{nombre= Cesar, rut= 14.123.342-2, ocupacion= FIAMBRES, horasTurno= 7, sueldo= 341000.0}\r\n" +
                "Empleado{nombre= Lucio, rut= 30.121.141-1, ocupacion= REPONEDOR, horasTurno= 7, sueldo= 341000.0}\r\n";
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void agregarEmpleado(){
        Assert.assertTrue( supermercado.agregarEmpleado(new Empleado("Diego Vera","1.000.000-k",Ocupacion.CARNICERO,8,1000000)));
    }

    @Test
    public void agregarProducto(){
        supermercado.agregarProducto(new Producto("Pollo 1 kg",TipoProducto.CONGELADOS,1690,9));
        Assert.assertTrue(true);
    }

    @Test
    public void ordenarPrecioProducto() {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        supermercado.ordenarPrecioProducto();
        assertEquals(productosOrdenados,out.toString());
    }

    @Test
    public void ordenarPrecioProductoVacio(){
        exceptionRule.expect(NullPointerException.class);
        exceptionRule.expectMessage("No se encuentran Productos");
        supermercadoVacio.ordenarPrecioProducto();
    }

    @Test
    public void buscarProducto() {
        Producto producto = new Producto("Arroz",TipoProducto.DESPENSA,2100,1);
        supermercado.buscarProducto(producto);
        Assert.assertTrue(true);
    }

    @Test
    public void buscarProductoSupermercadoVacio(){
        Producto producto = new Producto("Carne Vacuno",TipoProducto.CONGELADOS,5100,1);
        exceptionRule.expect(NullPointerException.class);
        exceptionRule.expectMessage("No se encuentran Productos");
        supermercadoVacio.buscarProducto(producto);
    }

    @Test
    public void registroEntradaEmpleado() {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        supermercado.registroEntradaEmpleado();
        assertEquals(empleadosTurno,out.toString());
    }

    @Test
    public void registroEntradaEmpleadoVacio(){
        exceptionRule.expect(NullPointerException.class);
        exceptionRule.expectMessage("No se encuentran Empleados");
        supermercadoVacio.registroEntradaEmpleado();
    }

}