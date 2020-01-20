package com.threadEgs.producerConsumer;

import java.util.List;
import java.util.Random;

public class Producer implements Runnable {
    private List<String> bufferProducer;
    private String color;

    public Producer(List<String> bufferProducer, String color) {
        this.bufferProducer = bufferProducer;
        this.color = color;
    }

    @Override
    public  void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5", "6", "7"};
        for (String num : nums) {
            try {
                System.out.println(color + "Adding..." + num);
                synchronized (bufferProducer){
                    bufferProducer.add(num);
                }
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer has been interrupted");
            }
        }
        System.out.println(color + "Adding EOF and exiting ...");
        synchronized (bufferProducer){
            bufferProducer.add("EOF");
        }
    }
}
