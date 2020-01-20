package com.threadEgs.outstandingExample;

public class StockInventoryConcurrencyDemo {

    //If we add synchronised as keyword then no need to use method join()
    public static void main(String[] args) throws InterruptedException {

        ItemInventory itemInventory = new ItemInventory(100);

        Thread t1 = new Thread(new IncrementInventory(itemInventory, 1000));
        Thread t2 = new Thread(new DecrementInventory(itemInventory, 1000));
        t1.start();
        t2.start();
//        t1.join();
//        t2.join();
        System.out.println("Total items left in inventory --> " + itemInventory.item);

    }


    public static class IncrementInventory implements Runnable {

        private ItemInventory itemInventory;
        private int itemNewStock;

        public IncrementInventory(ItemInventory itemInventory, int purchasedItem) {
            this.itemInventory = itemInventory;
            this.itemNewStock = purchasedItem;
        }

        @Override
        public void run() {
            for (int i = 0; i < itemNewStock; i++) {
                itemInventory.increment();
            }
        }
    }

    public static class DecrementInventory implements Runnable {

        private ItemInventory itemInventory;
        private int purchasedItem;

        public DecrementInventory(ItemInventory itemInventory, int purchasedItem) {
            this.itemInventory = itemInventory;
            this.purchasedItem = purchasedItem;
        }

        @Override
        public void run() {
            for (int i = 0; i < purchasedItem; i++) {
                itemInventory.decrement();
            }
        }
    }


    public static class ItemInventory {
        private int item;
        Object lock = new Object();

        public ItemInventory(int item) {
            this.item = item;
        }

        public synchronized void increment() {
            item++;
        }

        public synchronized void decrement() {
            item--;
        }

//        public void increment(){
//            synchronized (this.lock){
//                item++;
//            }
//        }
//
//        public void decrement(){
//             synchronized (this.lock){
//                 item--;
//             }
//        }


    }

}
