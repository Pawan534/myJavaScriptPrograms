package com.javabasic;

import java.util.Scanner;

public class MyCalculator {

    public static void main(String args[]){

        int num1, num2;
        double result=0;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please enter first valid number: ");
        num1 = scanner.nextInt();
        System.out.println("Please enter second valid number: ");
        num2 = scanner.nextInt();
        System.out.println("Please enter operator: ");
        char op = scanner.next().charAt(0);

        switch (op){
            case '+' :
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;

            case '%':
                result = num1 % num2;
                break;
               default:
                   System.out.println("Please enter a valid operator");
        }

        System.out.println(num1 + " "+op + " " + num2 + " = " + result );

    }

}
