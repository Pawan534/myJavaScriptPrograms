package com.threadEgs.threadMessagingEg;

import java.util.Random;

public class Writer implements Runnable {

    private Message messagner;

    public Writer(Message msg) {
        this.messagner = msg;
    }

    @Override
    public void run() {
        String msgs[] = {
                "Humpty Dumpty sat on Wall",
                "Humpty Dumpty had a great fall",
                "All the kings horses and all the kings men",
                "Could not put Humpty together again"
        };
        Random random = new Random();
        for (int i = 0; i < msgs.length; i++) {
            messagner.write(msgs[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {

            }
        }
        messagner.write("Finished");
    }
}
