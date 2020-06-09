public class Car {

    String marca = null;
    int km = 0;

    public Car(String marca, int km) {
        this.marca = marca;
        this.km = km;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", km=" + km +
                '}';
    }
}
