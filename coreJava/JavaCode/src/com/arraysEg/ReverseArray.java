package com.arraysEg;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arry = {1,5,3,7,11,9,15};
        System.out.println("Array = " + Arrays.toString(arry));
        reverseArry(arry);
        System.out.println("Revered array = " + Arrays.toString(arry));
    }

    public static void reverseArry(int[] arry){
        int maxIndex = arry.length-1;
        int len = arry.length / 2;
        System.out.println(len);
        for(int i=0; i<len;i++){
            int temp = arry[i];
            arry[i] = arry[maxIndex-i];
            arry[maxIndex-i] = temp;
        }
    }
}
