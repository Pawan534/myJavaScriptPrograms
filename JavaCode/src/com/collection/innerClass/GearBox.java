package com.collection.innerClass;

import java.util.ArrayList;

public class GearBox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear =0;
    private boolean cluthIsIn;
    private final int myNum;
    private static int count=0;

    public GearBox(int maxGear) {
        this.gears = new ArrayList<>();
        this.maxGears = maxGear;
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
        count++;
        myNum=count;
        System.out.println("Count " + count + " myNum " + myNum);
    }
    
    public void operateCluth(boolean in){
        this.cluthIsIn = in;
    }


    public void addGear(int number, double ratio){
        if(number>0 && number<=maxGears){
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if(newGear>=0 && (newGear < gears.size()) && this.cluthIsIn){
            this.currentGear = newGear;
            System.out.println("New Gear is selected " + newGear);
        }else{
            System.out.println("Grind..!!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int res){
        if(this.cluthIsIn){
            System.out.println("GRIND..!!");
            return 0.00;
        }
        return res*gears.get(currentGear).getRatio();
    }


    private class Gear{
        private int gearNum;
        private double ratio;
        public Gear(int gearNumber, double ratio) {
            this.gearNum = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int res){
            return res*(this.ratio);
        }
    }
}
