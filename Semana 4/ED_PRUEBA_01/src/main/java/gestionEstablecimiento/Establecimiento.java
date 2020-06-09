package gestionEstablecimiento;

import java.util.*;

public class Establecimiento {

    private List<Estudiante> estudiantes;
    private List<Estudiante> estudiantesEspera;
    private List<Profesor> profesores;
    private List<Profesor> profesoresEspera;
    private List<Personal> personales;

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public List<Estudiante> getEstudiantesEspera() {
        return estudiantesEspera;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public List<Profesor> getProfesoresEspera() {
        return profesoresEspera;
    }

    public List<Personal> getPersonales() {
        return personales;
    }

    public Establecimiento() {
        this.estudiantes = new LinkedList();
        this.estudiantesEspera = new LinkedList();
        this.profesores = new LinkedList();
        this.profesoresEspera = new LinkedList();
        this.personales = new LinkedList();

    }

    /**
     * Metodo ingresa en la List estudiantes a nuevos integrantes, separando entre los que estan dentro del cupo y no
     */
    public void ingresoEstudiantes() {
        Scanner input = new Scanner(System.in);
        if (estudiantes.size() < 5) {
            System.out.println("Ingrese los datos del estudiante");
            System.out.println("Nombre:");
            String nombre = input.nextLine();
            System.out.println("Direccion");
            String direccion = input.nextLine();
            System.out.println("Run");
            String run = input.nextLine();
            System.out.println("Fecha Ingreso");
            String fecha = input.nextLine();
            System.out.println("Promedio Actual");
            double prom = validarDouble();
            this.estudiantes.add(new Estudiante(nombre,direccion,run,fecha,prom));
        } else {
            System.out.println("No hay cupos disponibles, inscribiendo en lista de espera");
            registroEstudiantesEspera();
        }
    }

    /**
     * Metodo que ingresa a los estudiantes fuera del cupo definido
     */
    public void registroEstudiantesEspera() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los datos del estudiante");
        System.out.println("Nombre:");
        String nombre = input.nextLine();
        System.out.println("Direccion");
        String direccion = input.nextLine();
        System.out.println("Run");
        String run = input.nextLine();
        System.out.println("Fecha Ingreso");
        String fecha = input.nextLine();
        System.out.println("Promedio Actual");
        double prom = validarDouble();
        this.estudiantesEspera.add(new Estudiante(nombre,direccion,run,fecha,prom));
    }

    /**
     * Metodo que ordena de menor a mayor promedio los estudiantes que se encuentran en las listas estudiantes
     * y estudiantesEspera
     */
    public void ordenarEstudiantes(){
        Comparator<Estudiante> comparator
                = Comparator
                .comparing(Estudiante::getPromedio)
                .thenComparingDouble(Estudiante::getPromedio);
        Collections.sort(estudiantes, comparator);
        Collections.sort(estudiantesEspera, comparator);
    }

    /**
     * Metodo que muestra los estudiantes ingresados y en espera dentro del establecimiento
     * @param  estudiantes Una Variable de tipo List<Estudiante> que contiene los datos de los estudiantes ingresados.
     * @param  estudiantesEspera Una Variable de tipo List<Estudiante> que contiene los datos de los estudiantes en lista de espera.
     */
    public void mostrarEstudiantes(List<Estudiante> estudiantes, List<Estudiante> estudiantesEspera) {
        if (estudiantes == null) {
            throw new NullPointerException();
        }
        ordenarEstudiantes();
        if (estudiantes.size() != 0){
            System.out.println("Estudiantes ingresados en el sistema:");
            Iterator<Estudiante> estudiantesActuales = estudiantes.iterator();
            while (estudiantesActuales.hasNext()) {
                System.out.println(estudiantesActuales.next().nombrarEstudiante());
            }
            if (estudiantesEspera == null) {
                throw new NullPointerException();
            }
            if (estudiantesEspera.size() != 0) {
                System.out.println("==========================================================================");
                System.out.println("Estudiantes en Lista de espera:");
                Iterator<Estudiante> estudiantesEnCola = estudiantesEspera.iterator();
                while (estudiantesEnCola.hasNext()) {
                    System.out.println(estudiantesEnCola.next().nombrarEstudiante());
                }
            } else {
                System.out.println("No hay estudiantes en espera");
            }
        } else {
            System.out.println("No hay estudiantes inscritos");
        }
    }

    /**
     * Metodo que ingresa a profesores del establecimiento y separa
     * a los que se encuentran en la lista de espera.
     */
    public void registrarProfes() {
        Scanner input = new Scanner(System.in);
        if (profesores.size() <= 2) {
            System.out.println("Ingrese los datos del Profesor");
            System.out.println("Nombre:");
            String nombre = input.nextLine();
            System.out.println("Ingrese especialidad");
            String especialidad = input.nextLine();
            System.out.println("Ingrese años de experiencia");
            int anos = (int)validarDouble();
            this.profesores.add(new Profesor(nombre, especialidad, anos));
        } else {
            System.out.println("No hay cupos disponibles, inscribiendo en lista de espera");
            registroProfesoresEspera();
        }

    }

    /**
     * Metodo que ingresa a los profesores en una lista de espera
     */
    private void registroProfesoresEspera() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los datos del Profesor");
        System.out.println("Nombre:");
        String nombre = input.nextLine();
        System.out.println("Ingrese especialidad");
        String especialidad = input.nextLine();
        System.out.println("Ingrese años de experiencia");
        int anos = (int)validarDouble();
        this.profesoresEspera.add(new Profesor(nombre, especialidad, anos));
    }

    /**
     * Metodo que muestra tanto a los profesores inscritos en el establecimiento,
     * como a los que se encuentran en lista de espera
     * @param  profesores Variable de tipo List<Estudiante> que guarda los datos de los profesores.
     * @param  profesoresEspera Variable de tipo List<Estudiante> que guarda los datos de profesores en lista de espera.
     */
    public void mostrarProfes(List<Profesor> profesores, List<Profesor> profesoresEspera) {
        if (profesores == null) {
            throw new NullPointerException();
        }
        if (profesores.size() != 0){
            System.out.println("Profesores ingresados en el sistema:");
            Iterator<Profesor> profesInscritos = profesores.iterator();
            while (profesInscritos.hasNext()){
                System.out.println(profesInscritos.next().nombrarProfes());
            }
            if (profesores == null) {
                throw new NullPointerException();
            }
            if (profesoresEspera.size() != 0) {
                System.out.println("==========================================================================");
                System.out.println("Profesores en Lista de espera:");
                Iterator<Profesor> profesoresEnEspera = profesoresEspera.iterator();
                while (profesoresEnEspera.hasNext()){
                    System.out.println(profesoresEnEspera.next().nombrarProfes());
                }
            } else {
                System.out.println("No hay Profesores en espera");
            }
        } else {
            System.out.println("No hay Profesores inscritos");
        }
    }

    /**
     * Metodo que registra nuevo personal en el establecimiento
     */
    public void registrarPersonal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los datos del Personal");
        System.out.println("Nombre:");
        String nombre = input.nextLine();
        System.out.println("Ingrese profesion:");
        String profesion = input.nextLine();
        this.personales.add(new Personal(nombre, profesion));
    }

    /**
     * Metodo que muestra el personal presente en el establecimiento
     */
    public void mostrarPersonal(List<Personal> personales) {
        if (personales == null) {
            throw new NullPointerException();
        }
        if (personales.size() != 0) {
            Iterator<Personal> personalIterator = personales.iterator();
            while (personalIterator.hasNext()) {
                System.out.println(personalIterator.next().nombrarPersonal());
            }
        } else {
            System.out.println("No hay personal Incrito");
        }
    }

    /**
     * Metodo que inicializa tanto estudiantes como profesores y personal cuando se inicia
     * el programa
     */
    public void inicializarEstablecimiento() {
        this.estudiantes.add(new Estudiante("Diego Soto","Estaniaslo Soto","200806012","27/04/05",6.1));
        this.estudiantes.add(new Estudiante("Eduardo Perez","Manuel Guerrero","152006781","23/05/04",6.8));
        this.estudiantes.add(new Estudiante("Pedro Aguilera","Barros Arana","176894558","21/02/06",5.7));
        this.estudiantes.add(new Estudiante("Andres Suazo","Andres Bello","198998390","31/02/03",6.9));
        this.estudiantes.add(new Estudiante("Alejandro Villagra","Manuel Montt","189207430","15/02/04",4.9));
        this.profesores.add(new Profesor("Maria Eugenia","Matematica" ,4 ));
        this.profesores.add(new Profesor("Samuel Medina","Software" ,5 ));
        this.profesores.add(new Profesor("Juan Aedo","Fisica" ,3 ));
        this.personales.add(new Personal("Juanito de la Montana","Rector" ));
        this.personales.add(new Personal("Cristobal Mendez","Conserje" ));
        this.personales.add(new Personal("Christina Vega","Secretaria" ));

    }

    /**
     * Metodo que valida los valores ingresados dejando que estos sean doubles,
     * y que ademas no permite el ingreso de negativos o letras.
     * @return entrada que es una Variable de tipo double.
     */
    public static double validarDouble() {
        Scanner teclado = new Scanner(System.in);
        double entrada = 0;
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
