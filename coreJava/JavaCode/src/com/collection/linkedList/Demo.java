package com.collection.linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Alberta");
        linkedList.add("Sydney");
        linkedList.add("British Columbia");
        linkedList.add("Yukon");
        linkedList.add("Darwin");
        printList(linkedList);
        System.out.println("\nAdding new element\n");
        linkedList.add(3, "Alice");
        linkedList.add("Darwin");
        printList(linkedList);
        System.out.println("\n Removing 4th index\n");
        linkedList.remove(4);
        linkedList.addFirst("Added first");
        printList(linkedList);
        linkedList.removeFirst();
        printList(linkedList);

        System.out.println("Peek method " + linkedList.peek() + " peek first -> " + linkedList.peekFirst() + " peek last -->" + linkedList.peekLast());
        System.out.println(linkedList.poll() + " poll last " + linkedList.pollLast());
//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.add("Pawan");
//        arrayList.add("Krish");
//        arrayList.add("Swaroop");
//        arrayList.add("Jay");
//        printList(arrayList);
//        arrayList.add(1, "Sri");
//        printList(arrayList);
    }

    public static void printList(LinkedList<String> li){
        Iterator<String> iterator = li.iterator();
        int count=0;
        while (iterator.hasNext()){
            count++;
            System.out.println("Here am at index --> " + count +" : "+ iterator.next());
        }
        System.out.println("********************************");
    }

//    public static void printList(ArrayList<String> li){
//        Iterator<String> iterator = li.iterator();
//        while (iterator.hasNext()){
//            System.out.println("Here is --> " + iterator.next());
//        }
//        System.out.println("********************************");
//    }

}
