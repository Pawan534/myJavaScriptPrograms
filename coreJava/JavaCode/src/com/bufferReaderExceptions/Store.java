package com.bufferReaderExceptions;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private final int storeID;
    private final String storeDescription;

    private final Map<Integer, String> addStore = new HashMap<>();

    public Store(){
        this.storeID = 0;
        this.storeDescription = null;
    }
    public Store(int storeID, String description) {
        this.storeID = storeID;
        this.storeDescription = description;
    }


    public Map<Integer, String> addStoreDetails(int storeID, String description){
        addStore.put(storeID, description);
        return this.addStore;
    }

    public int getstoreID() {
        return storeID;
    }

    public String getDescription() {
        return storeDescription;
    }


    public static Store getInstance(){
        System.out.println("My New instance is created");
        return new Store();
    }
}