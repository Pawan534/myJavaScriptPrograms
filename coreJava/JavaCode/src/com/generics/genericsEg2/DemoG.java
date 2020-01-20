package com.generics.genericsEg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Calculation<T>{
     private T n1;

    public void setValue(T n1){
        this.n1 = n1;
    }

    public T getValue(){
        return this.n1;
    }

    public  void show(){
        System.out.println(n1.getClass().toString());
    }
}

public class DemoG {
    public static void main(String[] args) {
        Calculation<Double> obj = new Calculation<>();
        obj.setValue(10.11);
        obj.show();

        List<Integer> li = new ArrayList<>();
        li.add(90);
        li.add(12);
        li.add(16);
        li.add(121);
        li.add(9);

        Iterator it = li.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Collections.sort(li);

        System.out.println("Advance for loop");
        for(int l: li){
            System.out.println(l);
        }

        System.out.println("For each");

        li.forEach(System.out::println);
    }
}
