package com.abstractJava;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating");
    }

    @Override
    public void breath() {
        System.out.println("Breath in, Breath out, repeats");
    }
}
