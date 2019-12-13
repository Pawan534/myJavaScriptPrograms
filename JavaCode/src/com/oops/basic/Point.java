package com.oops.basic;

public class Point {
    // write your code here
    private int x;
    private int y;

    public Point(){
        this(0,0);
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }


    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY( ){
        return this.y;
    }

    public double distance(){
        double result = Math.sqrt(((0-this.x)*(0-this.x)) + ((0-this.y)*(0-this.y)));
        return result;
    }

    public double distance(int x, int y){
        double result = Math.sqrt(((x-this.x)*(x-this.x)) + ((y-this.y)*(y-this.y)));
        return result;
    }

    public double distance(Point a){
        double result = Math.sqrt(((a.getX()-this.x)*(a.getX()-this.x)) + ((a.getY()-this.y)*(a.getY()-this.y)));
        return result;
    }
}