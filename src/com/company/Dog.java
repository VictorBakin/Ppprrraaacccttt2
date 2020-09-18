package com.company;

public class Dog {
    String name = "default";
    int dog_age = -1;
    int people_age = -1;

    public Dog(String name, int dog_age){
        this.dog_age = dog_age;
        this.name = name;
    }

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setDog_age(int dog_age){this.dog_age = dog_age;}
    public int getDog_age(){return dog_age;}

    public void dogAgeGetPeopleAge(){people_age = dog_age * 7;}

    @Override
    public String toString() {
        System.out.println("ЩЕНОК\nИмя " + name + "\nКол-во лет " + dog_age + "\nКол-во лет в человечьих годах " + people_age);
        return super.toString();
    }

}