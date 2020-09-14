package dci.ufro;

import java.util.Set;

public class Faculty {

    private String name;

    private Employee dean;

    private Set<Institute> institutes;

    public Faculty(String name, Employee dean, Set<Institute> institutes) {
        this.name = name;
        this.dean = dean;
        this.institutes = institutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getDean() {
        return dean;
    }

    public void setDean(Employee dean) {
        this.dean = dean;
    }

    public Set<Institute> getInstitutes() {
        return institutes;
    }

    public void setInstituteSet(Set<Institute> institutes) {
        this.institutes = institutes;
    }

    public void addInstitute(Institute institute){
        this.institutes.add(institute);
    }
}
