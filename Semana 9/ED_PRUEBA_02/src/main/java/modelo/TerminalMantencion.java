package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TerminalMantencion {

    private LinkedList<Vehiculo> camionVehiculo;
    private LinkedList<Vehiculo> busVehiculo;
    private LinkedList<Vehiculo> busesMantencionAlDia;
    private LinkedList<Vehiculo> camionesMantencionAlDia;
    private LinkedList<Vehiculo> busesRequierenMantencion;
    private LinkedList<Vehiculo> camionesRequierenMantencion;

    public TerminalMantencion(){
        this.camionVehiculo = new LinkedList<Vehiculo>();
        this.busVehiculo = new LinkedList<Vehiculo>();
        this.busesMantencionAlDia = new LinkedList<Vehiculo>();
        this.camionesMantencionAlDia = new LinkedList<Vehiculo>();
        this.busesRequierenMantencion = new LinkedList<Vehiculo>();
        this.camionesRequierenMantencion = new LinkedList<Vehiculo>();
    }

    public boolean agregarCamion(Vehiculo camion){
        return camionVehiculo.add(camion);
    }

    public boolean agregarBus(Vehiculo busVeh){
        return busVehiculo.add(busVeh);
    }

    public void mostrar(){
        Iterator<Vehiculo> iteratorBus= busVehiculo.iterator();
        System.out.println("============Buses============");
        while (iteratorBus.hasNext()){
            System.out.println(iteratorBus.next().toString());
        }
        System.out.println("============Camiones============");
        Iterator<Vehiculo> iteratorCamion= camionVehiculo.iterator();
        while (iteratorCamion.hasNext()){
            System.out.println(iteratorCamion.next().toString());
        }
    }

    public LinkedList<Vehiculo> ordenarBusPorFecha(){
        if (busVehiculo.isEmpty()){
            throw new NullPointerException("No hay buses");
        } else {
            Collections.sort(this.busVehiculo, new Comparator<Vehiculo>() {
                @Override
                public int compare(Vehiculo o1, Vehiculo o2) {
                    return o2.getFechaUltimaMantencion().datetime.compareTo(o1.getFechaUltimaMantencion().datetime);
                }
            });
            return busVehiculo;
        }
    }

    public LinkedList<Vehiculo> ordenarCamionPorFecha(){
        if (camionVehiculo.isEmpty()){
            throw new NullPointerException("No hay camiones");
        } else {
            Collections.sort(this.camionVehiculo, new Comparator<Vehiculo>() {
                @Override
                public int compare(Vehiculo o1, Vehiculo o2) {
                    return o2.getFechaUltimaMantencion().datetime.compareTo(o1.getFechaUltimaMantencion().datetime);
                }
            });
            return camionVehiculo;
        }
    }

    public void revisionMantencion(){
        ordenarCamionPorFecha();
        ordenarBusPorFecha();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.US );
        LocalDate currentDate = LocalDate.now();
        Iterator<Vehiculo> iteratorBus= busVehiculo.iterator();
        int aux = 0;
        while (iteratorBus.hasNext()){
            LocalDate date = LocalDate.parse(busVehiculo.get(aux).getFechaUltimaMantencion().datetime);
            Period periodo = Period.between(currentDate,date);
            System.out.println("Bus");
            System.out.println(periodo.getMonths());
            if (iteratorBus.next().getKmActual()<15000 && periodo.getMonths() > -6){
                busesMantencionAlDia.add(busVehiculo.get(aux));
            } else {
                busesRequierenMantencion.add(busVehiculo.get(aux));
            }
            aux++;
        }
        aux = 0;
        Iterator<Vehiculo> iteratorCamion = camionVehiculo.iterator();
        while (iteratorCamion.hasNext()){
            LocalDate date = LocalDate.parse(camionVehiculo.get(aux).getFechaUltimaMantencion().datetime, formatter);
            Period periodo = Period.between(currentDate,date);
            System.out.println(periodo.getMonths());
            if (iteratorCamion.next().getKmActual()<15000 && periodo.getMonths() > -6){
                camionesMantencionAlDia.add(camionVehiculo.get(aux));
            } else {
                camionesRequierenMantencion.add(camionVehiculo.get(aux));
            }
            aux++;
        }

    }

    public void mostrarVehiculosMantenidos(){
        Iterator<Vehiculo> iteratorBuses= busesMantencionAlDia.iterator();
        System.out.println("============BusesMantenidos============");
        while (iteratorBuses.hasNext()){
            System.out.println(iteratorBuses.next().toString());
        }
        Iterator<Vehiculo> iteratorCamiones= camionesMantencionAlDia.iterator();
        System.out.println("============CamionesMantenidos============");
        while (iteratorCamiones.hasNext()){
            System.out.println(iteratorCamiones.next().toString());
        }
    }

    public void mostrarVehiculosRequierenMantencion(){
        Iterator<Vehiculo> iteratorBuses= busesRequierenMantencion.iterator();
        System.out.println("============BusesReqMantencion============");
        while (iteratorBuses.hasNext()){
            System.out.println(iteratorBuses.next().toString());
        }
        Iterator<Vehiculo> iteratorCamiones= camionesRequierenMantencion.iterator();
        System.out.println("============CamionesReqMantencion============");
        while (iteratorCamiones.hasNext()){
            System.out.println(iteratorCamiones.next().toString());
        }
    }
}
