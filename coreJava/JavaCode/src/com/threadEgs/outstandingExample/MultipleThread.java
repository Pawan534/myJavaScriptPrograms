package com.threadEgs.outstandingExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleThread {
    private static final int MAX_PASSWORD = 9999;

    public static void main(String[] args) {
        Random random =  new Random();
        Valut valut = new Valut(random.nextInt(MAX_PASSWORD));
        List<Thread> threadList = new ArrayList<>();
        threadList.add(new AscendingHackerThread(valut));
        threadList.add(new DecendingHackerThread(valut));
        threadList.add(new PoliceThread());

        for(Thread thread: threadList){
            thread.start();
        }
    }
    private static class Valut {
        private int password;

        public Valut(int password) {
            this.password = password;
        }

        public boolean isCorrect(int guess) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {

            }
            return (this.password == guess);
        }
    }

    private static abstract class HackerThread extends Thread {
        protected Valut valut;

        public HackerThread(Valut valut) {
            this.valut = valut;
            this.setName(this.getClass().getSimpleName());
            this.setPriority(Thread.MAX_PRIORITY);
        }

        @Override
        public void start() {
            System.out.println("Starting Thread " + this.getName());
            super.start();
        }
    }


    private static class AscendingHackerThread extends HackerThread {
        public AscendingHackerThread(Valut valut) {
            super(valut);
        }

        @Override
        public void run() {
            for (int guess = 0; guess < MAX_PASSWORD; guess++) {
                if (valut.isCorrect(guess)) {
                    System.out.println(this.getName() + "   guess password " + guess);
                    System.exit(0);
                }
            }
        }

    }

    private static class DecendingHackerThread extends HackerThread {
        public DecendingHackerThread(Valut valut) {
            super(valut);
        }

        @Override
        public void run() {
            for (int guess = MAX_PASSWORD; guess >= 0; guess--) {
                if (valut.isCorrect(guess)) {
                    System.out.println(this.getName() + "   guess password " + guess);
                    System.exit(0);
                }
            }
        }

    }

    private static class PoliceThread extends Thread{
        @Override
        public void run() {
            for (int i = 10; i > 0; i--) {
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){

                }
                System.out.println(i);
            }
            System.out.println("Game over");
            System.exit(0);
        }
    }

}


