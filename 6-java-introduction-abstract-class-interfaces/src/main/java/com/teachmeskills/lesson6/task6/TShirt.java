package com.teachmeskills.lesson6.task6;

public class TShirt {

    private Size size;

    public TShirt(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "size=" + size +
                '}';
    }
}
