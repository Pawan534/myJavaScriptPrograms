package com.lambdaAndStreams.lambdaExpression;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaSupplierConsumerDemo {
    public static void main(String[] args) {

        Random random = new Random();
        Supplier<Integer> randomSupplier = ()-> random.nextInt(1000);
        for(int i=0; i<10; i++) {
            System.out.println(randomSupplier.get());
        }

        Consumer<String> s1 = s-> s.toUpperCase();
        Consumer<String> s2 = s-> System.out.println(s);
        s1.andThen(s2).accept("Hello World");

    }
}
