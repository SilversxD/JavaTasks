package ru.silversxd.javaTasks.task3.ex3;

public class testBook {
    public static void main(String[] args) {
        Book book = new Book("Pushkin","12 february 1998","451");
        book.setAuthor("Shexpear");
        book.setDate("12 september 2018");
        book.setName("Gamlet");
        System.out.println(book.getAuthor()+" "+book.getDate()+" "+book.getName());

    }
}
