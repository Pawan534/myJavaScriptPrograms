package com.javabasic;

public class FirstLastDigitSum {
    // write your code here
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else if (number >= 10) {
            int firstDigit = 0;
            int lastDigit = number % 10;
            while (number > 0) {
                number = number/10;
                if (number <= 9) {
                    firstDigit = number;
                    break;
                }
            }
            return (firstDigit+lastDigit);
        } else {
            return (number + number);
        }
    }

}