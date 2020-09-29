package ru.silversxd.javaTasks.task7;

public abstract class Furniture {
    private String color;
    private int weight;
    private int height;

    public Furniture(String color, int weight, int height) {
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}

