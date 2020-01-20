package com.lambdaAndStreams.streamEg;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String myString = "Let's split this into Array";
        String[] data = myString.split(" ");
        Arrays.stream(data).forEach(t-> System.out.println(t));
    }
}
