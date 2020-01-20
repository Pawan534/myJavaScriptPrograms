package com.generics.genericsEg3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsBoundedEg {

    public static void print(Collection< ? extends Shape> c){

        for (Object o: c){

            System.out.println(o.getClass());
            System.out.println(o.toString());
        }
    }


    public static void main(String[] args) {

        List<Circle> li = new ArrayList<>();
        li.add(new Circle());
        print(li);
        (new Circle()).draw();
    }
}





interface Shape{
    public void draw();
}
