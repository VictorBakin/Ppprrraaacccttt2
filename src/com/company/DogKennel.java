package com.company;

public class DogKennel {

    private Dog[] kennel = new Dog[10];

    public DogKennel(int number){

        for(int i = 0;i<number; i++) kennel[i] = new Dog("Puppie", i+1);
    }

    public void tell(){
        for(int i = 0;i< kennel.length; i++) {
            kennel[i].dogAgeGetPeopleAge();
            kennel[i].toString();
        }
    }

}