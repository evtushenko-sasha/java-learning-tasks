package com.teachmeskills.lesson6.task1;

public class PassengerCar extends Car implements Printable {

    private int trunkVolume;
    private int passengerCount;

    public PassengerCar(String model, Engine engine, String color, int trunkVolume, int passengerCount) {
        super(model, engine, color);
        this.trunkVolume = trunkVolume;
        this.passengerCount = passengerCount;
    }

    @Override
    public void drive() {
        System.out.println("Едем на легковом авто");
    }

    @Override
    public void print() {

    }
}
