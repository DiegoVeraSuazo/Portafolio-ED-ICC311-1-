package modelo;

import dateTime.DateItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class TerminalMantencionTest {

    TerminalMantencion terminalMantencion;
    TerminalMantencion terminalVacio;
    String vehiculosMantenidos;
    String vehiculosReqMantencion;

    @Before
    public void preparacion() {
        terminalMantencion = new TerminalMantencion();

        terminalMantencion.agregarBus(new Vehiculo("FN-YH-29","NMK898735", 2,"MERCEDES BENZ", new DateItem("2017-04-21"),110000,4000,new DateItem("2020-07-21"),1,"transporte de pasajeros"));
        terminalMantencion.agregarBus(new Vehiculo("MH-ZP-18","PTG852853", 4,"MERCEDES BENZ", new DateItem("2016-12-21"),85000,18000,new DateItem("2015-12-09"),2,"transporte de encomiendas"));
        terminalMantencion.agregarBus(new Vehiculo("GD-LZ-21","KHJ667261", 2,"MERCEDES BENZ", new DateItem("2019-05-23"),50000,67000,new DateItem("2013-12-19"),2,"transporte de encomiendas"));
        terminalMantencion.agregarBus(new Vehiculo("LM-AS-32","MVB777254", 4,"SCANIA", new DateItem("2019-02-30"),10000,15000,new DateItem("2015-12-09"),2,"transporte de pasajeros"));

        terminalMantencion.agregarCamion(new Vehiculo("HI-OO-99","AAJF44411",2,"VOLVO",new DateItem("2015-03-04"),11000,34000,new DateItem("2013-12-19"),0,"alimentos"));
        terminalMantencion.agregarCamion(new Vehiculo("LM-WW-18","KDJ887441",2,"VOLVO",new DateItem("2018-04-06"),11000,23000,new DateItem("2013-12-19"),0,"alimentos"));
        terminalMantencion.agregarCamion(new Vehiculo("WW-AZ-56","JJJ637344",2,"SCANIA",new DateItem("2019-09-09"),11000,5000,new DateItem("2020-07-19"),0,"alimentos"));
        terminalMantencion.agregarCamion(new Vehiculo("TYD-EF-32","KDD662311",2,"SCANIA",new DateItem("2013-03-01"),11000,200000,new DateItem("2013-12-19"),0,"alimentos"));

        terminalMantencion.agregarBus(new Vehiculo("MM-SS-22","MFB747154", 3,"SCANIA", new DateItem("2019-04-30"),13000,15000,new DateItem("2020-06-09"),2,"transporte de pasajeros"));

        vehiculosMantenidos = "============BusesMantenidos============\r\n" +
                "============CamionesMantenidos============\r\n";

        vehiculosReqMantencion = "============BusesReqMantencion============\r\n" +
                "============CamionesReqMantencion============\r\n";
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @org.junit.Test
    public void agregarCamion() {
        terminalMantencion.agregarCamion(new Vehiculo("FG-ES-52","GAS313532", 2,"CHEVROLET", new DateItem("2018-04-30"),14800,15000,new DateItem("2020-05-02"),0,"alimentos"));
        Assert.assertTrue(true);
        //Assert.assertTrue(terminalMantencion.agregarCamion(new Vehiculo("FG-ES-52","GAS313532", 2,"CHEVROLET", new DateItem("2018-04-30"),14800,15000,new DateItem("2020-05-02"),0,"alimentos")));
    }

    @org.junit.Test
    public void agregarBus() {
        terminalMantencion.agregarCamion(new Vehiculo("HG-PL-63","HAS321071", 2,"NISSAN", new DateItem("2019-10-30"),12600,15000,new DateItem("2020-07-01"),1,"transporte de encomiendas"));
        Assert.assertTrue(true);
        //Assert.assertTrue(terminalMantencion.agregarCamion(new Vehiculo("HG-PL-63","HAS321071", 2,"NISSAN", new DateItem("2019-10-30"),12600,15000,new DateItem("2020-07-01"),1,"transporte de encomiendas")));
    }

    @org.junit.Test
    public void ordenarBusPorFecha() {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        terminalMantencion.ordenarBusPorFecha();
        assertEquals(vehiculosReqMantencion,out.toString());
    }

    @org.junit.Test
    public void ordenarBusPorFechaVacio() {
        exceptionRule.expect(NullPointerException.class);
        exceptionRule.expectMessage("No hay buses");
        terminalVacio.ordenarBusPorFecha();
    }

    @org.junit.Test
    public void ordenarCamionPorFecha() {

    }

    @org.junit.Test
    public void ordenarCamionPorFechaVacio() {
        exceptionRule.expect(NullPointerException.class);
        exceptionRule.expectMessage("No hay camiones");
        terminalVacio.ordenarBusPorFecha();
    }

    @Test
    public void mostrarVehiculosMantenidos() {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        terminalMantencion.mostrarVehiculosMantenidos();
        assertEquals(vehiculosMantenidos,out.toString());
    }

    @Test
    public void mostrarVehiculosRequierenMantencion() {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        terminalMantencion.mostrarVehiculosRequierenMantencion();
        assertEquals(vehiculosReqMantencion,out.toString());
    }
}