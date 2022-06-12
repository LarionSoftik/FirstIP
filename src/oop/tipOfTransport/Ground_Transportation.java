package oop.tipOfTransport;

public class Ground_Transportation extends Transport {
    int numberOfWheels;
    int consumptionFuel;

    public Ground_Transportation(int numberOfWheels, int consumptionFuel) {
        this.numberOfWheels = numberOfWheels;
        this.consumptionFuel = consumptionFuel;
    }

    public Ground_Transportation(int power, int maxSpeed, int weight, String model, double kW, int numberOfWheels, int consumptionFuel) {
        super(power, maxSpeed, weight, model, kW);
        this.numberOfWheels = numberOfWheels;
        this.consumptionFuel = consumptionFuel;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getConsumptionFuel() {
        return consumptionFuel;
    }

    public void setConsumptionFuel(int consumptionFuel) {
        this.consumptionFuel = consumptionFuel;
    }
}
