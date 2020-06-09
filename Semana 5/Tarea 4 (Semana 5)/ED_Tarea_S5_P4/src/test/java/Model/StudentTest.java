package Model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class StudentTest {

    private Student studentTest;

    @Before
    public void prepare() {
        studentTest=new Student("Student","Some",3);

    }

    @Test
    public void print() {
        PrintStream save_out = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        studentTest.print();
        assertEquals("Student, Some, 3\r\n", out.toString());
    }
}