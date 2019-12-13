package com.javabasic;

public class PerfectNumber {
    // write your code here
    public static boolean isPerfectNumber(int number){
        int sum=0;
        boolean perfectNumber = false;
        if(number<1){
            perfectNumber= false;
        } else{
            for(int i=1; i<number; i++){
                if(number % i == 0){
                    sum+=i;
                }
            }
            perfectNumber = (sum == number)? true: false;
        }
        return perfectNumber;

    }
}