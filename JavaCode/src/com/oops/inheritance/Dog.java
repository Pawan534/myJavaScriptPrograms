package com.oops.inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;

    public Dog(String name, int brain, int body, String size, int weight, int height, int lifeSpan, int eyes, int legs, int tail, int teeth) {
        super(name, brain, body, size, weight, height, lifeSpan);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() method is called");
        super.eat();
    }
    public void run(){
        System.out.println("Dog.run() method is called");
        move();
        eat();
    }

    @Override
    public void move() {
        System.out.println("Dog.move() method is called");
    }
}
