package dci.ufro;

public class Participation {

    private int hours;

    private Project project;

    public Participation(int hours, Project project) {
        this.hours = hours;
        this.project = project;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
