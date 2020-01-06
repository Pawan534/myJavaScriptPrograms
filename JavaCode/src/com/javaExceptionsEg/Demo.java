package com.javaExceptionsEg;

public class Demo {
    public static void main(String[] args) {

        System.out.println(divideByZero(1,0));
        System.out.println(divide(5,0));
    }

    public static int divideByZero(int x, int y){
        if(y!=0){
            return x/y;
        }else{
            return 0;
        }
    }

    public static int divide(int x, int y){
        try{
            return x/y;
        }catch (ArithmeticException e){
            return 0;
        }
    }
}
