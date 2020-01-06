package com.arraysEg;

import java.util.Scanner;

public class MinValue {
    private static Scanner sc =  new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the count");
        int count = sc.nextInt();
        int[] myArry = getIntData(count);
        System.out.println("Min value: " + getMinValue(myArry));
    }


    public static int[] getIntData(int count){

        int[] arry = new int[count];
        for(int i=0; i<count;i++){
            System.out.println("Enter the number: ");
            arry[i] = sc.nextInt();
        }
        return arry;
    }

    public static int getMinValue(int[] a){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<a.length;i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

}

