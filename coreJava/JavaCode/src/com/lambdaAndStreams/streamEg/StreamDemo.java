package com.lambdaAndStreams.streamEg;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> listNames = Arrays.asList("Krish", "Jordge", "Grany", "German", "Geos", "Peter", "garry","German", "Krish", "Pavan", "Praveen");
        //It wont prit garry as its start with lower case
        Map<Integer, String> mapData = new HashMap<>();
        mapData.put(1, "Krish");
        mapData.put(2, "Jordge");
        mapData.put(5, "Grany");
        mapData.put(3, "German");
        mapData.put(6, "Krish");
        mapData.put(4, "Geos");

        System.out.println("===========================================");
        listNames.forEach(item->{
            if(item.startsWith("G")){
                System.out.println(item);
            }
        });


        //Streams

        System.out.println("===========================================");
        listNames.stream().map(String::toUpperCase).filter(s->s.startsWith("G")).sorted().forEach(System.out::println);

        System.out.println("===========================================");
        System.out.println("Distinct values");
        listNames.stream().sorted().distinct().forEach(System.out::println);


        System.out.println("===========================================");
        List<String> myNewList = listNames.stream().map(String::toUpperCase).filter(s->s.startsWith("P")).sorted().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println(myNewList);


        System.out.println("===========================================");
        mapData.entrySet().stream().filter(item -> item.getValue().startsWith("K")).forEach(item-> System.out.println(item.getKey() + " " + item.getValue()));

        System.out.println("===========================================");
        String res = mapData.entrySet().stream().findFirst().get().getValue();
        System.out.println(res);

        List<Integer> d = Arrays.asList(3,6,8,5,1,7,2,10);
        Optional<Integer> max = d.stream().limit(2).reduce((x, y)->x>y?x:y);
        System.out.println(max); //Res: 8
        Optional<Integer> max1 = d.stream().skip(3).reduce((x, y)->x>y?x:y);
        System.out.println(max1); //Res: 10

        System.out.println("Any match --> " + d.stream().anyMatch(a-> a>5));
        System.out.println("Any find first --> " + d.stream().filter(a-> a>5).findFirst());
        System.out.println("Any find any --> " + d.stream().filter(a-> a>5).findAny());
        System.out.println("Any match --> " + d.stream().allMatch(a-> a>5));
        System.out.println(IntStream.range(1,10).max());
        System.out.println(IntStream.rangeClosed(1,20).max());

    }
}
