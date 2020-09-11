package ru.silversxd.javaTasks.task2;

import java.util.ArrayList;

public class PitDog {
    private ArrayList<Dog> list = new ArrayList();
    public void add(Dog ... dog){
        for (int i = 0; i < dog.length; i++)
            list.add(dog[i]);
    }
}
