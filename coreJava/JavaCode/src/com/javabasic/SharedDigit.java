package com.javabasic;

public class SharedDigit {
    // write your code here

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 756));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        int temp = 0;
        boolean shareValue = false;
        if ((num1 > 10 && num1 <= 999) && (num2 > 10 && num2 <= 999)) {
            int count=0;
            while (num1 > 0) {
                temp = num2;
                while (num2 > 0) {
                    if (num1%10 == num2%10) {
                        shareValue = true;
                        count++;
                        break;
                    }
                    num2 = num2 / 10;
                }
                if(count>=1){
                    break;
                }
                num1 = num1 / 10;
                num2 = temp;
            }
        }
        return shareValue;

    }
}