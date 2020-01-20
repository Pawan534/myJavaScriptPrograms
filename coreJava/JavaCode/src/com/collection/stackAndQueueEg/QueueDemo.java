package com.collection.stackAndQueueEg;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> myQueueData = new LinkedList<>();
        myQueueData.add("Kris");
        myQueueData.add("Joe");
        myQueueData.add("Adam");
        System.out.println(myQueueData);
        //System.out.println(myQueueData.remove());
        System.out.println(myQueueData.poll());
        System.out.println(myQueueData);
        myQueueData.add("Kris");
        System.out.println(myQueueData.remove());
        System.out.println(myQueueData);

    }
}
