package com.javabasic;

import java.util.Scanner;

public class InputCalculator {
    // Write your code here
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner =  new Scanner(System.in);
        int sum=0;
        double avgerage=0.0d;
        long avg =0;
        int count=0;

        while(true){
            boolean hasInt = scanner.hasNextInt();

            if(hasInt){
                sum+=scanner.nextInt();
                count++;
            }else{
                break;
            }
        }
        System.out.println("Sum = " + sum + " count = " + count);
        avgerage = (double) sum/count;
        avg = (long)Math.round(avgerage);
        System.out.println("avgerage " + avgerage);

        System.out.println("SUM = " + sum + " AVG = " + (avg));

    }
}