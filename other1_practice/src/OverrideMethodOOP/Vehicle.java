package OverrideMethodOOP;

public class Vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnout;

    public Vehicle(int passengers, int wheels, int maxspeed, int burnout) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnout = burnout;
    }

    double distance (double interval) {
        double value = this.maxspeed * interval;
        return value;
    }

    int getMaxspeed() {
        return this.maxspeed;
    }

    @Override
    public String toString() {
        return "OverrideMethod.Vehicle{" +
                "passengers=" + passengers +
                ", wheels=" + wheels +
                ", maxspeed=" + maxspeed +
                ", burnout=" + burnout +
                '}';
    }

    // пример замены дублирующего кода
    /*public Vehicle() { //конструктор без параметров
        this(4, 4, 160, 13);
    }

    public Vehicle(int passengers, int wheels, int maxspeed, int burnout) { //с параметрами
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnout = burnout;
    }

    // методы расчета длины пройденного пути
    double distance (int interval) {
        return distance((double) interval);
    }
    double distance (double interval) {
        double value = this.maxspeed * interval;
        return value;
    }*/

    /*public Vehicle(int passengers, int wheels, int maxspeed, int burnout) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnout = burnout;
    }
                                                                            // пример перегружаемых конструкторов
    public Vehicle() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnout = 13;
    }*/

    //пример чтения и записи закрытых членов класса
    //конструктор
    /*public Vehicle(int passengers, int wheels, int maxspeed, int burnout) {
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxspeed = maxspeed;
        this.burnout = burnout;
    }
    //расчет пройденного пути
    double distance (double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
    //метод чтения значения количества колес
    int getWheels() {
        return this.wheels;
    }
    //метод чтения значения макс скорости
    int getMaxspeed() {
        return this.maxspeed;
    }
       //метод записи количества колес
    void setWheels(int wheels) {
        //проверка на корректность
        if ((wheels < 1) || (wheels > 24)){
            System.out.println("Wrong wheels numbers");
            return;
        }
        this.wheels = wheels;
    }*/

}
