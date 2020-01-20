package com.threadEgs.arrayBlockingQueueEg;

import java.util.concurrent.ArrayBlockingQueue;

import static com.threadEgs.producerConsumer.Main.EOF;

public class Consumer implements Runnable {
    private ArrayBlockingQueue<String> consumerBuffer;
    private String color;
    // private ReentrantLock consumerLock;

    public Consumer(ArrayBlockingQueue<String> consumerBuffer, String color) {
        this.consumerBuffer = consumerBuffer;
        this.color = color;
    }

    @Override
    public void run() {
        synchronized (consumerBuffer) {
            while (true) {
                try {
                    if (consumerBuffer.isEmpty()) {
                        continue;
                    }
                    if (consumerBuffer.peek().equals(EOF)) {
                        System.out.println(color + "Exiting");
                        break;
                    } else {
                        System.out.println(color + "Removed.." + consumerBuffer.take());
                    }
                } catch (InterruptedException e) {

                }

            }

        }
    }
}
