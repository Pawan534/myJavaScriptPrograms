package com.generics.genericsEg3;

import java.util.Collection;

public class GenericDemoCompareable {


    public static <T extends Comparable<T>> T calculateMax(T t1, T t2){
        if(t1.compareTo(t2) > 0){
            return t1;
        }else{
            return t2;
        }
    }

    public static void main(String[] args) {

        System.out.println(calculateMax("Krish", "Andrew"));
        System.out.println(calculateMax(80, 10));

    }
}
