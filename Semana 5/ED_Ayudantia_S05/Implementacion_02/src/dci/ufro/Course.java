package dci.ufro;
import java.util.List;

public class Course {
    private String name;

    private double hours;

    private int id;

    private List<Lecturer> lecturers;

    public Course(String name, double hours, int id, List<Lecturer> lecturers) {
        this.name = name;
        this.hours = hours;
        this.id = id;
        this.lecturers = lecturers;
    }

    public void addLecturer(Lecturer lecturer){
        this.lecturers.add(lecturer);
    }
}
