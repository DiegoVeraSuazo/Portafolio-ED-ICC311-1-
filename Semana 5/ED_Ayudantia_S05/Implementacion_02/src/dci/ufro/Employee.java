package dci.ufro;

public abstract class Employee {
    
    public int ssNO;

    public String name;

    public String email;

    public Employee(int ssNO, String name, String email) {
        this.ssNO = ssNO;
        this.name = name;
        this.email = email;
    }

    public int getSsNO() {
        return ssNO;
    }

    public void setSsNO(int ssNO) {
        this.ssNO = ssNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
