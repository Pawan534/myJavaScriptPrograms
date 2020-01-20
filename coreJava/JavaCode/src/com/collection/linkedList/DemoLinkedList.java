package com.collection.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class DemoLinkedList {

    public static void main(String[] args) {
        List<Integer> li = new LinkedList<>();
        li.add(12);
        li.add(2);
        li.add(1);
        li.add(2);
        System.out.println(li);
        UnaryOperator<String> t = s -> s.toUpperCase();
        System.out.println(t.apply("sdfsd"));

    }
}
