package com.javabasic;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-171));
    }

    public static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int temp = number;
        while (number != 0) {
            reverseNumber = number % 10 + (reverseNumber * 10);
            number = number / 10;
        }
        System.out.println("Reverse number " + reverseNumber);
        if (reverseNumber == temp) {
            return true;

        } else {
            return false;
        }
    }

}