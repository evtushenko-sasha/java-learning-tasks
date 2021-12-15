package com.teachmeskills.lesson6.task1;

public abstract class Car {

    protected String model;
    protected Engine engine;
    protected String color;

    public Car(String model, Engine engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public abstract void drive();

    public Engine getEngine() {
        return engine;
    }
}
