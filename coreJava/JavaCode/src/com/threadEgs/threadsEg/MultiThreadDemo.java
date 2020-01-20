package com.threadEgs.threadsEg;

public class MultiThreadDemo {
    public static void main(String[] args) {

        CountdownT countdown1 = new CountdownT();
        //CountdownT countdown2 = new CountdownT();
        CountDownThreadT t1 =  new CountDownThreadT(countdown1);
        t1.setName("Thread 1");

        CountDownThreadT t2 =  new CountDownThreadT(countdown1);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class CountdownT {
    int i;
    public  void doCount() {
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
        synchronized(this){
            for(i=10; i>0; i--){
                System.out.println(color + ThreadColor.currentThread().getName() + " : i = " + i    );
            }
        }


    }
}


class CountDownThreadT extends Thread{
    private CountdownT threadCount;
    public CountDownThreadT(CountdownT down){
        threadCount = down;
    }

    public void run(){
        threadCount.doCount();
    }
}
