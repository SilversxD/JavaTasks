package ru.silversxd.javaTasks.task24.task3.source;

public class ImageDocument extends IDocument {

    public ImageDocument() {
    }

    @Override
    public void open() {
        System.out.println("Opened ImageDocument");
    }

    @Override
    public void new_file() {
        System.out.println("New ImageDocument");
    }

    @Override
    public String getType() {
        return "Iamge";
    }

}