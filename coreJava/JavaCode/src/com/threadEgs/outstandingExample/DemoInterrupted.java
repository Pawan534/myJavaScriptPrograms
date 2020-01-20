package com.threadEgs.outstandingExample;

import java.math.BigInteger;

public class DemoInterrupted {
    public static void main(String[] args) throws Exception {

        Thread thread = new Thread(new SampleTask(new BigInteger("20"), new BigInteger("10")));
        thread.start();
        Thread.sleep(500);
        thread.interrupt();
    }


    private static class SampleTask implements Runnable{
        private BigInteger base;
        private BigInteger power;

        public SampleTask(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.println(base + " pow " + power + " = "+pow(base,power));
        }

        private BigInteger pow(BigInteger base, BigInteger power){
            BigInteger res = BigInteger.ONE;

            for(BigInteger i = BigInteger.ZERO; i.compareTo(power)!=0; i=i.add(BigInteger.ONE)){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Prematurely interrupted");
                    return BigInteger.ZERO;
                }
                res = res.multiply(base);
            }
            return res;
        }
    }
}
