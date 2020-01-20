package com.javaExceptionsEg;

import java.io.FileWriter;
import java.io.IOException;

public class TestEg {

    Locations locations = new Locations();

    public void readData() throws IOException {
        FileWriter localFile = null;


        try (FileWriter local = new FileWriter("loc.txt")) {
            for (Location lo : locations.values()) {
                local.write(lo.getDescription() + " " + lo.getLocationId());
            }
        }

        try {
            localFile = new FileWriter("locationsTest.txt");
            for (Location location : locations.values()) {
                localFile.write(location.getDescription() + " " + location.getLocationId() + "\n");
            }
            localFile.close();

        } finally {
            System.out.println("In finally class");
        }
    }


}
