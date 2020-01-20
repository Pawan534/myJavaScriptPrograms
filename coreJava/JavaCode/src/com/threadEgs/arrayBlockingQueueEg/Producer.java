package com.threadEgs.arrayBlockingQueueEg;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements Runnable {
    private ArrayBlockingQueue<String> bufferProducer;
    private String color;

    public Producer(ArrayBlockingQueue<String> bufferProducer, String color) {
        this.bufferProducer = bufferProducer;
        this.color = color;
    }
    @Override
    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5", "6", "7"};
        for (String num : nums) {
            try {
                System.out.println(color + "Adding..." + num);
                bufferProducer.put(num);
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer has been interrupted");
            }
        }
        System.out.println(color + "Adding EOF and exiting ...");
        try {
            bufferProducer.put("EOF");
        } catch (InterruptedException e){
        }

    }
}
