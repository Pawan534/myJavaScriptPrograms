package com.threadEgs.threadPoolsEg;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable {
    private List<String> bufferProducer;
    private String color;
    private ReentrantLock producerLock;

    public Producer(List<String> bufferProducer, String color, ReentrantLock locker) {
        this.bufferProducer = bufferProducer;
        this.color = color;
        this.producerLock = locker;
    }

    @Override
    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5", "6", "7"};
        for (String num : nums) {
            try {
                System.out.println(color + "Adding..." + num);
                producerLock.lock();
                try {
                    bufferProducer.add(num);
                } finally {
                    producerLock.unlock();
                }
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer has been interrupted");
            }
        }
        System.out.println(color + "Adding EOF and exiting ...");
        producerLock.lock();
        try {
            bufferProducer.add("EOF");
        } finally {
            producerLock.unlock();
        }

    }
}
