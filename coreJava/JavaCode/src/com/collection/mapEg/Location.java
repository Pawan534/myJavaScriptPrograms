package com.collection.mapEg;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationId;
    private final String description;

    private final Map<String, Integer> exist = new HashMap<>();

    public Location(int locationId, String description) {
        this.locationId = locationId;
        this.description = description;
    }


    public void addExit(String direction, int location){
        exist.put(direction, location);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExist() {
        return new HashMap<>(exist);
    }
}
