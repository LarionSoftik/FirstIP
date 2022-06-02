package oop;

public class Car {
    private int countOfWheels;
    private String engine;

    public Car() {
    }

    public Car(int countOfWheels, String engine) {
        this.countOfWheels = countOfWheels;
        this.engine = engine;
    }

    public void printCarInfo() {
        System.out.println("Количество колес - " + countOfWheels);
        System.out.println("Двигатель - " + engine);
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
