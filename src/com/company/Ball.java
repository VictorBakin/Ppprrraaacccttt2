package com.company;

public class Ball {
    private int radius = 10;
    private int diametr = 20;
    private int volume = 500;

    @Override
    public String toString() {
        System.out.println("МЯЧ\nРадиус " + radius + "\nДиаметр " + diametr + "\nОбъем " + volume);
        return super.toString();
    }
}