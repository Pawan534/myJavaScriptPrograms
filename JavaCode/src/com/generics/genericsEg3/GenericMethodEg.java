package com.generics.genericsEg3;

public class GenericMethodEg  {

    public <T> void showArray(T[] arry){
        for (T item: arry){
            System.out.print(item.toString() + " ");
        }
        System.out.println(" ");
    }


    public <T> T showItem(T t){
        System.out.println(t.toString());
        return t;
    }




}
