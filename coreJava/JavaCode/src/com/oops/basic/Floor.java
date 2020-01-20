package com.oops.basic;

public class Floor {
    // write your code here
    private double width;
    private double length;

    public Floor(double width, double length){
        setWidth(width);
        setLength(length);
    }

    public void setWidth(double width){
        this.width = (width<0) ? 0: width;
    }

    public void setLength(double length){
        this.length = (length<0) ? 0: length;
    }


    public double getArea(){
        return (this.width*this.length);
    }

}
