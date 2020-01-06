package com.collection.mapEgs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();
        Map<String, String> myLinkedMap = new LinkedHashMap<>();
        Map<String, String> myTreeMap = new TreeMap<>();
        
        myMap.put("K", "Karan");
        myMap.put("P", "Pune");
        myMap.put("A", "Aurangabad");
        myMap.put("C", "Calcutta");
        myMap.put("F", "Fathepur");
        myMap.put("AA", "Aurad");

        myLinkedMap.put("K", "Karan");
        myLinkedMap.put("P", "Pune");
        myLinkedMap.put("A", "Aurangabad");
        myLinkedMap.put("C", "Calcutta");
        myLinkedMap.put("F", "Fathepur");
        myLinkedMap.put("AA", "Aurad");


        myTreeMap.put("K", "Karan");
        myTreeMap.put("P", "Pune");
        myTreeMap.put("A", "Aurangabad");
        myTreeMap.put("C", "Calcutta");
        myTreeMap.put("F", "Fathepur");
        myTreeMap.put("AA", "Aurad");


        System.out.println("Data stored in Hash Map format");
        System.out.println(myMap);

        System.out.println("Data stored in Linked Map format");
        System.out.println(myLinkedMap);

        System.out.println("Data stored in Tree Map format");
        System.out.println(myTreeMap);

    }
}
