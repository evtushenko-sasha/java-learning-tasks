package com.teachmeskills.lesson5.task1;

public class Dog {

    public String type;
    public int age;
    public String name;

    private Dog(){}

    Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog(int age, String name, String type) {
        this.age = age;
        this.name = name;
        this.type = type;
    }


    public void saySomething() {
        System.out.println("Hey, I'm " + name);
    }

    void printAgeAndName() {
        System.out.println("Type :" + type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




}
