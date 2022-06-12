package oop.tipOfTransport;

import java.util.Scanner;

public class Cargo extends Ground_Transportation{
    Scanner scanner = new Scanner(System.in);
    int tonnage;

    public Cargo(int numberOfWheels, int consumptionFuel, int tonnage) {
        super(numberOfWheels, consumptionFuel);
        this.tonnage = tonnage;
    }

    public Cargo(int power, int maxSpeed, int weight, String model, double kW, int numberOfWheels, int consumptionFuel, int tonnage) {
        super(power, maxSpeed, weight, model, kW, numberOfWheels, consumptionFuel);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "tonnage=" + tonnage +
                ", numberOfWheels=" + numberOfWheels +
                ", consumptionFuel=" + consumptionFuel +
                ", power of kW = " + kWatt() +
                '}';
    }
    public int checkingCapacity () {
        int enterTonnage = scanner.nextInt();
        if (enterTonnage > tonnage){
            System.out.println("Вам нужен грузовит побольше");
        } else {
            System.out.println("Грузовик загружен");
        }
        return 0;
    }
}
