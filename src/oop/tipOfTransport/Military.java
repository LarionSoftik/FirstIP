package oop.tipOfTransport;

public class Military extends Air{
    int numberOfBombs;
    boolean ejectionSystem;

    public int getNumberOfBombs() {
        return numberOfBombs;
    }

    public void setNumberOfBombs(int numberOfBombs) {
        this.numberOfBombs = numberOfBombs;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public Military(int longWing, int minLongRoad, int numberOfBombs, boolean ejectionSystem) {
        super(longWing, minLongRoad);
        this.numberOfBombs = numberOfBombs;
        this.ejectionSystem = ejectionSystem;
    }

    public Military(int power, int maxSpeed, int weight, String model, double kW, int longWing, int minLongRoad, int numberOfBombs, boolean ejectionSystem) {
        super(power, maxSpeed, weight, model, kW, longWing, minLongRoad);
        this.numberOfBombs = numberOfBombs;
        this.ejectionSystem = ejectionSystem;
    }

    public Military(int longWing, int minLongRoad) {
        super(longWing, minLongRoad);
    }

    public Military() {
    }

    public Military(int power, int maxSpeed, int weight, String model, double kW) {
        super(power, maxSpeed, weight, model, kW);
    }

    public Military(int power, int maxSpeed, int weight, String model, double kW, int longWing, int minLongRoad) {
        super(power, maxSpeed, weight, model, kW, longWing, minLongRoad);
    }

    @Override
    public String toString() {
        return "Military{" +
                "longWing=" + longWing +
                ", minLongRoad=" + minLongRoad +
                ", numberOfBombs=" + numberOfBombs +
                ", ejectionSystem=" + ejectionSystem +
                ", power of kW = " + kWatt() +
                '}';
    }
    public int makeShot (){
        if (numberOfBombs > 0){
            System.out.println("Ракета пошла...");
            numberOfBombs --;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
        return 0;
    }
    public String checkEjection (){
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
        return null;
    }
}
