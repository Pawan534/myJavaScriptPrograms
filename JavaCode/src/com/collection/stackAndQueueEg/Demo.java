package com.collection.stackAndQueueEg;

import java.util.Stack;

public class Demo {

    public static void main(String[] args) {
        Stack<Integer> stackData = new Stack<>();

        stackData.push(10);
        stackData.push(15);
        stackData.push(160);
        stackData.push(13);
        System.out.println("My Stack data --> " + stackData);
        System.out.println("Removed data --> " +stackData.pop());
        System.out.println("After removing my Stack data --> " +stackData);
        System.out.println("Peek method --> " + stackData.peek());
        System.out.println(stackData.empty());
        System.out.println(stackData.search(15));
        stackData.add(1, 100);

        System.out.println("My Stack data --> " + stackData);

    }

}
