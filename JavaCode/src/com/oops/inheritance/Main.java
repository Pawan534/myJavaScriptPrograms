package com.oops.inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, "Default", 1, 1, 0);
        Dog dog = new Dog("Afador", 1, 1, "Medium", 50, 29, 10, 2, 4, 1, 10);

        dog.run();
        System.out.println("\n\n************ Another Class results *********************");
        Outlander outlander = new Outlander(36);
        outlander.accelerate(30);

        System.out.println("\n\n************ Another Class results *********************");
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
