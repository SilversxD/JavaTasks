package ru.silversxd.javaTasks.task3.ex1;

public class Circle {
    private int rad;
    private String color;

    public Circle(int rad,String color){
        this.rad=rad;
        this.color=color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getRad() {
        return rad;
    }

    public int getDia(int rad) {
        return rad*2;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public int getsKruga() {
        return 3*rad*rad;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "rad=" + rad +
                ", color='" + color + '\'' +
                '}';
    }
}
