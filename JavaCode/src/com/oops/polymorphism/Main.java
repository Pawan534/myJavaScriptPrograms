package com.oops.polymorphism;


class Movie{
    private String name;
    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName(){
        return this.name;
    }
}


class Jaws extends Movie{

    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A Sharks eats lots of people";
    }
}


class Independence extends Movie{

    public Independence(){
        super("Independence");
    }


    public String plot(){
        return "Aliens attempt to take over planet earth";
    }
}


class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }


    public String plot(){
        return "Kids try to escape a maze";
    }
}

class Forgetable extends Movie{

    public Forgetable(){
        super("Forgetable");
    }
}


public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
            Movie movie = randomMoive();
            System.out.println("Movie# " + i + " : " + movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMoive(){
        int randomNumber = (int)(Math.random()*4 + 1);
        System.out.println("Random number generated as: " + randomNumber);
        switch (randomNumber){
            case 1: return new Jaws();
            case 2: return new Independence();
            case 3: return new MazeRunner();
            case 4: return new Forgetable();
        }
        return null;
    }
}

