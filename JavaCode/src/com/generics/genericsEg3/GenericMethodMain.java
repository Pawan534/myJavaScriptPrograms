package com.generics.genericsEg3;

public class GenericMethodMain {
    public static void main(String[] args) {
        GenericMethodEg genericMethod = new GenericMethodEg();

        String name = "This is string";
        int num = 100;
        Integer[] arrInt = {10, 20, 30, 40};
        String[] arrStr = {"Kumar", "Krish", "Karthik", "Keshav"};

        genericMethod.showItem(name);
        genericMethod.showItem(num);

        genericMethod.showArray(arrInt);
        genericMethod.showArray(arrStr);
    }




}
