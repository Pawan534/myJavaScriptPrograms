package com.javabasic;

public class NumberOfDaysInMonth {
    // write your code here

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(12, 10000));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            boolean leapYear = (year % 4 == 0) ? (year % 100 == 0 ? (year % 400 == 0 ? true : false) : true) : false;
            return leapYear;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int days = -1;
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
            boolean leapYear = isLeapYear(year);
            switch (month) {
                case 1:
                    days = 31;
                    break;
                case 2:
                    days = (leapYear ? 29 : 28);
                    break;
                case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                 default:
                     days = -1;
                     break;
            }
        } else{
            days = -1;
        }


        return days;
    }


}