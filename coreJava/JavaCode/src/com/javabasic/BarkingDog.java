package com.javabasic;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if((hourOfDay < 0 && hourOfDay > 23) && barking){
            return false;
        } else if (((hourOfDay>=0 && hourOfDay<8) || (hourOfDay>22 && hourOfDay<=23)) && barking){
            return true;
        } else{
            return false;
        }
    }

}