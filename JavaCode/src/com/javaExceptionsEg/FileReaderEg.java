package com.javaExceptionsEg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;

public class FileReaderEg {
    private static Locations locations = new Locations();
    public static void main(String[] args) {
        locations.put(0, new Location(0, "You are sitting in-front of laptop"));
        locations.put(1,new Location(1, "You are standing at the end of a road"));
        locations.put(2, new Location(2, "You at top of the  hill"));
        locations.put(3,new Location(3, "you are inside the building"));
        locations.put(4,new Location(4, "You are in the valley"));
        locations.put(5,new Location(5, "You are in the forset"));
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader("directionTest.txt"));
            sc.useDelimiter(",");
            while (sc.hasNextLine()){
                String loc =sc.next();
                sc.skip(sc.delimiter());
                String desc = sc.nextLine();
                System.out.println("loc --> " + loc);
                System.out.println("desc --> " + desc);
            }
            sc.close();

        }catch (FileNotFoundException e){
            System.out.println("File not find");
        }

        System.out.println("************************************");

        try{
            sc = new Scanner(new BufferedReader(new FileReader("directionTest.txt")));
            sc.useDelimiter(" , ");
            while (sc.hasNext()){
                int loc = sc.nextInt();
                sc.skip(sc.delimiter());
                String direc = sc.next();
                sc.skip(sc.delimiter());
                String des = sc.nextLine();
                System.out.println("Imported sucessfully");
                System.out.println("loc --> " + loc + " , direction --> " + direc + " , destination --> " + Integer.parseInt(des));
                System.out.println("desc --> " + direc);
                Location location = locations.get(loc);
                locations.put(loc, location);
            }



        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }


        for (Map.Entry<Integer, Location> location:locations.entrySet()){

            System.out.println(location.getKey() + " " + location.getValue().getLocationId() + " " + location.getValue().getDescription());


        }
    }

}
