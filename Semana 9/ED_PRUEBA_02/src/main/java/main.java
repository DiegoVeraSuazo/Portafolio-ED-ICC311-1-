import dateTime.DateItem;
import modelo.TerminalMantencion;
import modelo.Vehiculo;

import java.time.LocalDate;

public class main {

    public static void main(String[] args) {

        TerminalMantencion terminal = new TerminalMantencion();
        preparacion(terminal);
        //terminal.mostrarBuses();
        //terminal.mostrarCamiones();
        //terminal.ordenarBusPorFecha();
        //terminal.ordenarCamionPorFecha();
        //terminal.mostrarBuses();
        //terminal.mostrarCamiones();
        terminal.revisionMantencion();
        terminal.mostrarVehiculosMantenidos();
        System.out.println("Req mantencion-------");
        terminal.mostrarVehiculosRequierenMantencion();

    }

    public static void preparacion(TerminalMantencion terminalMantencion){

        terminalMantencion.agregarBus(new Vehiculo("FN-YH-29","NMK898735", 2,"MERCEDES BENZ", new DateItem("2017-04-21"),110000,4000,new DateItem("2020-07-21"),1,"transporte de pasajeros"));
        terminalMantencion.agregarBus(new Vehiculo("MH-ZP-18","PTG852853", 4,"MERCEDES BENZ", new DateItem("2016-12-21"),85000,18000,new DateItem("2015-12-09"),2,"transporte de encomiendas"));
        terminalMantencion.agregarBus(new Vehiculo("GD-LZ-21","KHJ667261", 2,"MERCEDES BENZ", new DateItem("2019-05-23"),50000,67000,new DateItem("2013-12-19"),2,"transporte de encomiendas"));
        terminalMantencion.agregarBus(new Vehiculo("LM-AS-32","MVB777254", 4,"SCANIA", new DateItem("2019-02-30"),10000,15000,new DateItem("2015-12-09"),2,"transporte de pasajeros"));


        terminalMantencion.agregarBus(new Vehiculo("LM-AS-32","MVB777254", 3,"SCANIA", new DateItem("2019-02-30"),13000,15000,new DateItem("2020-06-09"),2,"transporte de pasajeros"));


        terminalMantencion.agregarCamion(new Vehiculo("HI-OO-99","AAJF44411",2,"VOLVO",new DateItem("2015-03-04"),11000,34000,new DateItem("2013-12-19"),0,"alimentos"));
        terminalMantencion.agregarCamion(new Vehiculo("LM-WW-18","KDJ887441",2,"VOLVO",new DateItem("2018-04-06"),11000,23000,new DateItem("2013-12-19"),0,"alimentos"));
        terminalMantencion.agregarCamion(new Vehiculo("WW-AZ-56","JJJ637344",2,"SCANIA",new DateItem("2019-09-09"),11000,5000,new DateItem("2020-07-19"),0,"alimentos"));
        terminalMantencion.agregarCamion(new Vehiculo("TYD-EF-32","KDD662311",2,"SCANIA",new DateItem("2013-03-01"),11000,200000,new DateItem("2013-12-19"),0,"alimentos"));

    }

}
