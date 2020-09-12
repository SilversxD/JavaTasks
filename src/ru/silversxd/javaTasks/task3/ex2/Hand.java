package ru.silversxd.javaTasks.task3.ex2;

public class Hand {
    private String color;
    private int handLength;

    public Hand(String color,int handLength){
        this.handLength = handLength;
        this.color=color;
    }

    public int getHandLength() {
        return handLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHandLength(int handLength) {
        this.handLength = handLength;
    }
    public String changeColor(String newColor){
        return this.color=newColor;
    }
    public int changeLength(int newLength){
        return this.handLength =newLength;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "color='" + color + '\'' +
                ", length=" + handLength +
                '}';
    }
}
