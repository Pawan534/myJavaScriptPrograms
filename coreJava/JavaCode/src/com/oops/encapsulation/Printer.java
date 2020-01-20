package com.oops.encapsulation;

public class Printer {

    private int tonerLevel;
    private int noOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.noOfPagesPrinted = 0;
        this.duplex = duplex;
    }


    public int addToner(int tonerAmt) {
        if (tonerAmt > 0 && tonerAmt <= 100) {
            if ((this.tonerLevel + tonerAmt) > 100) {
                return -1;
            } else {
                this.tonerLevel += tonerAmt;
                return this.tonerLevel;
            }
        } else
            return -1;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint/=2;
            System.out.println("Printing in duplex mode");
        }
        this.noOfPagesPrinted += pagesToPrint;
        return this.noOfPagesPrinted;

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
