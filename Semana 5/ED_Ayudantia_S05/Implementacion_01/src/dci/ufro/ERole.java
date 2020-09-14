package dci.ufro;

public enum ERole {
    lecturer,
    tutor,
    examiner;

    public String getERole(){
        return this.name();
    }
}
