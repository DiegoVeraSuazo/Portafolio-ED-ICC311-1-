package dci.ufro;

import java.util.List;

public class Lecturer extends ResearchAssociate{
    private List<Course> courses;

    public Lecturer(int ssNO, String name, String email, String fieldOfStudy, List<Course> courses) {
        super(ssNO, name, email, fieldOfStudy);
        this.courses = courses;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }
}
