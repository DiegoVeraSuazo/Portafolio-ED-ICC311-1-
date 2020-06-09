package gestionEstablecimiento;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class EstablecimientoTest {

    private Establecimiento establecimiento;
    private List<Estudiante> estudiantesTest;
    private List<Estudiante> estudiantesVacioTest;
    private List<Estudiante> estudiantesEsperaTest;
    private List<Profesor> profesoresTest;
    private List<Profesor> profesoresVacioTest;
    private List<Profesor> profesoresEsperaTest;
    private List<Personal> personalesTest;
    private List<Personal> personalesVacioTest;
    String mensajeMostrarEstudianteTest;
    String mensajeMostrarEstudianteVacioTest;
    String mensajeEsperadoProfes;

    String mensajeEsperadoVacioProfes;
    String mensajeEsperadoPersonal;
    String mensajeEsperadoVacioPersonal;

    @Before
    public void prepare(){
        establecimiento = new Establecimiento();
        estudiantesTest = new LinkedList();
        estudiantesEsperaTest = new LinkedList();
        profesoresTest = new LinkedList();
        profesoresEsperaTest = new LinkedList();
        personalesTest = new LinkedList();

        estudiantesVacioTest = new LinkedList();
        profesoresVacioTest = new LinkedList();
        personalesVacioTest = new LinkedList();

        this.estudiantesTest.add(new Estudiante("Diego Soto","Estaniaslo Soto","200806012","27/04/05",6.1));

        this.profesoresTest.add(new Profesor("Samuel Medina","Software" ,5 ));
        this.profesoresEsperaTest.add(new Profesor("Miguel Medina","Derecho" ,7 ));

        this.personalesTest.add(new Personal("Ernesto Mera","Director" ));


        mensajeMostrarEstudianteTest = "Estudiantes ingresados en el sistema:\r\n" +
                "Estudiante: Nombre='Diego Soto', Direccion='Estaniaslo Soto', R.U.N='200806012', Fecha Ingreso='27/04/05', Promedio=6.1\r\n" +
                "No hay estudiantes en espera\r\n";

        mensajeEsperadoProfes = "Profesores ingresados en el sistema:\r\n" +
                "Profesor: Nombre='Samuel Medina', Especialidad='Software', Años Experiencia='5\r\n" +
                "==========================================================================\r\n" +
                "Profesores en Lista de espera:\r\n" +
                "Profesor: Nombre='Miguel Medina', Especialidad='Derecho', Años Experiencia='7\r\n";

        mensajeEsperadoPersonal = "Personal: Nombre='Ernesto Mera', Profesion='Director\r\n";

        mensajeMostrarEstudianteVacioTest = "No hay estudiantes inscritos\r\n";
        mensajeEsperadoVacioProfes = "No hay Profesores inscritos\r\n";
        mensajeEsperadoVacioPersonal = "No hay personal Incrito\r\n";
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();


    @org.junit.Test
    public void mostrarEstudiantes() {
        PrintStream save_out=System.out;final ByteArrayOutputStream out = new ByteArrayOutputStream();System.setOut(new PrintStream(out));
        establecimiento.mostrarEstudiantes(estudiantesTest,estudiantesEsperaTest);
        assertEquals(mensajeMostrarEstudianteTest,out.toString());
    }

    @org.junit.Test
    public void mostrarEstudiantesVacios() {
        PrintStream save_out=System.out;final ByteArrayOutputStream out = new ByteArrayOutputStream();System.setOut(new PrintStream(out));
        establecimiento.mostrarEstudiantes(estudiantesVacioTest,estudiantesEsperaTest);
        assertEquals(mensajeMostrarEstudianteVacioTest,out.toString());
    }

    @org.junit.Test
    public void mostrarProfes() {
        PrintStream save_out=System.out;final ByteArrayOutputStream out = new ByteArrayOutputStream();System.setOut(new PrintStream(out));
        establecimiento.mostrarProfes(profesoresTest, profesoresEsperaTest);
        assertEquals(mensajeEsperadoProfes, out.toString());
    }

    @org.junit.Test
    public void mostrarProfesVacios() {
        PrintStream save_out=System.out;final ByteArrayOutputStream out = new ByteArrayOutputStream();System.setOut(new PrintStream(out));
        establecimiento.mostrarProfes(profesoresVacioTest, profesoresEsperaTest);
        assertEquals(mensajeEsperadoVacioProfes, out.toString());
    }

    @org.junit.Test
    public void mostrarPersonal() {
        PrintStream save_out=System.out;final ByteArrayOutputStream out = new ByteArrayOutputStream();System.setOut(new PrintStream(out));
        establecimiento.mostrarPersonal(personalesTest);
        assertEquals(mensajeEsperadoPersonal, out.toString());
    }

    @org.junit.Test
    public void mostrarPersonalVacios() {
        PrintStream save_out=System.out;final ByteArrayOutputStream out = new ByteArrayOutputStream();System.setOut(new PrintStream(out));
        establecimiento.mostrarPersonal(personalesVacioTest);
        assertEquals(mensajeEsperadoVacioPersonal, out.toString());
    }

}