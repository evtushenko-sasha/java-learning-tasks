package com.teachmeskills.lesson7.task1;

public abstract class Food implements Cloneable {

    private Integer weight;
    private String name;

    public Food(Integer weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getTypeHowToEat() {
        return "Вилкой";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Food food = (Food) o;

        if (!this.weight.equals(food.weight)) return false;
        return this.name.equals(food.name);
    }

    @Override
    public int hashCode() {
        int result = weight.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
