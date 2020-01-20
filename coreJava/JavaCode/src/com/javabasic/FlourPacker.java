package com.javabasic;

public class FlourPacker {
    // write your code here

    public static boolean canPack(int bigCount, int smallCount, int goal){

        boolean isPack = false;

        if(bigCount < 0 || smallCount < 0 || goal < 0 ){
            isPack = false;
        } else{
            int totalCount = (bigCount*5) + smallCount;
            if(totalCount >= goal){
                isPack = ((bigCount*5 == goal) || (smallCount>=goal))? true : ((totalCount - goal)%5 <= smallCount ? true: false);

            }
        }
        return isPack;

    }
}