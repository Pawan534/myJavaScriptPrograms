package com.javabasic;

public class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        if((num1< 0 && num2<0) || (num1>0 && num2 >0)){
            boolean isValid;
            System.out.println(num2*1000);
            isValid= ((int)num1*1000 % (int)num2*1000 == 0)?  true :  false;
            return isValid;
        } else{
            return false;
        }

    }

}