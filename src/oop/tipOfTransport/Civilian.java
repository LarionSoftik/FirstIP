package oop.tipOfTransport;

import java.util.Scanner;

public class Civilian extends Air {
    Scanner scanner = new Scanner(System.in);
    int passengers;
    boolean businessClass;

    public Civilian() {
        super();
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public Civilian(int longWing, int minLongRoad) {
        super(longWing, minLongRoad);
    }

    public Civilian(int power, int maxSpeed, int weight, String model, double kW, int longWing, int minLongRoad) {
        super(power, maxSpeed, weight, model, kW, longWing, minLongRoad);
    }

    public Civilian(int longWing, int minLongRoad, int passengers, boolean businessClass) {
        super(longWing, minLongRoad);
        this.passengers = passengers;
        this.businessClass = businessClass;
    }

    public Civilian(int power, int maxSpeed, int weight, String model, double kW, int longWing, int minLongRoad, int passengers, boolean businessClass) {
        super(power, maxSpeed, weight, model, kW, longWing, minLongRoad);
        this.passengers = passengers;
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return "Civilian{" +
                "longWing=" + longWing +
                ", minLongRoad=" + minLongRoad +
                ", passengers=" + passengers +
                ", businessClass=" + businessClass +
                ", power of kW = " + kWatt() +
                '}';
    }
    public String checkingPassengers(){
      int numberPassengers = scanner.nextInt();
      if (numberPassengers > passengers){
          System.out.println("Take a bigger plane");
      } else {
          System.out.println("The lane is loaded");
      }
        return null;
    }
}
