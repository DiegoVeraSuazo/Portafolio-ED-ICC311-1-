package dci.ufro;
import java.util.ArrayList;
import java.util.List;
public class Employee extends UniversityMember{

    private int acctNo;

    private List<Support> supports;

    public Employee(String firstName, String lastName, int ssNo, int acctNo) {
        super(firstName, lastName, ssNo);
        this.acctNo = acctNo;
        this.supports = new ArrayList<>();
    }

    public int getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(int acctNo) {
        this.acctNo = acctNo;
    }

    public void addSupport(Support support){
        this.supports.add(support);
    }

}
