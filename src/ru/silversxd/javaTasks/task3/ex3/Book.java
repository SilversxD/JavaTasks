package ru.silversxd.javaTasks.task3.ex3;


public class Book {
    private String author;
    private String date;
    private String name;
    public Book(String author, String date, String name){
        this.author=author;
        this.date=date;
        this.name=name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

}
