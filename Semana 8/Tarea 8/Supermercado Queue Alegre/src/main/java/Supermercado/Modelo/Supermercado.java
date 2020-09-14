package Supermercado.Modelo;

import java.util.*;

public class Supermercado implements Operaciones{

    private Queue<Empleado> empleados;
    private Stack<Producto> productos;

    public Supermercado() {
        this.empleados = new LinkedList<Empleado>();
        this.productos = new Stack<Producto>();
    }

    public Queue<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Queue<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Stack<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Stack<Producto> productos) {
        this.productos = productos;
    }

    public boolean agregarEmpleado(Empleado empleado){
        return empleados.add(empleado);
    }

    public Producto agregarProducto(Producto producto){
        return productos.push(producto);
    }

    public void ordenarPrecioProducto(){
        if(productos.empty()){
            throw new NullPointerException("No se encuentran Productos");
        } else {
            Comparator<Producto> comparator = Comparator.comparing(Producto::getPrecio).thenComparingDouble(Producto::getPrecio);
            productos.sort(comparator);
            System.out.println("Productos: ");
            Iterator<Producto> iterator = productos.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next().toString());
            }
        }
    }

    public boolean buscarProducto(Producto producto){
        if (productos.empty()){
            throw new NullPointerException("No se encuentran Productos");
        } else return productos.contains(producto);
    }

    public void registroEntradaEmpleado(){
        if(empleados.isEmpty()){
            throw new NullPointerException("No se encuentran Empleados");
        } else {
            empleados.poll();
            System.out.println("Empleados: ");
            Iterator<Empleado> iterator = empleados.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next().toString());
            }
        }
    }

    @Override
    public void mostrar() {
        System.out.println("Productos: ");
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("==========================================================");
        System.out.println("Empleados: ");
        Iterator<Empleado> iterator1 = empleados.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next().toString());
        }
    }
}
