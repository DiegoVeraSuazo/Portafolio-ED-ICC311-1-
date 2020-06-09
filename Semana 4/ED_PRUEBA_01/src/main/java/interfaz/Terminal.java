package interfaz;

import gestionEstablecimiento.Establecimiento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Terminal {

    Establecimiento establecimiento = new Establecimiento();

    /**
     * Metodo que permite escoger entre diferentes opciones.
     */
    public void menu() {
        establecimiento.inicializarEstablecimiento();
        boolean ejec = true;
        System.out.println("Bienvenido al terminal, ¿Que desea hacer?");
        do {
            System.out.println("Selecciona la operacion a realizar");
            System.out.println("1 - Ingresar Estudiantes");
            System.out.println("2 - Mostrar estudiantes");
            System.out.println("3 - Registrar Profesores");
            System.out.println("4 - Mostrar Profesores");
            System.out.println("5 - Registrar Personal");
            System.out.println("6 - Mostrar personal");
            System.out.println("9 - Terminar");
            int opcion = validarNumero();
            if (opcion >= 1 && opcion <= 6 ) {
                seleccion(opcion, ejec, establecimiento);
            } else if (opcion == 9) {
                ejec = false;
            } else {
                System.out.println("Opcion no valida");
            }
        } while (ejec);

    }

    /**
     * Metodo que al ingresar una opcion realiza cierta accion que es indicada en el metodo Menu
     */
    private void seleccion(int opcion, boolean ejec, Establecimiento r) {
        switch (opcion){
            case 1:
                r.ingresoEstudiantes();
                break;
            case 2:
                r.mostrarEstudiantes(establecimiento.getEstudiantes(), establecimiento.getEstudiantesEspera());
                break;
            case 3:
                r.registrarProfes();
                break;
            case 4:
                r.mostrarProfes(establecimiento.getProfesores(), establecimiento.getProfesoresEspera());
                break;
            case 5:
                r.registrarPersonal();
                break;
            case 6:
                r.mostrarPersonal(establecimiento.getPersonales());
                break;
            default:
                break;
        }
    }

    /**
     * Metodo que valida los numeros ingresados de letra y/o caracteres,
     * ademas de impedir el ingreso de negativos.
     * @return Retorna una Variable de tipo int.
     */
    public static int validarNumero() {
        Scanner teclado = new Scanner(System.in);
        int entrada = 0;
        Boolean valido;
        do {
            try {
                entrada = teclado.nextInt();
                if (entrada >= 0){
                    valido = false;
                } else {
                    System.out.println("Ingreso de negativo, Invalido");
                    valido = true;
                }
            } catch (InputMismatchException ime) {
                System.out.println("No ingrese letras u oraciones");
                teclado.next();
                valido = true;
            }
        } while (valido);
        return entrada;
    }

}
