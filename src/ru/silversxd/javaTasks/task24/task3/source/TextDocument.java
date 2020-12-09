package ru.silversxd.javaTasks.task24.task3.source;

public class TextDocument extends IDocument {
    public TextDocument() {
    }

    @Override
    public void open() {
        System.out.println("Opened TextDocument");
    }

    @Override
    public void new_file() {
        System.out.println("New TextDocument");
    }

    @Override
    public String getType() {
        return "Text";
    }
}