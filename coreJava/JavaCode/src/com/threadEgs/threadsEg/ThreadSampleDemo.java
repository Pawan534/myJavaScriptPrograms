package com.threadEgs.threadsEg;

import static com.threadEgs.threadsEg.ThreadColor.ANSI_BLUE;
import static com.threadEgs.threadsEg.ThreadColor.ANSI_CYAN;

public class ThreadSampleDemo extends Thread {

    @Override
    public void run() {
        System.out.println( ANSI_BLUE+ "ThreadSampleDemo class thread has been called " + currentThread().getName());
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("*********** " + e.getMessage() + " ***********");
            System.out.println("Another thread woke me up");
        }
        System.out.println(ANSI_BLUE + " 3 seconds has been passed");
    }
}
