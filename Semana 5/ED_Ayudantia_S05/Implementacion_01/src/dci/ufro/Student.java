package dci.ufro;
import java.util.ArrayList;
import java.util.List;
public class Student extends UniversityMember{

    private int matNo;

    private List<CourseExcecution> courseExcecution;

    public Student(String firstName, String lastName, int ssNo, int matNo, List<CourseExcecution> courseExcecutions) {
        super(firstName, lastName, ssNo);
        this.matNo = matNo;
        this.courseExcecution = new ArrayList<>();
    }

    public int getMatNo() {
        return matNo;
    }

    public void setMatNo(int matNo) {
        this.matNo = matNo;
    }

    public List<CourseExcecution> getCourseExcecution() {
        return courseExcecution;
    }

    public void setCourseExcecutions(List<CourseExcecution> courseExcecutions) {
        this.courseExcecution = courseExcecutions;
    }

    public void addCourseExcecution(CourseExcecution courseExcecution){
        this.courseExcecution.add(courseExcecution);
    }

}
