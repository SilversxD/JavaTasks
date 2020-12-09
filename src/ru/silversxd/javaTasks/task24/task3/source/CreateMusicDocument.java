package ru.silversxd.javaTasks.task24.task3.source;

public class CreateMusicDocument implements CreateDocument {
    @Override
    public IDocument createNew() {
        return new MusicDocument();
    }

    @Override
    public IDocument createOpen(IDocument iDocument) {
        iDocument.open();
        return iDocument;
    }
}