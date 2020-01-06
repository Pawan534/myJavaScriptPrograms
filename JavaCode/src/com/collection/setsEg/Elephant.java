package com.collection.setsEg;

import com.abstractJava.Dog;

import java.util.Objects;

public class Elephant {

    private final String name;

    public Elephant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;
        if(obj instanceof Elephant){
            String objName = ((Elephant)obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }

}
