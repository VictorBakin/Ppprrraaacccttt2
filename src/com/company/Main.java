package com.company;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        Ball ball = new Ball();
        Shape shape = new Shape();
        Dog dog = new Dog("Jack", 10);
        DogKennel ken = new DogKennel(10);

        dog.dogAgeGetPeopleAge();

        book.toString();
        ball.toString();
        shape.toString();
        dog.toString();
        ken.tell();


    }
}
