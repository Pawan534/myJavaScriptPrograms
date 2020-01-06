package com.collection.mapEg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        Map<String, String> lang =  new HashMap<>();
        lang.put("Java", "Object oriented programming language");
        lang.put("Python", "High level programming lang with dynamic sematics");
        lang.put("Algol", "An algorithm programming lang");
        lang.put("Java Script", "Its a scripting lang");
        lang.put("JS", "Its a scripting lang");
        System.out.println(lang);
        System.out.println(lang.containsValue("OOPS"));

        //Below loop is getting iterating based on the keys
        for (String key: lang.keySet()){
            System.out.println(key + " : " + lang.get(key));
        }

        System.out.println("***********************");
        lang.remove("Java Script");
        lang.replace("JS", "Scripting lang");
        Set myList = lang.entrySet();
        Iterator li = myList.iterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }
    }
}
