package com.oops.inheritance;

public class Cuboid extends Rectangle {
    // write your code here
    private double height;
    public Cuboid(double width, double length, double height){
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){

        double volume = getArea() * getHeight();
        return volume;
    }
}
