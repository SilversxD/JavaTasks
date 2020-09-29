package ru.silversxd.javaTasks.task7;

import java.util.HashMap;
import java.util.Map;

public class FurnitureShop {
    private HashMap<Integer, Furniture> arr;
    int id = 0;

    public FurnitureShop() {
        arr = new HashMap<>();
    }

    public void addMeb(Furniture meb){
        arr.put(id++, meb);
    }

    public Furniture removeProp(int id){
        return arr.remove(id);
    }

    public void printProps() {
        for (Map.Entry<Integer, Furniture> e : arr.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: "
                    + e.getValue());
        }
    }
}