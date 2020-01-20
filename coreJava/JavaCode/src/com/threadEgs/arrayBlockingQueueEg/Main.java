package com.threadEgs.arrayBlockingQueueEg;

import java.util.concurrent.*;

public class Main {
    public static final String EOF = "EOF";
    public static void main(String[] args) {

        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Producer producer = new Producer(buffer, ThreadColor.ANSI_RED);
        Consumer consumer1 = new Consumer(buffer, ThreadColor.ANSI_PURPLE);
        Consumer consumer2 = new Consumer(buffer, ThreadColor.ANSI_CYAN);

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_BLACK + " I have been printed for the callable class");
                return "This is the callable result";
            }
        });
        try {
            System.out.println(future.get());
        }catch (ExecutionException e){
            System.out.println("Something went wrong");
        }catch (InterruptedException e){
            System.out.println("Running thread has interrupted by some task");
        }
        executorService.shutdown();
//        new Thread(producer).start();
//        new Thread(consumer1).start();
//        new Thread(consumer2).start();


    }
}
