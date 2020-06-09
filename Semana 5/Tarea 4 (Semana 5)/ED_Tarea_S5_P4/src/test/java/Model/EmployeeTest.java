package Model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class EmployeeTest {


    private Employee employeeTest;

    @Before
    public void prepare(){
        employeeTest = new Employee("","",2);

    }

    @Test
    public void getId() {
        assertEquals(2,employeeTest.getId());
    }
}