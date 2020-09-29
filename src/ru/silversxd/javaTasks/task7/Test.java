package ru.silversxd.javaTasks.task7;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Pavel");
        FurnitureShop magazine = new FurnitureShop();

        Chair chairOne = new Chair("Red", 200, 300, "Wood");

        Window windowOne = new Window("White", 150, 100,123);

        magazine.addMeb(chairOne);
        magazine.addMeb(windowOne);
        person.add(magazine, 2);
        magazine.printProps();
    }
}
