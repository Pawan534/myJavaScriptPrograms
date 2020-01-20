package com.threadEgs.outstandingExample;

import java.util.Random;

public class DeadlockDemo {

    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        Thread t1 = new Thread(new TrainA(intersection));
        Thread t2 = new Thread(new TrainB(intersection));
        t1.start();
        t2.start();
    }

    public static class TrainA implements Runnable {
        private Intersection intersection;
        private Random random = new Random();

        public TrainA(Intersection intersection) {
            this.intersection = intersection;
        }

        @Override
        public void run() {
            while (true) {
                long sleepingTime = random.nextInt(5);
                try {

                    Thread.sleep(sleepingTime);
                } catch (InterruptedException e) {

                }
                intersection.takeRoadA();
            }
        }
    }

    public static class TrainB implements Runnable {
        private Intersection intersection;
        private Random random = new Random();

        public TrainB(Intersection intersection) {
            this.intersection = intersection;
        }

        @Override
        public void run() {
            while (true) {
                long sleepingTime = random.nextInt(5);
                try {

                    Thread.sleep(sleepingTime);
                } catch (InterruptedException e) {

                }
                intersection.takeRoadB();
            }
        }
    }


    public static class Intersection {
        private Object roadA = new Object();
        private Object roadB = new Object();

        public void takeRoadA() {
            synchronized (roadA) {
                System.out.println("Road A is locked by thread --> " + Thread.currentThread().getName());
                synchronized (roadB) {
                    System.out.println("Train is passing through Road A -->" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {

                    }
                }
            }
        }

        public void takeRoadB() {
            synchronized (roadB) {
                System.out.println("Road B is locked by thread --> " + Thread.currentThread().getName());
                synchronized (roadA) {
                    System.out.println("Train is passing through Road B -->" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {

                    }
                }
            }
        }
    }


}
