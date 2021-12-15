package com.teachmeskills.lesson6.task1;

public class Truck extends Car implements Printable {

    private double loadCapacity;
    private String bodyType;

    public Truck(String model, Engine engine, String color, double loadCapacity, String bodyType) {
        super(model, engine, color);
        this.loadCapacity = loadCapacity;
        this.bodyType = bodyType;
    }

    @Override
    public void drive() {
        System.out.println("Едем на грузовике");

    }

    @Override
    public void print() {

    }
}
