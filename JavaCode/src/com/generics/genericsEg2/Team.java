package com.generics.genericsEg2;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{

    private String name;
    int played=0, won=0, lost=0, tied=0;

    //Changing Player to T i.e Team type i.e making class generic
    private ArrayList<T> myPlayer = new ArrayList<>();


    public Team(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }



    public int numPlayers(){
        return myPlayer.size();
    }

    //If we extend Type "T" with Player no need to type cast (Player)player).getName()
    public boolean addPlayer(T player){
        if(myPlayer.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else{
            myPlayer.add(player);
            System.out.println(player.getName() + " has been added");
            return true;
        }
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            won++;
            message = " beat with score " + won;
        } else if(ourScore == theirScore) {
            tied++;
            message = " tied with score " + tied;
        } else{
            lost++;
            message = " lost with score " + lost;
        }
        played++;

        if(opponent!=null){
            System.out.println(this.getName() + message + "  " + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won*2) + tied;
    }


    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        } else if(this.ranking() < team.ranking()){
            return 1;
        }else {
            return 0;
        }
    }
}
