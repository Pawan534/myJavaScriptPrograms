package com.designPatterns;


import static com.designPatterns.NyPizza.Size.*;
import static com.designPatterns.Pizza.Topping.ONION;
import static com.designPatterns.Pizza.Topping.SAUSAGE;


public class DemoMain {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();

        System.out.println(pizza);
    }
}
