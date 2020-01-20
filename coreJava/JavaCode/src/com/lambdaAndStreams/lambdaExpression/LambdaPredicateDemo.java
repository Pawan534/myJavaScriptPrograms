package com.lambdaAndStreams.lambdaExpression;

import java.util.function.IntPredicate;


public class LambdaPredicateDemo {

    public static void main(String[] args) {

        IntPredicate greaterThan100 = i -> i>40;

        IntPredicate lessThan50 = i -> i<50;


        System.out.println(greaterThan100.and(lessThan50).test(45));
        System.out.println(greaterThan100.and(lessThan50).test(200));

    }


}
