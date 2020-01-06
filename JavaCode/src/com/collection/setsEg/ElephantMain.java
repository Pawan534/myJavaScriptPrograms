package com.collection.setsEg;

public class ElephantMain {
    public static void main(String[] args) {
        Elephant elephant =  new Elephant("Rover");
        Labrador labrador = new Labrador("Rover");

        System.out.println(elephant.equals(labrador));
        System.out.println(labrador.equals(elephant));
    }
}
