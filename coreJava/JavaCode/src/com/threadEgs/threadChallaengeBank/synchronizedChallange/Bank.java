package com.threadEgs.threadChallaengeBank.synchronizedChallange;

public class Bank {

    private double balance;
    private String accountNumber;


    public Bank(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    //Added synchronised to make thread safe
//    public synchronized void deposit(double amt){
//        balance += amt;
//    }
//
//    public synchronized void withdraw(double amt){
//        balance-=amt;
//    }


    public synchronized void deposit(double amt) {
        synchronized (this) {
            balance += amt;
        }
    }

    public synchronized void withdraw(double amt) {
        synchronized (this) {
            balance -= amt;
        }
    }

    public void displayBal() {
        System.out.println("Total Balance " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account Number " + accountNumber);
    }
}