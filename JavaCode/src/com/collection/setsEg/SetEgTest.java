package com.collection.setsEg;

import java.util.HashSet;
import java.util.Set;

public class SetEgTest {
    public static void main(String[] args) {

        Set<String> eg = new HashSet<>();
        eg.add("Krish");
        eg.add("Pawan");
        eg.add("Seenu");
        eg.add("Sammy");
        eg.add("Raju");

        System.out.println(eg);
        Set<String> eg1 = new HashSet<>();
        eg1.add("Raghu");
        eg1.add("Krish");
        eg1.add("Pawan");
        eg1.add("Seenu");
        eg1.add("Sammy");
        eg1.add("Raju");


        System.out.println("eg --> " + eg);
        System.out.println("eg1 --> " + eg1);
        eg1.retainAll(eg);
        System.out.println("After Retain");
        System.out.println("eg --> " + eg);
        System.out.println("eg1 --> " + eg1);





    }
}
