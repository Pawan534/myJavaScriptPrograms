package com.lambdaAndStreams.lambdaExpression.lambdaDemo;

public class DemoRunnable {
    public static void main(String[] args) {

        new Thread(new CodeRunTest()).start();

        new Thread(()-> {
            System.out.println("Created Run method using Lambda express");
        }).start();
    }

    public static class CodeRunTest implements Runnable{
        @Override
        public void run() {
            System.out.println("Runnable method");
        }
    }
}
