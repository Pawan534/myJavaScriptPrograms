package com.collection.setsEg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    public static void main(String[] args) {

        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 350);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);


        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars", 400);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("IO", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);


        tempMoon = new HeavenlyBody("Ganymede", 7.2);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);




        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);


        temp = new HeavenlyBody("Uranus", 30759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);


        temp = new HeavenlyBody("Neptuone", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);


        System.out.println("Planets");

        for(HeavenlyBody planets: planets){
            System.out.println("\t" + planets.getName());
        }

        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());

        for (HeavenlyBody jupiterMoon: body.getSatellites()){
            System.out.println("\t" + jupiterMoon.getName());
        }

        Set<HeavenlyBody> planetsData = new HashSet<>();
        Set<HeavenlyBody> planetsDataTest = new HashSet<>();
        for(HeavenlyBody planets: planets){
            planetsData.addAll(planets.getSatellites());
            planetsDataTest.addAll(planets.getSatellites());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 300);
        planetsData.add(pluto);
        for(HeavenlyBody moon: planets){
            System.out.println(moon.getName() + " " + moon.getOrbintalPeriod());
        }

        System.out.println(planetsData.size());

        System.out.println(temp.equals(pluto));
        Object o = new Object();
        Object o1 = o;
        System.out.println(o.equals(o1));;
    }
}
