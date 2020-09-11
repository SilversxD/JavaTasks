package ru.silversxd.javaTasks.task2;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog("Rex", 4);
        PitDog pit = new PitDog();
        System.out.println(dog.gethumanAge());
        pit.add(new Dog("12", 1), new Dog("Cutie", 10));
    }
}