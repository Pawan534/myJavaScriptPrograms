package com.threadEgs.threadChallaengeBank.bankChallenge;

public class Transfer implements Runnable {
    private NewBankAccount souceAct, destinationAct;
    private double amt;
    private static int counter=0;


    public Transfer(NewBankAccount souceAct, NewBankAccount destinationAct, double amt) {
        this.souceAct = souceAct;
        this.destinationAct = destinationAct;
        this.amt = amt;
    }

    @Override
    public void run(){
        while (!souceAct.transfer(destinationAct, amt))
            continue;
        System.out.printf("%s completed\n", Thread.currentThread().getName());
        System.out.println("Source bal " + souceAct.getBal());
        System.out.println("Destination bal " + destinationAct.getBal());
    }
}
