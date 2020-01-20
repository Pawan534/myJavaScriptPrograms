package com.threadEgs.threadsEg;

import static com.threadEgs.threadsEg.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hey..!! this is My runnable class, run() method is implemented");
    }
}
