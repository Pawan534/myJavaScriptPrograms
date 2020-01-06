package com.abstractJava;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();

        Bird bird =  new Paroot("Australian");
        bird.fly();
        bird.breath();
        bird.eat();

        Eagle eagle =  new Eagle("Eagle");
        eagle.eat();
        eagle.breath();
        eagle.fly();


    }
}
