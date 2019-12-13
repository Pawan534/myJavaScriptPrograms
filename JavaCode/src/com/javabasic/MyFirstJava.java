package com.javabasic;

public class MyFirstJava {

    public static void main(String arg[]){
        System.out.println("My First java file");
        a = 150;
        System.out.print(a);
        System.out.println("----------->");

        byte bt = 127;
        short st = 30000;
        int itValue = 2147483647;
        int minIntValue =  Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        int byteValue = Integer.BYTES;
        byte minValue = (byte)(-128*2);
        float myFloatValue = 8.9f;

        System.out.println("User defined integer value: " + (itValue+1));
        System.out.println("Minimum integer value: " + minIntValue);
        System.out.println("Maximum integer value: " + maxIntValue);

        System.out.println("Byte value: " + Byte.BYTES);
        System.out.println("Byte Min value: " + Byte.MIN_VALUE);
        System.out.println("Short Byte value: " + Short.BYTES);
        System.out.println("Integer Byte value: " + byteValue);
        System.out.println("Long byte value: " + Long.BYTES);
        System.out.println("My float value " + (float)(myFloatValue + 0.99));

        int myBitWiseNum1 = 25, myBitWiseNum2 = 19, myBitWiseNum3, myBitWiseNum4;
        myBitWiseNum3 = myBitWiseNum1 & myBitWiseNum2;
        myBitWiseNum4 = myBitWiseNum1 | myBitWiseNum2;
        System.out.println("----->" + myBitWiseNum3);
        System.out.println("<----->" + myBitWiseNum4);
        System.out.println("<----------------->" + (25 >> 2));


    }
    static int a = 10;
}
