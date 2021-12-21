package com.teachmeskills.lesson7.task1;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza(1, "Пицца с оливками");
        Potato potato = new Potato(2, "Картошка с мясом");
        Chicken chicken = new Chicken(3, "Куриное филе");
        Person person = new Person();

        Food[] foods = {pizza, potato, chicken};

        for (Food food:foods) {
            person.eat(food);
        }
    }

}
