package OverrideMethodOOP;

public class Auto extends Vehicle {
    boolean sunroof;

    public Auto(boolean sunroof) {
        this(4, 4, 200, 12, true);
    }

    Auto(int passengers, int wheels, int maxspeed, int burnout, boolean sunroof) {
        super(passengers, wheels, maxspeed, burnout);
        this.sunroof = sunroof;
    }

    @Override
    public String toString() {
        return "OverrideMethod.Auto{" +
                "sunroof=" + sunroof +
                ", passengers=" + passengers +
                ", wheels=" + wheels +
                ", maxspeed=" + maxspeed +
                ", burnout=" + burnout +
                '}';
    }
}
