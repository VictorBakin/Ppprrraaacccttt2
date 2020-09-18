package com.company;


public class Shape{
    private int height = 10;
    private int weight = 10;
    private int depth = 10;

    @Override
    public String toString() {
        System.out.println("ФИГУРА\nВысота " + height + "\nШирина " + weight + "\nДлина " + depth);
        return super.toString();
    }
}
