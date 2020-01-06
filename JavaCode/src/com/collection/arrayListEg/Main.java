package com.collection.arrayListEg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Theater theater = new Theater("PVR", 8, 12);

        List<Seat> list = theater.getSeat();
        theater.reserveSeat("H12");
        theater.reserveSeat("H12");
        theater.reserveSeat("H13");;
        Collections.reverse(list);
        for(Seat ob: list){
            System.out.print(ob.getSeatNumber() + " ");
        }
        System.out.println("\nMin Seat no. " + Collections.min(list).getSeatNumber());
        System.out.println("Max Seat no. " + Collections.max(list).getSeatNumber());

        Collections.shuffle(list);
        sortList(list);
        for(Seat ob: list){
            System.out.println(ob.getSeatNumber() + " " + ob.getPrice());
        }
        System.out.println("*******************");
        Collections.sort(list, Theater.PRICE_ORDER);

        for(Seat ob: list){
            System.out.println(ob.getSeatNumber() + "  $" + ob.getPrice());
        }

        List<Seat> newSeats = new ArrayList<>(theater.getSeat());
        System.out.println(newSeats.size());
        newSeats.add(new Seat("B11", 18.0));

    }

    // Sorting method
    public static void sortList(List<? extends Seat> list){
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i, j);
                }
            }
        }
    }

    public static class ArryListEg {

        private static ArrayList<String> groceryList = new ArrayList<String>();

        public static void main(String[] args) {
            addGroceryList("Veggie");
            addGroceryList("Potato");
            addGroceryList("Tomato");
            addGroceryList("Lemon");
            addGroceryList("Onions");
            addGroceryList("Mango");
            addGroceryList("Grapes");

            System.out.println("List of Grocery items");
            printGroceryList();


            modifyGroceryList(2, "Orange");
            System.out.println("\nList of Grocery items after modifying");
            printGroceryList();

            removeGroceryList(5);
            System.out.println("\nList of Grocery items after removing item");
            printGroceryList();

            System.out.println("\n");
            searchGroceryList("XYZ");
            searchGroceryList("Orange");


        }

        public static void addGroceryList(String item) {
            groceryList.add(item);
        }

        public static void printGroceryList(){
            for(int i=0; i<groceryList.size();i++){
                System.out.println( (i+1) + " --> " + groceryList.get(i));
            }
        }

        public static void modifyGroceryList(int pos, String item){

            groceryList.set(pos, item);
            System.out.println("Grocery list has been modifed at index " + (pos+1));
        }

        public static void removeGroceryList(int pos){
            String item = groceryList.get(pos);
            groceryList.remove(pos);
            System.out.println(item + " has been removed from grocery list");
        }

        public static void searchGroceryList(String item){
           boolean itemExist = groceryList.contains(item);
           int pos = groceryList.indexOf(item);
           if(itemExist){
               System.out.println(item +" has been found in grocery list at index -> " + (pos+1));
           } else {
               System.out.println(item +" is not found in grocery list");
           }
        }
    }
}
