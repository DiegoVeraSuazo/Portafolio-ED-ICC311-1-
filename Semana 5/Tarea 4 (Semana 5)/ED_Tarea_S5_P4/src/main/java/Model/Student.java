package Model;

public class Student extends Person{

    private int id;

    public Student(String name, String address, int id) {
        super(name, address);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void print(){
        System.out.println(getName()+", "+getAddress()+", "+id);
    }

}
