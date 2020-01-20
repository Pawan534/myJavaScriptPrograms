package com.oops.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20, 5);
        Case theCase = new Case("228" , "Dell", "248", dimensions);
        Monitor monitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2420, 1440));

        MotherBoard motherBoard = new MotherBoard("BJ-198", "Asus", 2,6, "v2.44");

        PC pc = new PC(theCase, monitor, motherBoard);
        pc.getMonitor().drawPixelAt(1500, 1200, "red");

        pc.getMotherBoard().loadProgram("Windows 10.1");

        pc.getTheCase().pressPowerButton();
    }
}
