package oop.tipOfTransport;

public class Air extends Transport{
   int longWing;
   int minLongRoad;

    public int getLongWing() {
        return longWing;
    }

    public void setLongWing(int longWing) {
        this.longWing = longWing;
    }

    public int getMinLongRoad() {
        return minLongRoad;
    }

    public void setMinLongRoad(int minLongRoad) {
        this.minLongRoad = minLongRoad;
    }

    public Air(int longWing, int minLongRoad) {
        this.longWing = longWing;
        this.minLongRoad = minLongRoad;
    }

    public Air() {
    }

    public Air(int power, int maxSpeed, int weight, String model, double kW) {
        super(power, maxSpeed, weight, model, kW);
    }

    public Air(int power, int maxSpeed, int weight, String model, double kW, int longWing, int minLongRoad) {
        super(power, maxSpeed, weight, model, kW);
        this.longWing = longWing;
        this.minLongRoad = minLongRoad;

    }
}