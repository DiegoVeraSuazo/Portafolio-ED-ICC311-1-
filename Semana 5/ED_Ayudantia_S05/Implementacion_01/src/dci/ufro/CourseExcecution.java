package dci.ufro;
import java.util.List;
public class CourseExcecution {

    private int year;

    private ESemester eSemester;

    private List<Student> student;

    private List<Support> supports;

    private Course course;

    public CourseExcecution(int year, ESemester eSemester, List<Student> student, List<Support> supports, Course course) {
        this.year = year;
        this.eSemester = eSemester;
        this.student = student;
        this.supports = supports;
        this.course = course;
    }

    public List<Support> getSupports() {
        return supports;
    }

    public void setSupports(List<Support> supports) {
        this.supports = supports;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ESemester geteSemester() {
        return eSemester;
    }

    public void seteSemester(ESemester eSemester) {
        this.eSemester = eSemester;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public void addStudent(Student student){
        this.student.add(student);
    }

    public void addSupport(Support support){
        this.supports.add(support);
    }
}
