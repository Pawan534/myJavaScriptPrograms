package com.threadEgs.outstandingExample;

//In the below demo, we are seeing Race condition, as we iterating x & y at same time but still we are seeing difference in value
//By using volatile keyword we can resolved the race issue
public class DataRaceDemo {
    public static void main(String[] args) {

        SharedClass sharedResource = new SharedClass();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<Integer.MAX_VALUE; i++){
                    sharedResource.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<Integer.MAX_VALUE; i++){
                    sharedResource.checkForDataRace();
                }
            }
        });

        t1.start();
        t2.start();

    }

    public static class SharedClass{
        static volatile int count=0;
        private  int x=0, y=0;
        public void increment(){
            x++;
            y++;
        }
        public void checkForDataRace(){
            if(y>x){
                count++;
                System.out.println("y>x - Data Race is detected --> " + count);
            }
        }
    }



}
