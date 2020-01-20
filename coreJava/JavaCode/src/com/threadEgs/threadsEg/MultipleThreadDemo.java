package com.threadEgs.threadsEg;

public class MultipleThreadDemo {
    public static void main(String[] args) {

        Countdown countdown = new Countdown();
        CountDownThread t1 =  new CountDownThread(countdown);
        t1.setName("Thread 1");

        CountDownThread t2 =  new CountDownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class Countdown {
    public void doCount() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }
        for(int i=10; i>0; i--){
            System.out.println(color + ThreadColor.currentThread().getName() + " : i = " + i    );
        }
    }
}


class CountDownThread extends Thread{
    private Countdown threadCount;
    public CountDownThread(Countdown down){
        threadCount = down;
    }

    public void run(){
        threadCount.doCount();
    }
}
