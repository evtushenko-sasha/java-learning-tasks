package com.teachmeskills.lesson6.task1;

public class Engine {

    private String fuelType;
    private double engineVolume;

    public Engine(String fuelType, double engineVolume) {
        this.fuelType = fuelType;
        this.engineVolume = engineVolume;
    }

    public void fixIssue() {
        System.out.println("Fix issue");
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}
