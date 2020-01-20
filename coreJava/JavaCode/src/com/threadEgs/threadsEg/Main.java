package com.threadEgs.threadsEg;

import static com.threadEgs.threadsEg.ThreadColor.ANSI_GREEN;
import static com.threadEgs.threadsEg.ThreadColor.ANSI_PURPLE;
import static com.threadEgs.threadsEg.ThreadColor.ANSI_RED;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "MultipleThread Thread is starting");
        final Thread myThread = new ThreadSampleDemo();
        myThread.setName("Hey its me :-)");
        myThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN +"Hey.! this is anonymous thread class");
            }
        }.start();

        Thread myRunnableThread =  new Thread(new MyRunnable(){
            @Override
            public void run(){
                System.out.println(ANSI_RED + "Hey..! Its Anonymous Runnable class implementation from MultipleThread");
                try{
                    myThread.join(100);
                    System.out.println(ANSI_RED + "Another thread terminated, so I'm running again");
                }catch (InterruptedException e){
                    System.out.println(ANSI_RED + "I couldn't wait after all, I was interrupted");
                }
            }
        });
        myRunnableThread.start();

        // Below step is used to interrupt the thread
        myThread.interrupt();
        System.out.println(ANSI_PURPLE + "MultipleThread Thread is ended");
    }
}
