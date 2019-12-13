package com.oops.inheritance;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private String size;
    private int weight;
    private int height;
    private int lifeSpan;

    public Animal(String name, int brain, int body, String size, int weight, int height, int lifeSpan) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.height = height;
        this.lifeSpan = lifeSpan;
    }

    public void eat(){
        System.out.println("Animal.eat() method is called");
    }

    public void walk(){
        System.out.println("Animal.walk() method is called");
    }

    public void move(){
        System.out.println("Animal.move() method is called");
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public String getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
