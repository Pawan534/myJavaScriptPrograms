package com.javaExceptionsEg;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TryCatchExg {
    public static void main(String[] args) throws IOException {
        int res = divide();
        System.out.println(res);
    }

    public static int divide() {

        int x;
        int y;
        try {
            x = getInt();
            y = getInt();
            return x / y;
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Please enter digits");
        } catch (Exception e) {
            throw new ArithmeticException("Number cannot divide by 0");
        }
    }

    public static int getInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers");
        while (true) {
            try {
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Please enter valid number using digits 0 to 9");
                sc.nextLine();
            }
        }
    }
}
