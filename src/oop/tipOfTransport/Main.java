package oop.tipOfTransport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Easy easy = new Easy(90, 300, 2000, "Ford", 150, 4, 10);
//        System.out.println(easy.showInfoOfMove());
//        Cargo MAZ = new Cargo(555, 90, 5000, "Belarus", 689, 6,22,6000);
//        System.out.println(MAZ.checkingCapacity());
//        Civilian airbus = new Civilian (1000, 1200, 600, "Z-100", 5000, 1000, 1000, 100, true);
//        System.out.println(airbus.checkingPassengers());
        Military kargabob = new Military(1000, 800, 1000, "BEER", 5000, 10000, 500, 20, true );
        System.out.println(kargabob.checkEjection());
    }
}
