package com.teachmeskills.lesson7.task1;

public class Person {

    public void eat(Food food) {
        System.out.println("Человек сьел " + food.getName() + " " + food.getWeight() + " кг " + food.getTypeHowToEat());
    }

    public void eat(Pizza pizza) {
        System.out.println("Мы сьели пиццу " + pizza);
    }

}
