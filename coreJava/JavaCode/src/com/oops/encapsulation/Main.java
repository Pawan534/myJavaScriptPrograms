package com.oops.encapsulation;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(30, true);
        System.out.println("Initial page count = " +printer.getNoOfPagesPrinted());
        int pagesPrinted = printer.printPages(15);
        System.out.println("Page printed was " + pagesPrinted + " new total count for printer " + printer.getNoOfPagesPrinted() );


    }
}
