package com.collection.stackAndQueueEg;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Person> dataQ = new PriorityQueue<>();
        Person temp = new Person("Joe", 66);
        dataQ.add(temp);
        temp = new Person("Kevin", 32);
        dataQ.add(temp);

        temp = new Person("Adam", 12);
        dataQ.add(temp);

        temp = new Person("Anna", 22);
        dataQ.add(temp);

        System.out.println(dataQ);



    }
}
