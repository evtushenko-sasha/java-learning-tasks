package com.eval.javaintroduction.array.example;

public class Shop {
    private boolean isWorkingNow;
    private String name;

    public Shop(boolean isWorkingNow, String name) {
        this.isWorkingNow = isWorkingNow;
        this.name = name;
    }

    public boolean isWorkingNow() {
        return isWorkingNow;
    }

    public void setWorkingNow(boolean workingNow) {
        isWorkingNow = workingNow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
