package ru.silversxd.javaTasks.task24.task3.source;

public abstract class IDocument {

    public IDocument() {
    }

    public abstract String getType();
    public abstract void open();
    public abstract void new_file();

}