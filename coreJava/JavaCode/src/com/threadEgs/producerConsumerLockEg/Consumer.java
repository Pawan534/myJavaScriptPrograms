package com.threadEgs.producerConsumerLockEg;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import static com.threadEgs.producerConsumer.Main.EOF;

public class Consumer implements Runnable {
    private List<String> consumerBuffer;
    private String color;
    private ReentrantLock consumerLock;

    public Consumer(List<String> consumerBuffer, String color, ReentrantLock locker) {
        this.consumerBuffer = consumerBuffer;
        this.color = color;
        this.consumerLock = locker;
    }

    @Override
    public void run() {
        int counter =0;
        while (true) {
            consumerLock.lock();
            try {
                if (consumerBuffer.isEmpty()) {
                    continue;
                }
                System.out.println("Counter --> " + counter);
                if (consumerBuffer.get(0).equals(EOF)) {
                    System.out.println(color + "Exiting");
                    break;
                } else {
                    System.out.println(color + "Removed.." + consumerBuffer.remove(0));
                }
            } finally {
                consumerLock.unlock();
            }
            counter++;
        }

    }
}
