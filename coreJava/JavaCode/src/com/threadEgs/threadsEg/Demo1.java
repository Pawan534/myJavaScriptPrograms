package com.threadEgs.threadsEg;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Started Thread");
        Thread anotherThread = new ThreadSampleDemo();
        anotherThread.start();
        System.out.println("Ended Thread");
    }
}
