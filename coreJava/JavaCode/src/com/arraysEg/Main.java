package com.arraysEg;

public class Main {
    public static void main(String[] args) {

        int[] arry = new int[20];
        arry[5] = 10;
        for(int i=0; i<arry.length; i++) {
            arry[i] = i * 10;
        }
        System.out.println("Avg " + printMyArry(arry));
    }

    public static double printMyArry(int a[]){
        double avg = 0;
        for(int i=0; i<a.length; i++){
            avg+=a[i];
            System.out.println(a[i]);
        }
        return (avg/a.length);
    }

}
