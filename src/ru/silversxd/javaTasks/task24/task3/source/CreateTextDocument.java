package ru.silversxd.javaTasks.task24.task3.source;

public class CreateTextDocument implements CreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen(IDocument iDocument) {
        iDocument.open();
        return iDocument;
    }
}