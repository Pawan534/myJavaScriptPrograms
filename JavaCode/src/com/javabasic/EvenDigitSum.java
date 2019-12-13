package com.javabasic;

public class EvenDigitSum {
    // write your code here

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2555));
    }

    public static int getEvenDigitSum(int num){
        int noOfEvenNumbers=0;
        int temp=0;
        if(num<0){
            noOfEvenNumbers=-1;
        } else{
            while(num>0){
                temp = num%10;
                if(temp%2 ==0){
                    noOfEvenNumbers+=temp;
                }
                num/=10;
            }
        }
        return noOfEvenNumbers;
    }


}