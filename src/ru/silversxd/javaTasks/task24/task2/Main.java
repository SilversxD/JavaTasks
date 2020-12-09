package ru.silversxd.javaTasks.task24.task2;

public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        Client client = new Client();
        client.setChair(chairFactory.creatMagicChair("wood"));
        client.sit();

    }


}