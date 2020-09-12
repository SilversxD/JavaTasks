package ru.silversxd.javaTasks.task3.ex2;

public class Leg {
    private int length;
    private int weight;

    public Leg(int length, int weight){
        this.weight=weight;
        this.length=length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int changeLength(int newLenght){
        return this.length=newLenght;
    }
    public int changeWeight(int newWeight){
        return this.weight=newWeight;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "length=" + length +
                ", weight=" + weight +
                '}';
    }
}
