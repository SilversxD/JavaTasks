package ru.silversxd.javaTasks.task3;

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

    public void getDia(int dia) {
        this.rad = rad*2;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void getsKruga() {
        this.sKruga = 3*rad*rad;
    }


}
