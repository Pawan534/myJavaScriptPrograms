package com.javabasic;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(18, 9));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int divisor = -1;
        if (first < 10 || second < 10) {
            divisor = -1;
        } else {
            int len = first > second ? second : first;
            for (int i = len; i > 0; i--) {
                if (first % i == 0 && second % i == 0) {
                    divisor = i;
                    break;
                }
            }
        }
        return divisor;
    }
}
