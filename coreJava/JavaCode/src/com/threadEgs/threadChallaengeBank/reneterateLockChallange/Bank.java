package com.threadEgs.threadChallaengeBank.reneterateLockChallange;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private  double balance;
    private String accountNumber;
    private Lock lock;


    public Bank(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.lock = new ReentrantLock();
    }

    //Added synchronised to make thread safe
//    public synchronized void deposit(double amt){
//        balance += amt;
//    }
//
//    public synchronized void withdraw(double amt){
//        balance-=amt;
//    }


    public void deposit(double amt) {
        boolean status=false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amt;
                    status=true;
                } finally {
                    lock.unlock();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + " --> Transaction status of deposit: " + status);
    }

    public void withdraw(double amt) {
        boolean status = false;
        lock.lock();
        try {
            balance -= amt;
            status = true;
        } finally {
            lock.unlock();
        }
        System.out.println(Thread.currentThread().getName() + " -->Transaction status of withdraw: " + status);
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