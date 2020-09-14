package dci.ufro;
import java.util.ArrayList;
import java.util.List;
public class ResearchAssociate extends Employee{

    private String fieldOfStudy;

    private List<Participation> participations;

    public ResearchAssociate(int ssNO, String name, String email,String fieldOfStudy) {
        super(ssNO, name, email);
        this.fieldOfStudy = fieldOfStudy;
        this.participations = new ArrayList<>();
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public List<Participation> getParticipations() {
        return participations;
    }

    public void setParticipations(List<Participation> participations) {
        this.participations = participations;
    }

    public void addParticipation(Participation participation){
        this.participations.add(participation);
    }
}
