package com.threadEgs.threadChallaengeBank.bankChallenge;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NewBankAccount {
    private double balance;
    private String accountNumber;
    private Lock lock = new ReentrantLock();
    private static int i=0, j=0, k=0;

    public NewBankAccount(String accountNumber,double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public boolean deposit(double amount) {
        if (lock.tryLock()) {
            try {
                try {
                    // Simulate database access
                    System.out.println("i --> " + i++);
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                }
                balance += amount;
                System.out.printf("%s: Deposited %f\n", Thread.currentThread().getName(), amount);
                return true;
            } finally {
                lock.unlock();
            }
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (lock.tryLock()) {
            try {
                try {
                    // Simulate database access
                    System.out.println("j --> " + j++);
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                }
                balance -= amount;
                System.out.printf("%s: Withdrew %f\n", Thread.currentThread().getName(), amount);
                return true;
            } finally {
                lock.unlock();
            }
        }

        return false;
    }

    public boolean transfer(NewBankAccount destinationAcct, double amt){
        System.out.println("k --> " + k++);
        if(withdraw(amt)){
            if(destinationAcct.deposit(amt)){
                return true;
            }else{
                System.out.printf("%s: Destination amount is busy. Refunding money\n", Thread.currentThread().getName());
                deposit(amt);
            }
        }
        return false;
    }

    public double getBal(){
        return balance;
    }

}
