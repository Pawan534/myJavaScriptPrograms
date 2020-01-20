package com.threadEgs.producerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String EOF = "EOF";
    public static void main(String[] args) {

        List<String> buffer = new ArrayList<>();

        Producer producer = new Producer(buffer, ThreadColor.ANSI_RED);
        Consumer consumer1 = new Consumer(buffer, ThreadColor.ANSI_PURPLE);
        Consumer consumer2 = new Consumer(buffer, ThreadColor.ANSI_CYAN);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();


    }
}
