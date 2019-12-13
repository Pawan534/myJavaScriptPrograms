package com.javabasic;

public class LastDigitChecker {

    public static void main(String[] args) {
        hasSameLastDigit(10, 121, 190);
    }
    // write your code here
    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if(isValid(num1) && isValid(num2) && isValid(num3)){

            boolean hasLastDigitSame = ((num1%10 == num2%10)|| (num1%10 == num3%10) || (num2%10 == num3%10)) ? true : false;
            return hasLastDigitSame;

        } else{
            return false;
        }

    }

    public static boolean isValid(int num){

        if(num>=10 && num<=1000){
            return true;
        } else{
            return false;
        }
    }


}