package ru.silversxd.javaTasks.task22.task2;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String info){
        super("Student " + info + " was not found");
    }
}