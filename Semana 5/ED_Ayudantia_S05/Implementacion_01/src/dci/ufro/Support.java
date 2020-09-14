package dci.ufro;

public class Support {

    private ERole eRole;

    private double hours;

    private CourseExcecution courseExcecution;

    public Support(ERole eRole, double hours, CourseExcecution courseExcecution) {
        this.eRole = eRole;
        this.hours = hours;
        this.courseExcecution = courseExcecution;
    }

    public ERole geteRole() {
        return eRole;
    }

    public void seteRole(ERole eRole) {
        this.eRole = eRole;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public CourseExcecution getCourseExcecution() {
        return courseExcecution;
    }

    public void setCourseExcecution(CourseExcecution courseExcecution) {
        this.courseExcecution = courseExcecution;
    }

}
