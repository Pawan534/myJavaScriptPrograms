package com.javaExceptionsEg;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();
    //private static Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) throws IOException {

        Scanner scanner =  new Scanner(System.in);
        locations.put(0, new Location(0, "You are sitting in-front of laptop"));
        locations.put(1,new Location(1, "You are standing at the end of a road"));
        locations.put(2, new Location(2, "You at top of the  hill"));
        locations.put(3,new Location(3, "you are inside the building"));
        locations.put(4,new Location(4, "You are in the valley"));
        locations.put(5,new Location(5, "You are in the forset"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("Q", 0);


        locations.get(2).addExit("N", 5);
        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
        locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
        locations.get(5).addExit("Q", 0);

            FileWriter localFile = null;
            FileWriter direcFile = null;
            try {

                localFile = new FileWriter("locationsTest.txt");
                direcFile = new FileWriter("directionTest.txt");
                for(Location location: locations.values()){
                    localFile.write(location.getDescription() + " " + location.getLocationId() + "\n");
                    for(String direction : location.getExist().keySet()){
                        direcFile.write(location.getLocationId() + " , " + direction + " , "+ location.getExist().get(direction) + "\n");
                    }
                }
                localFile.close();
                direcFile.close();

            } finally {
                System.out.println("In finally class");
            }

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");


        int loc=1;
        while (true){
            System.out.println(loc + " --> " + locations.get(loc).getDescription());
            if(loc==0){
                break;
            }
            Map<String, Integer> exists = locations.get(loc).getExist();

            System.out.println("Available exists are ");

            for(String exit: exists.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();

            if(direction.length() > 1){
                String[] words = direction.split(" ");
                for(String word: words){
                    if(vocabulary.containsKey(word)){
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if(exists.containsKey(direction)){
                loc = exists.get(direction);
            } else{
                System.out.println("You cannot go to that direction");
            }

        }
        /*
        Scanner sc = null;
        try{
            sc = new Scanner(new BufferedReader(new FileReader("directionTest.txt")));
            sc.useDelimiter(" , ");
            while (sc.hasNext()){
                int loc1 = sc.nextInt();
                sc.skip(sc.delimiter());
                String direc = sc.next();
                sc.skip(sc.delimiter());
                String des = sc.nextLine();
                System.out.println("Imported sucessfully");
                System.out.println("loc --> " + loc1 + " , direction --> " + direc + " , destination --> " + Integer.parseInt(des));
                System.out.println("desc --> " + direc);
                Location location = locations.get(loc1);
                //locations.put(loc1, location);
                location.addExit(direc, Integer.parseInt(des));
            }



        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }


        for (Map.Entry<Integer, Location> location:locations.entrySet()){

            System.out.println(location.getKey() + " " + location.getValue().getLocationId() + " " + location.getValue().getDescription());


        }

*/
    }
}
