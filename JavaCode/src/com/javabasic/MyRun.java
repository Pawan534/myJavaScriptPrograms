package com.javabasic;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyRun {

    public static void main(String[] args) {
//        SpeedConvertor.printConversion(10.59886);
//        long milesPerHour = SpeedConvertor.toMilesPerHour(150);
//        System.out.println(milesPerHour);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String name  = sc.nextLine();
        System.out.println(num);
        System.out.println(name);
//
//        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        List<Integer> list1 = Arrays.asList(1,4,0,7,6);
        list1.forEach(x-> System.out.println(x));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.1756));

        int sum =0, count=0;
        for(int i = 1; i<=1000; i++){
            if((i%3 ==0) && (i%5==0)){
                count ++;
                sum = i + sum;
                System.out.println("Found number = " + i);
            }
            if(count == 5){
                break;
            }
        }
        System.out.println("Sum = " + sum);

    }
}
