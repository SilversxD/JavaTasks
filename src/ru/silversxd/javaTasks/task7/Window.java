package ru.silversxd.javaTasks.task7;

public class Window extends Furniture {
    private int price;

    public Window(String color, int weight, int height, int price) {
        super(color, weight, height);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Window{" +
                "price=" + price +
                "} " + super.toString();
    }
}
