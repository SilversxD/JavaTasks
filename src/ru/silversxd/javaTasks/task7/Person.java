package ru.silversxd.javaTasks.task7;

import java.util.ArrayList;

public class Person {
    private ArrayList<Furniture> pouch;
    private String name;

    public Person(ArrayList<Furniture> pouch, String name) {
        this.pouch = pouch;
        this.name = name;
    }

    public Person(String name){
        this.name = name;
        pouch = new ArrayList<>();
    }

    public ArrayList<Furniture> getPouch() {
        return pouch;
    }

    public void setPouch(ArrayList<Furniture> pouch) {
        this.pouch = pouch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(FurnitureShop shop, int id){
        pouch.add(shop.removeProp(id));
    }

    @Override
    public String toString() {
        return "Person{" +
                "pouch=" + pouch +
                ", name='" + name + '\'' +
                '}';
    }
}
