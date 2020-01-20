package com.javabasic;

public class LargestPrime {
    // write your code here

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
    public static int getLargestPrime(int n) {

        if (n <= 1) {
            return -1;
        } else {
            int div = 2;
            while (div < n) {
                if (n % div != 0) {
                    System.out.println("in if condition " + div);
                    div++;
                } else {
                    n = n / div;
                    System.out.println("n value " + n);
                    div = 2;
                }
            }
            return n;
        }
    }
}