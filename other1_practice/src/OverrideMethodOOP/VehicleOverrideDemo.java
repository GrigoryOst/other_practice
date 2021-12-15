package OverrideMethodOOP;

public class VehicleOverrideDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(2, 2, 100, 9);
        Auto a = new Auto(2, 4, 180, 12, true);
        System.out.println("V.toString(): " + v.toString());
        System.out.println("OverrideMethod.Auto.toString(): " + a.toString());

        //создание обьекта подкласса АВТО
        Auto bmw = new Auto(true);
        //bmw.sunroof = true;

        //пример обращения к методам и переменным надкласса и подкласса
        System.out.println("Путь пройденный за 1.5 часа: " + bmw.distance(1.5) + " km");
        System.out.println("Max.speed: " + bmw.getMaxspeed() + " km");
        System.out.println("Наличие люка: " + bmw.sunroof);
    }

    /*Vehicle ferrari = new Vehicle(3,-2,320,20); \\ чтение и запись закрытых методов
        System.out.println("max speed " + ferrari.getMaxspeed() + " km");
        System.out.println("number wheels " + ferrari.getWheels() + " km");

        ferrari.setWheels(4);
        System.out.println("number wheels " + ferrari.getWheels() + " km");*/

        /*Vehicle ferrari = new Vehicle(3,4,320,20); //приммер закрытого члена класса
        double distance = ferrari.distance(0.5);
        System.out.println("ferrari for half hour " + distance + " km");
        //System.out.println(ferrari.maxspeed);*/

        /*Vehicle car1, car2;
        car1 = new OverrideMethod.Vehicle();
        car1.passengers = 25;
        car2 = car1;
        System.out.println(car2.passengers);
        car2.passengers = 50;
        System.out.println(car1.passengers);*/




        /*Vehicle car1 = new Vehicle();
        car1.passengers = 2;
        car1.wheels = 4;
        car1.maxspeed = 120;
        car1.burnout = 12;

        Vehicle bus1 = new Vehicle();
        bus1.passengers = 20;
        bus1.wheels = 6;
        bus1.maxspeed = 70;
        bus1.burnout = 30;

        double interval = 1.25;

        double distanceCar1 = car1.maxspeed * interval;
        double distanceBus1 = bus1.maxspeed * interval;

        System.out.println(distanceCar1 + "km");
        System.out.println(distanceBus1 + "km");*/

}
