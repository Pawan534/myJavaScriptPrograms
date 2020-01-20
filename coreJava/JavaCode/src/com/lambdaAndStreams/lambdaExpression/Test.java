package com.lambdaAndStreams.lambdaExpression;


import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        new Thread(()-> {
            System.out.println("This is my class");
        }).start();

        Consumer<String> a = (s1)-> System.out.println(s1.toUpperCase());
        Consumer<String> b = (s2)-> System.out.println(s2);
        a.accept("Sdsfdsf");
        b.accept("dsfs");

        BiConsumer<Integer, Integer> sum = (n1, n2)-> System.out.println("Sum :" + n1+n2);
        BiConsumer<Integer, Integer> multiply = (n1, n2)-> System.out.println("Multiply :" + n1*n2);
        sum.accept(10, 20);

        Predicate<Integer> p1 = i-> i%2==0;
        Predicate<Integer> p2 = i-> i%5==0;
        System.out.println(p1.test(2));
        System.out.println(p2.test(10));
        System.out.println(p1.or(p2).negate().test(1));


    }
}
