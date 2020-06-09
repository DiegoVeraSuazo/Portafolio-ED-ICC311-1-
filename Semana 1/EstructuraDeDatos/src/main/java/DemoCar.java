public class DemoCar {

    public static void main(String[] args) {

        Car auto[] = new Car[3];

        auto[0] = new Car("mazda",1);
        auto[1] = new Car("NossE",21);
        auto[2] = new Car("chev",10);


        for (int i = 0; i < auto.length ; i++) {
            System.out.println(auto[i].toString());
        }


    }

}
