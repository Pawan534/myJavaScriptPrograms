package com.javabasic;

public class SumOddRange {

    public static void main(String[] args) {
        System.out.println("Sum of odd ranges = " + sumOdd(13, 13));
    }

    public static boolean isOdd(int num) {
        if (num > 0 && !(num % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end >= start && start > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = i + sum;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }

}