package com.generics.genericsEg3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static javafx.scene.input.KeyCode.A;
import static javafx.scene.input.KeyCode.T;

public class GenericsSum {


    public static void sum(List<? extends Number> list){

        double res=0;

        for(Number num: list){
            res = res + num.doubleValue();
        }
        System.out.println("Sum of all num " + res);
    }

    public static void main(String[] args) {
        ArrayList<Integer> as = new ArrayList<>();
        Integer[] s = {10, 20, 310, 100, 101};
        as.addAll(Arrays.asList(s));
        sum(as);
        sum(Arrays.asList(1, 2, 3, 5, 6));
        sum(Arrays.asList(1.0, 2.0, 5.9));
        sum(Arrays.asList(10.23423, 23.232423423, 233132.1312312));
    }
}
