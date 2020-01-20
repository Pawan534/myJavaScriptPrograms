package com.threadEgs.producerConsumer;

import java.util.List;

import static com.threadEgs.producerConsumer.Main.EOF;

public class Consumer implements Runnable {
    private List<String> consumerBuffer;
    private String color;

    public Consumer(List<String> consumerBuffer, String color) {
        this.consumerBuffer = consumerBuffer;
        this.color = color;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (consumerBuffer) {
                if (consumerBuffer.isEmpty()) {
                    continue;
                }
                if (consumerBuffer.get(0).equals(EOF)) {
                    System.out.println(color + "Exiting");
                    break;
                } else {
                    System.out.println(color + "Removed.." + consumerBuffer.remove(0));
                }
            }
        }

    }
}
