package com.teachmeskills.lesson6.task1;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("Дизель", 2.6);
        PassengerCar passengerCar = new PassengerCar("BMW", engine, "Черная", 230, 4);
        Truck truck = new Truck("Maz", engine, "Синий", 1000, "Открытый");

        passengerCar.drive();
        truck.drive();

        Car[] cars = new Car[]{passengerCar, truck};


        for (Car car:cars) {
            repairEngine(car);
        }

    }

    public static void repairEngine(Car car) {
        Engine engine = car.getEngine();

        engine.fixIssue();
    }
}
