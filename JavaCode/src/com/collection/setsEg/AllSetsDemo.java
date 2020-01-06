package com.collection.setsEg;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AllSetsDemo{
    public static void main(String[] args) {

        Set<String> eg = new HashSet<>();
        eg.add("Krish");
        eg.add("Pawan");
        eg.add("Seenu");
        eg.add("Sammy");
        eg.add("Anu");
        eg.add("Raju");


        Set<String> eg1 = new LinkedHashSet<>();
        eg1.add("Krish");
        eg1.add("Pawan");
        eg1.add("Seenu");
        eg1.add("Sammy");
        eg1.add("Anu");
        eg1.add("Raju");


        Set<String> eg2 = new TreeSet<>();
        eg2.add("Krish");
        eg2.add("Pawan");
        eg2.add("Seenu");
        eg2.add("Sammy");
        eg2.add("Anu");
        eg2.add("Raju");

        System.out.println("Hash set data ==> " + eg);
        System.out.println("Linked Hash set data ==> " + eg1);
        System.out.println("Tree Hash set data ==> " + eg2);
    }

}

