package oop.tipOfTransport;

import java.util.Scanner;

public class Easy extends Ground_Transportation {
    Scanner scanner = new Scanner(System.in);
    private String bodyType;
    private int numberPass;


    public Easy(int numberOfWheels, int consumptionFuel) {
        super(numberOfWheels, consumptionFuel);
    }

    public Easy(int power, int maxSpeed, int weight, String model, double kW, int numberOfWheels, int consumptionFuel) {
        super(power, maxSpeed, weight, model, kW, numberOfWheels, consumptionFuel);
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberPass() {
        return numberPass;
    }

    public void setNumberPass(int numberPass) {
        this.numberPass = numberPass;
    }

    @Override
    public String toString() {
        return "Easy{" +
                "bodyType='" + bodyType + '\'' +
                ", numberPass=" + numberPass +
                ", numberOfWheels=" + numberOfWheels +
                ", consumptionFuel=" + consumptionFuel +
                ", power of kW = " + kWatt() +
                '}';
    }
    public String showInfoOfMove () {
        System.out.println("За время " + calculationTime() + " часа(ов), автомобиль " + getModel() + " двигаясь со скоростью " + getMaxSpeed() + " км/ч , проедет " + calculationWay() + " и изасходует " + wasteOfFuel() + " литров топлива");
        return null;
    }

    private int calculationTime () {
        int time = scanner.nextInt(); // не работает ввод
        return time;
    }

    private double calculationWay (){
        return calculationTime() * getMaxSpeed();
    }

    private double wasteOfFuel () {
        return calculationWay() / getConsumptionFuel();

    }
}
