package com.arraysEg;

import java.util.Scanner;

public class sortArray {
    private  static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int size = 6;
        int[] arrys = getIntegers(size);
        printArrays(arrys);

        System.out.println("After sort");
        int[] sortedArry = sortArrays(arrys);
        printArrays(sortedArry);
    }

    public static int[] getIntegers(int capcity){
        int[] arr = new int[capcity];
        System.out.println("Enter " + capcity + " integers value");
        for(int i=0;i<capcity;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArrays(int[] a){
        for(int i =0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static int[] sortArrays(int[] sorted){
        int[] sortedArry = new int[sorted.length];
        for (int i=0; i<sorted.length;i++){
            sortedArry[i] = sorted[i];
        }
        int temp=0;
        boolean flag = true;
        while (flag){
            flag=false;
            for(int i=0; i<sortedArry.length-1;i++){
                if(sortedArry[i] < sortedArry[i+1]){
                    temp = sortedArry[i];
                    sortedArry[i] = sortedArry[i+1];
                    sortedArry[i+1] = temp;
                    flag=true;
                }
            }
        }

        return sortedArry;
    }
}
