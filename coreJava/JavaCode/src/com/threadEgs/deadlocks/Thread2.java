package com.threadEgs.deadlocks;

import static com.threadEgs.deadlocks.Main.lock1;
import static com.threadEgs.deadlocks.Main.lock2;

public class Thread2 extends Thread {
    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println("Thread 2: Has Lock1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println("Thread 2: Waiting for lock 2");
            synchronized (lock2) {
                System.out.println("Thread 2: Has lock 1 and lock 2");
            }
            System.out.println("Thread 2: Release lock 2");
        }
        System.out.println("Thread 2: Released lock 1. Exiting...");
    }
}
