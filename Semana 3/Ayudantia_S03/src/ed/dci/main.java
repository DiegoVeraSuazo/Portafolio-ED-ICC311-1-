package ed.dci;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    public static void main(String args[]){
        Mazo mazo = new Mazo();
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;

        int choice; //para ayudar a el flujo de la ayudantia y no tener que estar descomentando a cada rato
        while(mainLoop) {
            System.out.println("Elecciones:");
            System.out.println("1: Mostrar mazo");
            System.out.println("2: Barajar mazo");
            System.out.println("3: Ver primera");
            System.out.println("4: Extraer primera");
            System.out.println("5: Orderar por color 1");
            System.out.println("6: Orderar por color 2");
            System.out.println("7: Orderar por tipo");
            System.out.println("8: Orderar por valor");
            System.out.println("9: Repartir cartas");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    mazo.mostrarMazo();
                    break;
                case 2:
                    mazo.barajar();
                    mazo.mostrarMazo();
                    break;
                case 3:
                    System.out.println(mazo.verPrimera().toString());
                    break;
                case 4:
                    System.out.println(mazo.obtenerPrimera().toString());
                    break;
                case 5:
                    mazo.ordenarPorColorOP1();
                    mazo.mostrarMazo();
                    break;
                case 6:
                    mazo.ordenarPorColorOP2();
                    mazo.mostrarMazo();
                    break;
                case 7:
                    mazo.ordenarPorTipo();
                    mazo.mostrarMazo();
                    break;
                case 8:
                    mazo.ordenarPorValor();
                    mazo.mostrarMazo();
                case 9:
                    System.out.println(mazo.repartirCartas(4));
                case 10:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    mainLoop = false;
                default:
                    System.out.println("Te equivocaste");
                    break;
            }
        }
    }
}
