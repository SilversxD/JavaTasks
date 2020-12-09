package ru.silversxd.javaTasks.task24.task3.source;

public class CreateImageDocument implements CreateDocument {

    @Override
    public IDocument createNew() {
        return new ImageDocument();
    }

    @Override
    public IDocument createOpen(IDocument iDocument) {
        iDocument.open();
        return iDocument;
    }
}