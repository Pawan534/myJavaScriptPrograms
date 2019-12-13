package com.javabasic;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes<0){
            System.out.println("Invalid Value");
        } else{
            double totalMegaBytes = (kiloBytes/1024d);
            System.out.println(totalMegaBytes);
            int megaBytes = (int)Math.floor(totalMegaBytes);
            int kiloByte = (kiloBytes - megaBytes*1024);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloByte + " KB");
        }
    }
}