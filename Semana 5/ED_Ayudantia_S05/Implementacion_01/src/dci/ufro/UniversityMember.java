package dci.ufro;

public abstract class UniversityMember  {

    private String firstName;

    private String lastName;

    private int ssNo;

    public UniversityMember(String firstName, String lastName, int ssNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssNo = ssNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSsNo() {
        return ssNo;
    }

    public void setSsNo(int ssNo) {
        this.ssNo = ssNo;
    }
}
