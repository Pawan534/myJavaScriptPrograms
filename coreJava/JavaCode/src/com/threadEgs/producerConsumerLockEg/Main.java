package com.threadEgs.producerConsumerLockEg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static final String EOF = "EOF";
    public static void main(String[] args) {

        List<String> buffer = new ArrayList<>();
        ReentrantLock myLock = new ReentrantLock();

        Producer producer = new Producer(buffer, ThreadColor.ANSI_RED, myLock);
        Consumer consumer1 = new Consumer(buffer, ThreadColor.ANSI_PURPLE, myLock);
        Consumer consumer2 = new Consumer(buffer, ThreadColor.ANSI_CYAN, myLock);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();


    }
}
