package main;

import mazoCarta.Mazo;

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
            System.out.println("5: Ordenar por color ");
            System.out.println("6: Ordenar por tipo");
            System.out.println("7: Ordenar por valor");
            System.out.println("8: Repartir cartas");
            System.out.println("9: Salir Aplicacion");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    mazo.mostrarMazoList();
                    System.out.println("=======");
                    mazo.mostrarMazoQueue();
                    System.out.println("=======");
                    mazo.mostrarMazoSet();
                    break;
                case 2:
                    mazo.barajarList();
                    mazo.mostrarMazoList();
                    break;
                case 3:
                    System.out.println(mazo.verPrimeraCartaList().toString());
                    System.out.println(mazo.verPrimeraCartaQueue().toString());
                    System.out.println(mazo.verPrimeraCartaSet().toString());
                    break;
                case 4:
                    System.out.println(mazo.obtenerPrimeraCartaList().toString());
                    System.out.println(mazo.obtenerPrimeraCartaQueue().toString());
                    System.out.println(mazo.obtenerPrimeraCartaSet().toString());
                    break;
                case 5:
                    mazo.ordenarPorColorList();
                    mazo.mostrarMazoList();
                    break;
                case 6:
                    mazo.ordenarPorTipoList();
                    mazo.mostrarMazoList();
                    break;
                case 7:
                    mazo.ordenarPorValorList();
                    mazo.mostrarMazoList();
                    break;
                case 8:
                    System.out.println(mazo.repartirCartasList(4));
                    System.out.println("=============");
                    System.out.println(mazo.repartirCartasQueue(4));
                    System.out.println("=============");
                    System.out.println(mazo.repartirCartasSet(4));
                    break;
                case 9:
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
