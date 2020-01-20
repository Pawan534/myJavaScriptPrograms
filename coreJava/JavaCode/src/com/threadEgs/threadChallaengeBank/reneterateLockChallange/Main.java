package com.threadEgs.threadChallaengeBank.reneterateLockChallange;

//Challenge1: Create a bank joint account, and make try to make transaction by two members on same account at same time
public class Main {
    public static void main(String[] args) {

        final Bank acct = new Bank("12345-678", 1000.00);

//        Thread thread1 = new Thread() {
//            public void run() {
//                acct.deposit(300.00);
//                acct.withdraw(50.00);
//            }
//        };
//
//        Thread thread2 = new Thread() {
//            public void run() {
//                acct.deposit(203.75);
//                acct.withdraw(100.00);
//            }
//        };

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                acct.deposit(300.00);
                acct.withdraw(200.00);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                acct.deposit(200);
                acct.withdraw(100.00);

            }
        });

        thread1.start();
        thread2.start();

    }
}
