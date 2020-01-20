package com.collection.setsEg;

import com.oops.allConcepts.HealthyBurger;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

    private final String name;
    private final double orbintalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbintalPeriod) {
        this.name = name;
        this.orbintalPeriod = orbintalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbintalPeriod() {
        return orbintalPeriod;
    }

    // instead of sending satellites, we are creating new hashSet
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addMoon(HeavenlyBody heavenlyBody){
        return this.satellites.add(heavenlyBody);
    }



    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if(obj == null || (this.getClass()!=obj.getClass())){
            return false;
        }
        String objName = ((HeavenlyBody)obj).getName();
        return this.name.equals(objName);
    }


    @Override
    public int hashCode(){
        System.out.println("Hash code called");
        return this.name.hashCode() + 12;
    }




}
