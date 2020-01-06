package com.javaExceptionsEg;

public class BinaryEg {

    private static final String ANIS_RESET = "\u001B[0m";
    private static final String ANIS_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        int x = 922342959;
        writeInt(x);

    }

    private static void writeInt(int x){

        int y;

        display(x >>> 24);
        display(x >>> 16);
        display(x >>> 8);
        display(x >>> 0);
    }


    public static void display(int x){
        String all = String.format("%32s", Integer.toBinaryString(x)).replace(" ", "0");
        String coluoredBinary = all.substring(0, 18) + ANIS_PURPLE + all.substring(18) + ANIS_RESET;
        int y = x & 0xFF;
        System.out.println(String.format("%10d and 0xFF is %8s \t %10d is ", y, Integer.toBinaryString(y), x)+coluoredBinary);
    }
}
