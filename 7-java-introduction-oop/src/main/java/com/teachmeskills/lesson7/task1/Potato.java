package com.teachmeskills.lesson7.task1;

public class Potato extends Food {

    public Potato(Integer weight, String name) {
        super(weight, name);
    }

    @Override
    public String getTypeHowToEat() {
        return "Вилкой с ножем";
    }
}
