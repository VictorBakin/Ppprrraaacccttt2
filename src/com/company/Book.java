package com.company;

public class Book {
    private int page = 10;
    private int weight = 10;
    private int depth = 10;

    @Override
    public String toString() {
        System.out.println("КНИГА\nКол-во страниц " + page + "\nШирина " + weight + "\nДлина " + depth);
        return super.toString();
    }
}