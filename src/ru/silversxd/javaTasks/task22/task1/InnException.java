package ru.silversxd.javaTasks.task22.task1;

public class InnException extends Exception {
    public InnException() {
        super("Инн должен состоять из 11 цифр");
    }
}