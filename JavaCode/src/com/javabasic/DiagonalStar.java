package com.javabasic;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*");
                } else if (j == 1 || j == n) {
                    System.out.print("*");
                } else if (i == j || i == ((n - j) + 1))
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }


}
